package br.com.tensorflow;

import static br.com.tensorflow.Config.GRAPH_FILE;
import static br.com.tensorflow.Config.LABEL_FILE;
import java.nio.FloatBuffer;
import java.util.List;
import org.tensorflow.Graph;
import org.tensorflow.Output;
import org.tensorflow.Session;
import org.tensorflow.Tensor;
import static br.com.tensorflow.Config.MEAN;
import static br.com.tensorflow.Config.SIZE;

public class ObjectDetector {

    private byte[] GRAPH_DEF;
    private List<String> LABELS;

    public ObjectDetector() {
        try {
            GRAPH_DEF = IOUtil.readAllBytesOrExit(GRAPH_FILE);
            LABELS = IOUtil.readAllLinesOrExit(LABEL_FILE);
        } catch (ServiceException ex) {
            System.err.println(ex);
        }
    }

    public void detect(final String imageLocation) {
        byte[] image = IOUtil.readAllBytesOrExit(imageLocation);

        Tensor<Float> normalizedImage = normalizeImage(image);
        float[] executeYOLOGraph = executeYOLOGraph(normalizedImage);
        List<Recognition> recognitions = YOLOClassifier.getInstance().classifyImage(executeYOLOGraph, LABELS);
        printToConsole(recognitions);
        ImageUtil.getInstance().labelImage(image, recognitions, IOUtil.getFileName(imageLocation));

    }

    private Tensor<Float> normalizeImage(final byte[] imageBytes) {
        try ( Graph graph = new Graph()) {
            GraphBuilder graphBuilder = new GraphBuilder(graph);

            final Output<Float> output
                    = graphBuilder.div( // Divide each pixels with the MEAN
                            graphBuilder.resizeBilinear( // Resize using bilinear interpolation
                                    graphBuilder.expandDims( // Increase the output tensors dimension
                                            graphBuilder.cast( // Cast the output to Float
                                                    graphBuilder.decodeJpeg(
                                                            graphBuilder.constant("input", imageBytes), 3),
                                                    Float.class),
                                            graphBuilder.constant("make_batch", 0)),
                                    graphBuilder.constant("size", new int[]{SIZE, SIZE})),
                            graphBuilder.constant("scale", MEAN));

            try ( Session session = new Session(graph)) {
                return session.runner().fetch(output.op().name()).run().get(0).expect(Float.class);
            }
        }
    }

    private float[] executeYOLOGraph(final Tensor<Float> image) {
        Graph graph = new Graph();
        graph.importGraphDef(GRAPH_DEF);
        try ( Session s = new Session(graph);  Tensor<Float> result = s.runner().feed("input", image).fetch("output").run().get(0).expect(Float.class)) {
            float[] outputTensor = new float[YOLOClassifier.getInstance().getOutputSizeByShape(result)];
            FloatBuffer floatBuffer = FloatBuffer.wrap(outputTensor);
            result.writeTo(floatBuffer);
            return outputTensor;
        }

    }

    private void printToConsole(final List<Recognition> recognitions) {
        for (Recognition recognition : recognitions) {
            System.out.println("Object: {} - confidence: {}" + recognition.getTitle() + recognition.getConfidence());
        }
    }

}

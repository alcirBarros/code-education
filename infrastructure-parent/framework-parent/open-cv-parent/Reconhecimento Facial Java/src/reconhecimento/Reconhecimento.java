package reconhecimento;

import org.bytedeco.javacpp.DoublePointer;
import org.bytedeco.javacpp.IntPointer;
import static org.bytedeco.javacpp.opencv_core.FONT_HERSHEY_PLAIN;
import org.bytedeco.javacpp.opencv_core.Mat;
import org.bytedeco.javacpp.opencv_core.Point;
import org.bytedeco.javacpp.opencv_core.Rect;
import org.bytedeco.javacpp.opencv_core.RectVector;
import org.bytedeco.javacpp.opencv_core.Scalar;
import org.bytedeco.javacpp.opencv_core.Size;
import org.bytedeco.javacpp.opencv_face;
import org.bytedeco.javacpp.opencv_face.FaceRecognizer;
import static org.bytedeco.javacpp.opencv_face.createEigenFaceRecognizer;
import static org.bytedeco.javacpp.opencv_face.createFisherFaceRecognizer;
import static org.bytedeco.javacpp.opencv_face.createLBPHFaceRecognizer;

import static org.bytedeco.javacpp.opencv_imgproc.COLOR_BGRA2GRAY;
import static org.bytedeco.javacpp.opencv_imgproc.cvtColor;
import static org.bytedeco.javacpp.opencv_imgproc.putText;
import static org.bytedeco.javacpp.opencv_imgproc.rectangle;
import static org.bytedeco.javacpp.opencv_imgproc.resize;
import org.bytedeco.javacpp.opencv_objdetect.CascadeClassifier;
import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.javacv.OpenCVFrameGrabber;


public class Reconhecimento {

    public static void main(String args[]) throws FrameGrabber.Exception {
        OpenCVFrameConverter.ToMat converteMat = new OpenCVFrameConverter.ToMat();
        OpenCVFrameGrabber camera = new OpenCVFrameGrabber(0);
        String[] pessoas = {"", "Alci", "Wever", "Milenna", "","Felicio"};
        camera.start();

        CascadeClassifier detectorFace = new CascadeClassifier("src/recursos/haarcascade_frontalface_alt.xml");

//        FaceRecognizer reconhecedor = createEigenFaceRecognizer();
//        reconhecedor.load("src/recursos/classificadorEigenFaces.yml");
//        reconhecedor.setThreshold(5000);

//        FaceRecognizer reconhecedor = createFisherFaceRecognizer();
//        reconhecedor.load("src/recursos/classificadorFisherFaces.yml");
//        reconhecedor.setThreshold(1000);
        
        
        FaceRecognizer reconhecedor = createLBPHFaceRecognizer();
        reconhecedor.load("src/recursos/classificadorLBPH.yml");
        reconhecedor.setThreshold(80);
        
        CanvasFrame cFrame = new CanvasFrame("Reconhecimento", CanvasFrame.getDefaultGamma() / camera.getGamma());
        Frame frameCapturado = null;
        Mat imagemColorida = new Mat();

        while ((frameCapturado = camera.grab()) != null) {
            imagemColorida = converteMat.convert(frameCapturado);
            Mat imagemCinza = new Mat();
            cvtColor(imagemColorida, imagemCinza, COLOR_BGRA2GRAY);
            RectVector facesDetectadas = new RectVector();
            detectorFace.detectMultiScale(imagemCinza, facesDetectadas, 1.1, 2, 0, new Size(100, 100), new Size(500, 500));
            for (int i = 0; i < facesDetectadas.size(); i++) {
                Rect dadosFace = facesDetectadas.get(i);
                rectangle(imagemColorida, dadosFace, new Scalar(0, 255, 0, 0));
                Mat faceCapturada = new Mat(imagemCinza, dadosFace);
                resize(faceCapturada, faceCapturada, new Size(160, 160));

                IntPointer rotulo = new IntPointer(1);
                DoublePointer confianca = new DoublePointer(1);
                try {
                    reconhecedor.predict(faceCapturada, rotulo, confianca);
                    int predicao = rotulo.get();
                    long capacity = rotulo.capacity();
                    System.out.println(capacity);
                    String nome;
                    if (predicao == -1) {
                        nome = "Desconhecido" + " - " + confianca.get(0);
                    } else {
                        nome = pessoas[predicao] + " - " + confianca.get(0);
                    }
//                
                    int x = Math.max(dadosFace.tl().x() - 10, 0);
                    int y = Math.max(dadosFace.tl().y() - 10, 0);
                    putText(imagemColorida, nome, new Point(x, y), FONT_HERSHEY_PLAIN, 1.4, new Scalar(0, 255, 0, 0));
                } catch (Exception e) {
                }

            }
            if (cFrame.isVisible()) {
                cFrame.showImage(frameCapturado);
            }
        }
        cFrame.dispose();
        camera.stop();
    }
}

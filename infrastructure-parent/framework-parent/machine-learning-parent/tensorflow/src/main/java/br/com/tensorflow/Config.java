package br.com.tensorflow;

public interface Config {

    String GRAPH_FILE = "/YOLO/yolo-voc.pb";
    String LABEL_FILE = "/YOLO/yolo-voc-labels.txt";

    // Params used for image processing
    int SIZE = 416;
    float MEAN = 255f;

    // Output directory
    String OUTPUT_DIR = "./sample";
}

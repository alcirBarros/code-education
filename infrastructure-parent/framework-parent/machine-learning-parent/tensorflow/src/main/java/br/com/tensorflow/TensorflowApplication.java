package br.com.tensorflow;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tensorflow.Graph;
import org.tensorflow.Session;
import org.tensorflow.Tensor;
import org.tensorflow.TensorFlow;

@SpringBootApplication
public class TensorflowApplication implements CommandLineRunner {

    private final static String IMAGE = "/image/imagem.jpg";

    public static void main(String[] args) {
        SpringApplication.run(TensorflowApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        ObjectDetector objectDetector = new ObjectDetector();
        objectDetector.detect(IMAGE);
    }

}

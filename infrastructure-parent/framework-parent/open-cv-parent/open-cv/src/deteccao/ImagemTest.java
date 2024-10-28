package deteccao;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import static org.opencv.imgcodecs.Imgcodecs.imread;
import org.opencv.imgproc.Imgproc;

public class ImagemTest {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        System.out.println(Core.VERSION);
        Mat imagemColorida = imread("src/deteccao/opencv-java.jpg", Imgcodecs.CV_LOAD_IMAGE_COLOR);
        Utilitarios utilitarios = new Utilitarios();

        utilitarios.mostraImagem(utilitarios.convertMatToImage(imagemColorida));

        Mat imagemCinza = new Mat();
        Imgproc.cvtColor(imagemColorida, imagemCinza, Imgproc.COLOR_BGR2GRAY);

        utilitarios.mostraImagem(utilitarios.convertMatToImage(imagemCinza));
    }
}

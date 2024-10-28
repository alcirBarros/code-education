package deteccao;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import static org.opencv.imgcodecs.Imgcodecs.imread;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

public class ExemploGatos {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        Mat imagemColorida = imread("src/outros/gato3.jpg");
        Utilitarios utilitarios = new Utilitarios();

        Mat imagemCinza = new Mat();
        Imgproc.cvtColor(imagemColorida, imagemCinza, Imgproc.COLOR_BGR2GRAY);

        CascadeClassifier cascadeClassifier = new CascadeClassifier("src/cascades/haarcascade_frontalcatface.xml");

        MatOfRect facesDetectadas = new MatOfRect();
        cascadeClassifier.detectMultiScale(imagemCinza, facesDetectadas, 1.1, 1, 3, new Size(30, 30), new Size(500, 500));
        System.out.println(facesDetectadas.toArray().length);


        
        for (Rect rect : facesDetectadas.toList()) {
            System.out.println(rect.x + " " + rect.y + " " + rect.width + " " + rect.height);

            
            Imgproc.rectangle(imagemColorida, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0, 0, 255), 2);
        }

        utilitarios.mostraImagem(utilitarios.convertMatToImage(imagemColorida));

    }
}

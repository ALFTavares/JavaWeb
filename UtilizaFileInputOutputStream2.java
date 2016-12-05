import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by bob on 9/14/16.
 */
public class UtilizaFileInputOutputStream2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Letras1.txt");
            FileOutputStream fos = new FileOutputStream("Letras2.txt");

            int conteudo;
            while ((conteudo = fis.read()) != -1)
                fos.write(conteudo);

            fis.close();
            fos.close();
        } catch (IOException ioe) {
            System.out.println("Erro!");
        }
    }
}
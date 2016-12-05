import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by bob on 9/14/16.
 */
public class UtilizaFileInputOutputStream3 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("imagem1.jpg");
            FileOutputStream fos = new FileOutputStream("imagem2.jpg");

            int conteudo;

            while ((conteudo = fis.read()) != -1)
                fos.write(conteudo);

            fis.close();
            fos.close();
        }
        catch (IOException ioe){
            System.out.println("Erro!");
        }
    }
}
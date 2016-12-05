import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 * Created by bob on 9/14/16.
 */
public class UtilizaSequenceInputStream {
    public static void main(String[] args) {
        try{
            FileInputStream fis1 = new FileInputStream("int1.txt");
            FileInputStream fis2 = new FileInputStream("int2.txt");
            FileOutputStream fos = new FileOutputStream("int1e2.txt");

            SequenceInputStream sif = new SequenceInputStream(fis1, fis2);

            int conteudo;

            while ((conteudo = sif.read()) != -1)
                fos.write(conteudo);

            sif.close();
            fos.close();
        }catch(IOException ioe){
            System.out.println("Erro");
        }
    }
}

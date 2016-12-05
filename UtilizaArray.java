import java.util.Scanner;
/**
 * Created by bob on 9/14/16.
 */
public class UtilizaArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] vector = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduza o " + (i + 1) + "º nome: ");
            vector[i] = s.nextLine();
        }
        try {
            System.out.println(vector[3]);
        } catch(ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Array só contem indice do 0 ao 2");
        }
    }
}

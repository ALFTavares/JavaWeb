import javax.swing.*;

/**
 * Created by bob on 9/14/16.
 */
public class ConverteString {
    public static void main(String[] args) {
        String x = "123abc";
        int y = 0;

        try {
            y = Integer.parseInt(x);
        } catch (NumberFormatException nfe){
            System.out.println("Introduza só inteiros");
        } finally {
            System.out.println(y);
        }
    }
}

import javax.swing.*;

/**
 * Created by bob on 9/2/16.
 */
public class UsaJOPShowInputDialog {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Escreva o seu nome");
        System.out.println("O nome inserido foi: "+ nome);
    }
}

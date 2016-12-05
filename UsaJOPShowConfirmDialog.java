import javax.swing.*;

/**
 * Created by bob on 9/2/16.
 */
public class UsaJOPShowConfirmDialog {
    public static void main(String[] args) {
        int opcaoEscolhida = JOptionPane.showConfirmDialog(null, "Deseja guardar alterações?");
        System.out.println("A opção escolhida foi: " + opcaoEscolhida);
    }
}

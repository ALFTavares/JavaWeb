import javax.swing.*;

/**
 * Created by bob on 9/2/16.
 */
public class UsaJOPShowOptionDialog {
    public static void main(String[] args) {
        String[] tiposLigacao = {"Wireless", "ADSL", "Fibra Óptica"};
        int opcaoEscolhida = JOptionPane.showOptionDialog(null, "Escolha uma das ligações:", "Tipos de Ligação",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tiposLigacao, "Wireless");
        System.out.println("A opção escolhida foi: " + opcaoEscolhida);
    }
}

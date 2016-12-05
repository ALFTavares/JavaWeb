import javax.swing.*;

/**
 * Created by bob on 9/2/16.
 */
public class UsaJLabel {
    public static void main(String[] args) {
        JFrame janela = new JFrame();

        janela.setTitle("JLabel");
        janela.setSize(350, 150);
        janela.setLocation(50, 50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel rotulo = new JLabel("Escreva o seu nome");
        janela.add(rotulo);
        janela.setVisible(true);
    }
}

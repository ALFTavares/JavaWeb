import javax.swing.*;

/**
 * Created by bob on 9/2/16.
 */
public class UsaJButton {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("JButton");
        janela.setSize(350, 150);
        janela.setLocation(50, 50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton botao = new JButton("OK");

        janela.add(botao);
        janela.setVisible(true);
    }
}

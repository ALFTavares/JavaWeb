import javax.swing.*;

/**
 * Created by bob on 9/2/16.
 */
public class UsaJPanel {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("JPanel");
        janela.setSize(350, 150);
        janela.setLocation(50, 50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        janela.add(painel);
        janela.setVisible(true);
    }
}

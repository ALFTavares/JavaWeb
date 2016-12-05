import javax.swing.*;
import java.awt.*;

/**
 * Created by bob on 9/2/16.
 */
public class UsaJTextField {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("JTextField");
        janela.setSize(350, 150);
        janela.setLocation(50, 50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.setLayout(new FlowLayout());

        JLabel rotulo = new JLabel("Escreva o seu nome: ");
        JTextField caixaTexto = new JTextField(10);
        janela.add(rotulo);
        janela.add(caixaTexto);
        janela.setVisible(true);
    }
}

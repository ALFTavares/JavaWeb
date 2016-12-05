import javax.swing.*;
import java.awt.*;

/**
 * Created by bob on 9/5/16.
 */
public class UtilizaFlowLayout {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("FlowLayout");
        janela.setSize(350, 150);
        janela.setLocation(50, 50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.setLayout(new FlowLayout());

        JLabel rotulo = new JLabel("Escreva o seu nome: ");
        JTextField caixaTexto = new JTextField(10);
        JButton botao = new JButton("OK");

        janela.add(rotulo);
        janela.add(caixaTexto);
        janela.add(botao);

        janela.setVisible(true);
    }
}

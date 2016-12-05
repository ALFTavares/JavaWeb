import javax.swing.*;
import java.awt.*;

/**
 * Created by bob on 9/2/16.
 */
public class UsaJComboBox {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("JComboBox");
        janela.setSize(350, 150);
        janela.setLocation(50, 50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.setLayout(new FlowLayout());

        JLabel rotulo = new JLabel("Seleccione uma cor: ");
        JComboBox caixaCombinacao = new JComboBox();
        caixaCombinacao.addItem("Branco");
        caixaCombinacao.addItem("Preto");
        caixaCombinacao.addItem("Amarelo");

        janela.add(rotulo);
        janela.add(caixaCombinacao);
        janela.setVisible(true);
    }
}

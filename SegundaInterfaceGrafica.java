import javax.swing.*;
import java.awt.*;

/**
 * Created by bob on 9/5/16.
 */
public class SegundaInterfaceGrafica {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Segunda Interface Grafica");
        janela.setSize(150, 150);
        janela.setLocation(50, 50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.setLayout(new GridLayout(5, 1));

        JLabel nome = new JLabel("Nome: ");
        JTextField texto = new JTextField(10);
        JLabel hl = new JLabel("Habilitações Literárias");
        JComboBox caixa = new JComboBox();
        caixa.addItem("Licenciatura");
        caixa.addItem("Mestrado");
        caixa.addItem("Doutoramento");
        JButton botao = new JButton("Submeter");

        janela.add(nome);
        janela.add(texto);
        janela.add(hl);
        janela.add(caixa);
        janela.add(botao);
        janela.setVisible(true);
    }
}

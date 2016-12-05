import javax.swing.*;
import java.awt.*;

/**
 * Created by bob on 9/5/16.
 */
public class PrimeiraInterfaceGrafica {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Primeira Interface Grafica");
        janela.setSize(500, 100);
        janela.setLocation(50, 50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.setLayout(new FlowLayout());

        JLabel nome = new JLabel("Nome: ");
        JLabel habilitacoes = new JLabel("Habilitações Literárias: ");
        JTextField escrita = new JTextField(10);
        JComboBox coisas = new JComboBox();
        coisas.addItem("Licenciatura");
        coisas.addItem("Mestrado");
        coisas.addItem("Doutoramento");
        JButton botao = new JButton("Submeter");

        janela.add(nome);
        janela.add(escrita);
        janela.add(habilitacoes);
        janela.add(coisas);
        janela.add(botao);
        janela.setVisible(true);

    }
}

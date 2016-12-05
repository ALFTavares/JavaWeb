import javax.swing.*;
import java.awt.*;

/**
 * Created by bob on 9/5/16.
 */
public class QuintaInterfaceGrafica {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("QuintaInterfaceGrafica");
        janela.setSize(400, 125);
        janela.setLocation(50, 50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.setLayout(new GridLayout(3, 2));

        JLabel nome = new JLabel("Nome: ");
        JTextField texto = new JTextField(10);
        JLabel hobbies = new JLabel("Hobbies: ");

        JPanel caixas = new JPanel();
        caixas.setLayout(new GridLayout(2, 2));
        JCheckBox botao1 = new JCheckBox("Ler");
        JCheckBox botao2 = new JCheckBox("Escrever");
        JCheckBox botao3 = new JCheckBox("Fotografar");
        JCheckBox botao4 = new JCheckBox("Filmar");
        caixas.add(botao1);
        caixas.add(botao2);
        caixas.add(botao3);
        caixas.add(botao4);

        JButton botao = new JButton("Submeter");

        janela.add(nome);
        janela.add(texto);
        janela.add(hobbies);
        janela.add(caixas);
        janela.add(botao);
        janela.setVisible(true);
    }
}

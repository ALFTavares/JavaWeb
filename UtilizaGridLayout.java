import javax.swing.*;
import java.awt.*;

/**
 * Created by bob on 9/5/16.
 */
public class UtilizaGridLayout {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("GridLayout");
        janela.setSize(350, 150);
        janela.setLocation(50, 50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new GridLayout(3, 2));

        JLabel rotulo1 = new JLabel("Escreva o nome de um fruto: ");
        JTextField caixaTexto = new JTextField(10);
        JLabel rotulo2 = new JLabel("Seleccione uma bebida: ");
        JComboBox caixaCombinacao = new JComboBox();
        caixaCombinacao.addItem("Água");
        caixaCombinacao.addItem("Leite");
        caixaCombinacao.addItem("Vinho");
        JButton botao = new JButton("OK");

        janela.add(rotulo1);
        janela.add(caixaTexto);
        janela.add(rotulo2);
        janela.add(caixaCombinacao);
        janela.add(botao);
        janela.setVisible(true);
    }
}

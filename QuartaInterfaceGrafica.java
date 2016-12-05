import javax.swing.*;
import java.awt.*;

/**
 * Created by bob on 9/5/16.
 */
public class QuartaInterfaceGrafica {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Quarta Interface Grafica");
        janela.setSize(250, 125);
        janela.setLocation(50, 50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.setLayout(new BorderLayout());
        //janela.setLayout(new FlowLayout());

        JPanel painel1 = new JPanel();
        JLabel nome = new JLabel("Nome: ");
        JTextField texto = new JTextField(10);
        painel1.setLayout(new BoxLayout(painel1, BoxLayout.X_AXIS));
        painel1.add(nome);
        painel1.add(texto);
        painel1.setLayout(new FlowLayout());

        JPanel painel2 = new JPanel();
        JLabel gen = new JLabel("Género: ");
        JRadioButton fem = new JRadioButton("Feminino");
        JRadioButton masc = new JRadioButton("Masculino");
        painel2.setLayout(new BoxLayout(painel2, BoxLayout.X_AXIS));
        painel2.add(gen);
        painel2.add(fem);
        painel2.add(masc);

        JButton botao = new JButton("Submeter");
        JPanel painel3 = new JPanel();
        painel3.setLayout(new BoxLayout(painel3, BoxLayout.X_AXIS));
        painel3.add(botao);

        janela.add("North", painel1);
        janela.add("Center", painel2);
        janela.add("South", botao);
        janela.setVisible(true);
    }
}

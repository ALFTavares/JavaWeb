import javax.swing.*;
import java.awt.*;

/**
 * Created by bob on 9/5/16.
 */
public class TerceiraInterfaceGrafica {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Terceira Interface Grafica");
        janela.setSize(200, 125);
        janela.setLocation(50, 50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.setLayout(new BorderLayout());

        JLabel sg = new JLabel("Seleccione o género");
        JRadioButton fem = new JRadioButton("Feminino");
        JRadioButton masc = new JRadioButton("Masculino");
        JButton botao = new JButton("Submeter");

        janela.add("North", sg);
        janela.add("West", fem);
        janela.add("East", masc);
        janela.add("South", botao);
        janela.setVisible(true);
    }
}

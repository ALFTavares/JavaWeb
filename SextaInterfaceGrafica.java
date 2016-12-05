import javax.swing.*;
import java.awt.*;

/**
 * Created by bob on 9/5/16.
 */
public class SextaInterfaceGrafica {
    public static void main(String[] args) {

        Object[][] tabelas = {
                {new String(""), new String("")},
                {new String(""), new String("")},
                {new String(""), new String("")},
                {new String(""), new String("")},
        };

        String[] titulos = {"A", "B"};

        JFrame janela = new JFrame();
        janela.setTitle("Sexta Interface Grafica");
        janela.setSize(300, 260);
        janela.setLocation(50, 50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        JTextField texto1 = new JTextField(5);
        JTextField texto2 = new JTextField(5);

        JTable tabela = new JTable(4, 2);
        JScrollPane rolamento = new JScrollPane(tabela);
        tabela.setPreferredScrollableViewportSize(new Dimension(300, 100));


        painel.add(new JLabel(" "));
        painel.add(texto1);
        painel.add(new JLabel(" "));
        painel.add(texto2);
        painel.add(new JLabel(" "));
        painel.add(rolamento);

        janela.add(painel);
        janela.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;

/**
 * Created by bob on 9/2/16.
 */
public class UsaJTextArea {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("JTextArea");
        janela.setSize(350, 150);
        janela.setLocation(50, 50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.setLayout(new FlowLayout());

        JLabel rotulo = new JLabel("Observações: ");
        JTextArea areaTexto = new JTextArea();

        areaTexto.setLineWrap(true);

        JScrollPane arearRolamento = new JScrollPane(areaTexto);
        arearRolamento.setPreferredSize(new Dimension(325, 80));

        janela.add(rotulo);
        janela.add(arearRolamento);
        janela.setVisible(true);
    }
}

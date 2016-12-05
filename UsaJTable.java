import javax.swing.*;
import java.awt.*;

/**
 * Created by bob on 9/2/16.
 */
public class UsaJTable {
    public static void main(String[] args) {
        Object[][] produtos = {
                {new Integer(1), "lápis", "Lápis & Co."},
                {new Integer(2), "canetas", "Canetas & Canetas"},
                {new Integer(3), "caderno", "Cadernos e outros"},
        };

        String[] titulos = {"Código", "Produto", "Fornecedor"};

        JFrame janela = new JFrame();
        janela.setTitle("JTable");
        janela.setSize(350, 150);
        janela.setLocation(50, 50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable tabela = new JTable(produtos, titulos);
        JScrollPane areaRolamento = new JScrollPane(tabela);
        tabela.setPreferredScrollableViewportSize(new Dimension(325, 80));

        janela.add(areaRolamento);
        janela.setVisible(true);
    }
}

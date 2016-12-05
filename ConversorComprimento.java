import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by bob on 9/9/16.
 */
public class ConversorComprimento extends JFrame{
    JLabel valor = new JLabel("Valor a converter");
    JTextField texto = new JTextField(10);
    JRadioButton met = new JRadioButton("metros-milhas");
    JRadioButton mil = new JRadioButton("milhas-metros");
    ButtonGroup botoes = new ButtonGroup();
    JPanel painel1 = new JPanel();
    JPanel painel2 = new JPanel();

    private ConversorComprimento(){
        setTitle("Conversor comprimento");
        setSize(270, 100);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        setVisible(true);

        painel1.setLayout(new FlowLayout());
        painel1.add(valor);
        painel1.add(texto);

        painel2.setLayout(new FlowLayout());
        painel2.add(met);
        painel2.add(mil);

        botoes.add(met);
        botoes.add(mil);

        add(painel1);
        add(painel2);

        met.addItemListener(new metbotao());
        mil.addItemListener(new metbotao());
    }

    public static void main(String[] args) {
        new ConversorComprimento();
    }
        private class metbotao implements ItemListener{
            public void itemStateChanged(ItemEvent ev){
                double res = 0;
                String msg;
                //0.000621
                if (met.isSelected()) {
                    res = Double.parseDouble(texto.getText()) * 0.000621;
                    msg = Double.toString(res);
                    JOptionPane.showMessageDialog(null, msg);
                }
                else if (mil.isSelected()){
                    res = Double.parseDouble(texto.getText()) / 0.000621;
                    msg = Double.toString(res);
                    JOptionPane.showMessageDialog(null, msg);
                }
            }
        }
}

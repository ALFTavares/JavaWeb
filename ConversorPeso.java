import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by bob on 9/9/16.
 */
public class ConversorPeso extends JFrame{
    JLabel valor = new JLabel("Valor a Converter");
    JTextField peso = new JTextField();
    JLabel tipo = new JLabel("Tipo de Conversão");
    JComboBox escolha = new JComboBox();
    JLabel resultado = new JLabel("Resultado");
    JLabel res = new JLabel();

    private ConversorPeso(){
        setTitle("Conversor Peso");
        setSize(350, 150);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));
        setVisible(true);

        escolha.addItem("Escolha a conversão");
        escolha.addItem("gramas-onças");
        escolha.addItem("onças-gramas");

        add(valor);
        add(peso);
        add(tipo);
        add(escolha);
        add(resultado);
        add(res);

        escolha.addItemListener(new botao());
    }

    public static void main(String[] args) {
        new ConversorPeso();
    }

    private class botao implements ItemListener{
        public void itemStateChanged(ItemEvent ev){
            double result = 0;

            if (escolha.getSelectedItem().equals("gramas-onças")) {
                result = Double.parseDouble(peso.getText()) * 0.0353;
                res.setVisible(true);
                res.setText(result + " o");
            }
            else if (escolha.getSelectedItem().equals("onças-gramas")) {
                result = Double.parseDouble(peso.getText()) / 0.0353;
                res.setVisible(true);
                res.setText(result + " g");
            }
        }
    }
}

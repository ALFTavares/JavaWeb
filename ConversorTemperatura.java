import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bob on 9/9/16.
 */
public class ConversorTemperatura extends JFrame{

    //Declaração de Componentes da Janela
    JLabel tipo = new JLabel("Tipo de Conversão");
    JRadioButton ctof = new JRadioButton("ºC_ºF");
    JRadioButton ftoc = new JRadioButton("ºF_ºC");
    JLabel valor = new JLabel("Valor a Converter");
    JTextField texto = new JTextField();
    JButton converter = new JButton("Converter");
    JLabel resultado = new JLabel();

    ButtonGroup botoes = new ButtonGroup();

    JPanel painel = new JPanel();

    //Construtor da Janela
    private ConversorTemperatura(){
        setTitle("Conversor Temperatura");
        setSize(300, 150);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,2));
        setVisible(true);

        painel.setLayout(new FlowLayout());
        painel.add(ctof);
        painel.add(ftoc);
        botoes.add(ctof);
        botoes.add(ftoc);

        add(tipo);
        add(painel);
        add(valor);
        add(texto);
        add(converter);
        add(resultado);

        converter.addActionListener(new Conversor());
    }

    public static void main(String[] args) {
        new ConversorTemperatura();
    }

    private class Conversor implements ActionListener{
        public void actionPerformed(ActionEvent ev) {
            double result = 0;
            String msg = "";

            if (ctof.isSelected()){
                result = Double.parseDouble(texto.getText()) * (9/5) + 32;
                msg = Double.toString(result);
                resultado.setVisible(true);
                resultado.setText(msg);
            }
            else if (ftoc.isSelected()) {
                result = Double.parseDouble(texto.getText()) - 32 * (5 / 9);
                msg = Double.toString(result);
                resultado.setVisible(true);
                resultado.setText(msg);
            }
            else{
                msg = "escolha a conversão";
                JOptionPane.showMessageDialog(null, msg);
            }
        }
    }
}

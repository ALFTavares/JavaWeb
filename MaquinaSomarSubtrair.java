import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by bob on 9/9/16.
 */
public class MaquinaSomarSubtrair extends JFrame {


    //Declara e cria os componentes
    JLabel jlValor1 = new JLabel("Primeiro número");
    JTextField jtfValor1 = new JTextField(5);
    JLabel jlValor2 = new JLabel("Segundo número");
    JTextField jtfValor2 = new JTextField(5);
    JButton jbSomar = new JButton("Somar");
    JButton jbSubtrair = new JButton("Subtrair");

    JLabel jlResultado = new JLabel("Resultado");
    JLabel rotulo = new JLabel();


    //Construtor
    private MaquinaSomarSubtrair() {
        setTitle("Máquina de Somar e Subtrair");
        setSize(300, 150);
        setLocation(50, 50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));
        setVisible(true);

        add(jlValor1);
        add(jtfValor1);
        add(jlValor2);
        add(jtfValor2);
        add(jbSomar);
        add(jbSubtrair);
        add(jlResultado);
        add(rotulo);


        jbSomar.addActionListener(new EventoJButton());
        jbSubtrair.addActionListener(new SubtrairJButton());

    }

    public static void main(String[] args) {
        new MaquinaSomarSubtrair();
    }

    /*Classe interna que implementa os métodos da interface ActionListener*/
    private class EventoJButton implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            double resultadoDouble = 0;
            //String resultadoString ="";

            resultadoDouble = Double.parseDouble(jtfValor1.getText()) + Double.parseDouble(jtfValor2.getText());

            //resultadoString = Double.toString(resultadoDouble);
            //JOptionPane.showMessageDialog(null, resultadoString);//perg 2

            rotulo.setVisible(true);
            rotulo.setText("" + resultadoDouble);

        }
    }

        private class SubtrairJButton implements ActionListener {
            public void actionPerformed(ActionEvent ev) {
                double resultadoDouble = 0;

                resultadoDouble = Double.parseDouble(jtfValor1.getText()) - Double.parseDouble(jtfValor2.getText());

                rotulo.setVisible(true);
                rotulo.setText("" + resultadoDouble);

            }
        }

}

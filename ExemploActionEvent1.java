import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Paulo Meira on 31/08/2016.
 */

//O evento é processado na mesma classe onde o listener se registou
public class ExemploActionEvent1 implements ActionListener{

    JFrame janela = new JFrame("ExemploActionEvent");
    JPanel painel = new JPanel();
    JButton botao1 = new JButton("Botão 1");
    JButton botao2 = new JButton("Botão 2");
    JLabel rotulo = new JLabel();

    public ExemploActionEvent1() {
        janela.setSize(300, 150);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

        painel.add(botao1);
        painel.add(botao2);
        painel.add(rotulo);
        janela.add(painel);


        /*Registo do listener junto dos componentes botao1 e botao2*/
    botao1.addActionListener(this);
    botao2.addActionListener(this);
}

    public static void main(String args[]){
        new ExemploActionEvent1();
    }
        /*O evento é processado na classe onde o listener se registou. Neste caso, a classe "ExemploActionListener1".
        Por este motivo, a classe "ExemploActionListener1" tem de implementar os métodos da interface ActionListener**/

        public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao1) {
            rotulo.setVisible(true);

            rotulo.setText("Carregou no Botão 1!");
        }

        if (e.getSource() == botao2) {
            rotulo.setVisible(false);
            JOptionPane.showMessageDialog(janela, "Carregou no Botão 2!");

        }
    }


    }




import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*Tal como na 2ª versão, o evento é processado numa classe diferente daquela onde o listener se registou. No entanto
ao contrário da classe "ExemploActionListener2", a classe "ExemploActionListener4" estende a classe "JFrame"
   */
public class ExemploActionEvent4 extends JFrame {
    /*Não é necessário criar um contentor JFrame porque a classe
    "ExemploActionEvent4" estende a classe "JFrame"*/

    JPanel painel = new JPanel();
    JButton botao1 = new JButton("Botão 1");
    JButton botao2 = new JButton("Botão 2");
    JLabel rotulo = new JLabel();

    public ExemploActionEvent4() {
        /*Uma vez que a classe "ExemploActionEvent4" estende a classe "JFrame", poder-se-á colocar
        a palavra reservada this atrás dos métodos que definem as características da janela*/

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        painel.add(botao1);
        painel.add(botao2);
        painel.add(rotulo);
        add(painel);


        /*Registo do listener junto dos componentes botao1 e botao2*/
        botao1.addActionListener(new ProcessaBotoes());
        botao2.addActionListener(new ProcessaBotoes());
    }

    public static void main(String args[]) {
        new ExemploActionEvent4();
    }
    /* O evento é processado numa classe diferente daquela onde o listener se registou.
     Neste caso, a classe interna "ProcessaBotoes". Por este motivo, a classe "ProcessaBotoes" tem de implementar
     os métodos da interface "ActionListener"
     */

    private class ProcessaBotoes implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botao1) {
                rotulo.setVisible(true);
                rotulo.setText("Carregou no Botão 1!");
            }

            if (e.getSource() == botao2) {
                rotulo.setVisible(false);
                JOptionPane.showMessageDialog(null, "Carregou no Botão 2!");

            }
        }
    }
}

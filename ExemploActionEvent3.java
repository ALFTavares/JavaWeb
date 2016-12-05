import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//O evento � processado na mesma classe onde o listener se registou. Contudo,
// apresenta como novidade o facto de a classe "ExemploActionListener3" estender a classe "JFrame"

public class ExemploActionEvent3 extends JFrame implements ActionListener {
    /*N�o � necess�rio criar um contentor JFrame porque a classe
    "ExemploActionEvent3" estende a classe "JFrame"*/

    JPanel painel = new JPanel();
    JButton botao1 = new JButton("Bot�o 1");
    JButton botao2 = new JButton("Bot�o 2");
    JLabel rotulo = new JLabel();

    public ExemploActionEvent3() {
        /*Uma vez que a classe "ExemploActionEvent3" estende a classe "JFrame", poder-se-� colocar
        a palavra reservada this atr�s dos m�todos que definem as caracter�sticas da janela*/
        setTitle("ExemploEctionEvent");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        painel.add(botao1);
        painel.add(botao2);
        painel.add(rotulo);
        add(painel);


        /*Registo do listener junto dos componentes botao1 e botao2*/
        botao1.addActionListener(this);
        botao2.addActionListener(this);
    }

    /* O evento � processado na classe onde o listener se registou. Neste caso, a classe
    "ExemploActionListener3". Por este motivo, a classe "ExemploActionListener3" tem de implementar os m�todos
    da interface "ActionListener"
     */
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botao1) {
                rotulo.setVisible(true);
                rotulo.setText("Carregou no Bot�o 1!");
            }

            if (e.getSource() == botao2) {
                rotulo.setVisible(false);
                JOptionPane.showMessageDialog(this, "Carregou no Bot�o 2!");

            }
        }

    public static void main(String args[]) {
        new ExemploActionEvent3();
    }

}








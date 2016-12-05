import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//O evento é processado numa classe diferente daquela onde o listener se registou.
// Neste caso, é uma classe interna denominada "ProcessaBotoes"
public class ExemploActionEvent2 {

    JFrame janela = new JFrame("ExemploActionEvent");
    JPanel painel = new JPanel();
    JButton botao1 = new JButton("Botão 1");
    JButton botao2 = new JButton("Botão 2");
    JLabel rotulo = new JLabel();

    public ExemploActionEvent2() {
        janela.setSize(300, 150);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

        painel.add(botao1);
        painel.add(botao2);
        painel.add(rotulo);
        janela.add(painel);


        /*Registo do listener junto dos componentes botao1 e botao2*/
        botao1.addActionListener(new ProcessaBotoes());
        botao2.addActionListener(new ProcessaBotoes());
    }

    public static void main(String args[]) {
        new ExemploActionEvent2();
    }

        /*O evento é processado numa classe diferente daquela onde o listener se registou. Neste
        caso, a classe interna "ProcessaBotoes".
        Por este motivo, a classe "ProcessaBotoes" tem de implementar os métodos da interface ActionListener*/

    private class ProcessaBotoes implements ActionListener {

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
}







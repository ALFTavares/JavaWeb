import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by bob on 9/13/16.
 */
public class ConversorCapacidade extends JFrame{
    JLabel lg = new JLabel("litros-galões");
    JTextField textolg = new JTextField(20);
    JLabel gl = new JLabel("galões-litros");
    JTextField textogl = new JTextField(20);
    JLabel texto = new JLabel("Introduza o nº na caixa indicada e precione <<ENTER>>");

    JPanel litros = new JPanel();
    JPanel galoes = new JPanel();

    private ConversorCapacidade(){
        setTitle("Conversor Capacidade");
        setSize(400,150);
        setLocation(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,1));
        setVisible(true);

        litros.setLayout(new FlowLayout());
        litros.add(lg);
        litros.add(textolg);

        galoes.setLayout(new FlowLayout());
        galoes.add(gl);
        galoes.add(textogl);

        add(litros);
        add(galoes);
        add(texto);

        textolg.addKeyListener(new metodo());
        textogl.addKeyListener(new metodo());
        textolg.addFocusListener(new metodo());
        textogl.addFocusListener(new metodo());
    }

    public static void main(String[] args) {
        new ConversorCapacidade();
    }

    //1L = 0.22galoes

    private class metodo implements KeyListener, FocusListener{
        public void keyPressed(KeyEvent ev){

            double litgal, gallit;
            String txtlitgal, txtgallit;

            if(ev.getKeyCode() == KeyEvent.VK_ENTER) {
                if (ev.getSource() == textolg) {
                    litgal = Double.parseDouble(textolg.getText()) * 0.22;
                    txtlitgal = Double.toString(litgal);
                    JOptionPane.showMessageDialog(null, txtlitgal);
                }

                if (ev.getSource() == textogl) {
                    gallit = Double.parseDouble(textogl.getText()) / 0.22;
                    txtgallit = Double.toString(gallit);
                    JOptionPane.showMessageDialog(null, txtgallit);
                }
            }
        }

        public void focusGained(FocusEvent ev){
            if(ev.getSource() == textolg)
                textogl.setText("");
            if(ev.getSource() == textogl)
                textolg.setText("");
        }
        public void keyReleased(KeyEvent ev){};
        public void keyTyped(KeyEvent ev){};
        public void focusLost(FocusEvent ev){};

    }
}

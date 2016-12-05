import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by bob on 9/13/16.
 */
public class CalculosCirculo extends JFrame{

    JLabel medida = new JLabel("Medida do raio");
    JTextField texto = new JTextField(5);
    JCheckBox area = new JCheckBox("Área");
    JCheckBox per = new JCheckBox("Perimetro");
    JButton botao = new JButton("Calcular");
    JButton acabar = new JButton("OK");

    JPanel raio = new JPanel();
    JPanel botoes = new JPanel();
    JPanel click = new JPanel();
    JPanel fim = new JPanel();

    private CalculosCirculo(){
        setTitle("Circulo");
        setSize(300,200);
        setLocation(150,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        raio.setLayout(new FlowLayout());
        raio.add(medida);
        raio.add(texto);

        botoes.setLayout(new FlowLayout());
        botoes.add(area);
        botoes.add(per);

        click.setLayout(new FlowLayout());
        click.add(botao);

        setLayout(new GridLayout(3,1));
        add(raio);
        add(botoes);
        add(click);

        botao.addMouseListener(new escolha());
    }


    public static void main(String[] args) {
        new CalculosCirculo();
    }

    private class escolha implements MouseListener{
        public void mouseClicked(MouseEvent ev){
            double a , p;
            String as, ps, msg;

            as = ps = msg = "";
            a = p = 0;

            if (area.isSelected() && !per.isSelected()) {
                a = 2 * 3.14 * Double.parseDouble(texto.getText());
                as = "Area = " + Double.toString(a);
                ps = "";
                msg = "";
            }
            if (per.isSelected() && !area.isSelected()) {
                p = 3.14 * Double.parseDouble(texto.getText()) * Double.parseDouble(texto.getText());
                ps = "Perimetro = " + Double.toString(p);
                as = "";
                msg = "";
            }
            if (area.isSelected() && per.isSelected()) {
                a = 2 * 3.14 * Double.parseDouble(texto.getText());
                p = 3.14 * Double.parseDouble(texto.getText()) * Double.parseDouble(texto.getText());
                as = "Area = " + Double.toString(a);
                ps = "Perimetro = " + Double.toString(p);
                msg = "";
            }
             if (!area.isSelected() && !per.isSelected()){
                as = "";
                ps = "";
                msg = "Seleccione qualquer coisa";
            }

            JOptionPane.showMessageDialog(null, as + "\n" + ps + "\n" + msg);

        }
        public void mouseEntered(MouseEvent ev){}
        public void mouseExited(MouseEvent ev){}
        public void mouseReleased(MouseEvent ev){}
        public void mousePressed(MouseEvent ev){}
    }
}

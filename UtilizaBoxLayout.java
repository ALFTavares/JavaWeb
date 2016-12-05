import javax.swing.*;

/**
 * Created by bob on 9/5/16.
 */
public class UtilizaBoxLayout {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("BoxLayout");
        janela.setSize(200, 200);
        janela.setLocation(50, 50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        for (int i = 0; i < 5; i++){
            painel.add(new JButton("Botão " + (i + 1)));
        }
        janela.add(painel);
        janela.setVisible(true);
    }
}

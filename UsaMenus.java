import javax.swing.*;

/**
 * Created by bob on 9/5/16.
 */
public class UsaMenus {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Menus");
        janela.setSize(350, 150);
        janela.setLocation(50, 50);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar barraMenu = new JMenuBar();
        JMenu menuContentores = new JMenu("Contentores");
        JMenuItem jmiJFrame = new JMenuItem("JFame");
        JMenuItem jmiJPanel = new JMenuItem("JPanel");

        JMenu menuCaixasTexto = new JMenu("Caixas Texto");
        JMenuItem jmiTextField = new JMenuItem("TextField");
        JMenuItem jmiTextArea = new JMenuItem("TextArea");

        JMenu menuBotoes = new JMenu("Botoẽs");
        JMenuItem jmiJButton = new JMenuItem("JButton");
        JMenuItem jmiJCheckBox = new JMenuItem("JCheckBox");
        JMenuItem jmiJRadioButton = new JMenuItem("JRadioButton");

        JMenu outrosComponentes = new JMenu("Outros");
        JMenuItem jmiJLabel = new JMenuItem("JLabel");
        JMenuItem jmiComboBox = new JMenuItem("ComboBox");
        JMenuItem jmiJTable = new JMenuItem("JTable");

        janela.setJMenuBar(barraMenu);
        barraMenu.add(menuContentores);
        menuContentores.add(jmiJFrame);
        menuContentores.add(jmiJPanel);

        barraMenu.add(menuCaixasTexto);
        menuCaixasTexto.add(jmiTextField);
        menuCaixasTexto.add(jmiTextArea);

        barraMenu.add(menuBotoes);
        menuBotoes.add(jmiJButton);
        menuBotoes.add(jmiJCheckBox);
        menuBotoes.add(jmiJRadioButton);

        barraMenu.add(outrosComponentes);
        outrosComponentes.add(jmiJLabel);
        outrosComponentes.add(jmiComboBox);
        outrosComponentes.add(jmiJTable);

        janela.setVisible(true);
    }
}

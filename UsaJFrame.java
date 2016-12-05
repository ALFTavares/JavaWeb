import javax.swing.*;

/**
 * Created by Paulo Meira on 01/09/2016.
 */
public class UsaJFrame extends JFrame{
    public UsaJFrame(){
        setTitle("JFrame");
        setSize(350, 150);
        setLocation(50, 50);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UsaJFrame();
    }
}

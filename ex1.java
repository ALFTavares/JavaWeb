/**
 * Created by bob on 9/2/16.
 */
import java.applet.*;
import java.awt.*;
import java.util.*;

public class ex1 extends Applet{

    Panel caixa;
    public void init() {
        Panel caixa1 = new Panel();

        caixa = new Panel();

        setLayout(new CardLayout());

        caixa1.setLayout(new GridLayout(4, 1));
        caixa1.add(new Button("Botao1"));
        caixa1.add(new Button("Botao2"));
        caixa1.add(new Button("Botao3"));

        caixa1.add(new Button("Botao4"));
        caixa1.add(new Button("Botao5"));
        caixa1.add(new Button("Botao6"));

        caixa1.add(new Button("Botao7"));
        caixa1.add(new Button("Botao8"));
        caixa1.add(new Button("Botao9"));

        caixa1.add(new Button("Botao10"));
        caixa1.add(new Button("Botao11"));
        caixa1.add(new Button("Botao12"));

        add("Tavares", caixa);
        caixa.add(caixa1);
    }
}

import javax.swing.*;

/*Exercicio Simples com Option Pane:
    Introduza dois numeros com JOptionPane e escreva a sua soma também com JOptionPane
 */
/**
 * Created by bob on 9/2/16.
 */
public class SomaJOPShowInputDialog {
    public static void main(String[] args) {
        int res;

        String str1 = JOptionPane.showInputDialog("1º num:");
        int num1 = Integer.parseInt(str1);
        String str2 = JOptionPane.showInputDialog("2º num:");
        int num2 = Integer.parseInt(str2);

        res = num1 + num2;

        JOptionPane.showMessageDialog(null, "Soma = " + res);

    }
}

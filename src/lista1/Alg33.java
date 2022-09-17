package lista1;

import javax.swing.*;

//LER DOIS NUMEROS INTEIROS E IMPRIMIR
public class Alg33 {
    public static void main(String[] args) {
        int numInteiro1;
        int numInteiro2;
        numInteiro1 = Integer.parseInt(JOptionPane.
                showInputDialog("Digite o primeiro número inteiro"));
        numInteiro2 = Integer.parseInt(JOptionPane
                .showInputDialog("Digite o segundo número inteiro"));

        System.out.println("Os Números inteiros são :" + numInteiro1 + " e "
                + numInteiro2);
    }
}

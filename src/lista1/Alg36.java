package lista1;

import javax.swing.*;

//LER DOIS NUMEROS INTEIROS E IMPRIMIR A SOMA. ANTES DO RESULTADO, DEVERÁ APARECER A MENSAGEM  SOMA.
public class Alg36 {
    public static void main(String[] args) {
        int num1,num2;
        String soma;

        num1 = Integer.parseInt(JOptionPane
                .showInputDialog("Digite o primeiro número inteiro"));
        num2 = Integer.parseInt(JOptionPane
                .showInputDialog("Digite o segundo número inteiro"));
        System.out.println("Soma:" + (num1 + num2));
    }
}

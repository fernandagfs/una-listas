package lista1;

import javax.swing.*;

// LER UM NUMERO INTEIRO E IMPRIMIR SEU SUCESSOR E SEU ANTECESSOR
public class Alg34 {
    public static void main(String[] args) {
        int numInteiro, sucessor, antecessor;
        numInteiro = Integer.parseInt(JOptionPane
                .showInputDialog("Digite o número"));

        sucessor = numInteiro + 1;
        antecessor = numInteiro - 1;

        System.out.println("Sucessor:" + sucessor);
        System.out.println("Antecessor:" + antecessor);
    }
}

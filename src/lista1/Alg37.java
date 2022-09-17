package lista1;//Ler dois números inteiros e imprimir o produto.

import javax.swing.*;

public class Alg37 {
    public static void main(String[] args) {
        Integer n1, n2, produto;

        n1 = Integer.parseInt(JOptionPane
                .showInputDialog("Digite o Valor de N1"));
        n2 = Integer.parseInt(JOptionPane
                .showInputDialog("Digite o Valor de N2"));

        produto = (n1 * n2);

        System.out.println("O Produto de: " + n1 + " * " + n2 + " é: " + produto);
    }
}

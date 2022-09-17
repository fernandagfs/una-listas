package lista1;//LER O NOME, ENDEREÇO E TELEFONE E IMPRIMI-LOS

import javax.swing.*;

public class Alg35 {
    public static void main(String[] args) {
        String nome,endereço, telefone;
        nome = JOptionPane.showInputDialog("Digite o Nome");
        endereço = JOptionPane.showInputDialog("Digite o Endereço");
        telefone = JOptionPane.showInputDialog("Telefone:");

        System.out.println("Nome:" + nome);
        System.out.println("Endereço:" + endereço);
        System.out.println("Telefone:" + telefone);
    }
}

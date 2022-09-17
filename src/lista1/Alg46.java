package lista1;// EX 46- Fazer um algoritmo que possa entrar com o saldo de uma aplicação
// e imprima o novo saldo, considerando o reajuste de 1%

import java.util.Scanner;

public class Alg46<v2> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com Saldo de uma aplicação: ");
        double v1 = sc.nextDouble();
        double v2 = (v1 + (v1 * 0.01));
        System.out.println("Novo saldo com reajuste: " + v2);
    }
}

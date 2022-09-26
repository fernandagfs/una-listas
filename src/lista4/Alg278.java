package lista4;

import java.util.Scanner;

//Alg 278: entrar com um número e verificar se ele é um número primo.
public class Alg278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;

        while (n > 1) {
            System.out.print("Digite um numero: ");
            n = sc.nextInt();
            int cont = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println("O numero " + n + " é primo");
            } else {
                System.out.println("O numero " + n + " não primo");
            }
        }
        sc.close();
    }
}

package lista6;

import java.util.Scanner;

//Alg 355: armazenar 8 números em um vetor e imprimir todos os números. Ao final, teremos o total de
//números múltiplos de seis.
public class Alg355 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[8];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Os numeros digitados foram:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 6 == 0) {
                System.out.println("O numero " + numeros[i] + " é multiplo de seis");
            }
        }
        sc.close();
    }
}




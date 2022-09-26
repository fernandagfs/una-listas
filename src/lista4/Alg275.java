package lista4;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

//Alg 275: criar um algoritmo que leia vários números inteiros e apresente o fatorial de cada número. O
//algoritmo se encerra quando se digita um número menor que 1
public class Alg275 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n2 = 2;

        while (n2 > 0) {
            System.out.print("\nEntre com um numero: ");
            n2 = sc.nextInt();

            int n = n2;
            int fat = n;

            while (n > 1) {
                fat = fat * (n - 1);
                n--;
            }

            if (n > 0) {
                System.out.printf("Fatorial de %d é: %d%n", n2, fat);
            }
        }
        sc.close();
    }
}

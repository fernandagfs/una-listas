package lista6;

import java.util.Scanner;

//Alg 364: ler um vetor vet de 10 elementos e obter um vetor w cujos componentes são os fatoriais dos
//respectivos componentes de w.
public class Alg364 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        int[] w = new int[10];
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Entre com os valores: ");
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < vet.length; i++) {
            int n = vet[i];
            int fat = vet[i];

            while (n > 1) {
                fat = fat * (n - 1);
                n--;
            }
            w[i] = fat;
            System.out.print("Fatorial: ");
            System.out.println(w[i]);
        }
    }
}

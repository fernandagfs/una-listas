package lista4;

import java.util.Scanner;

//Alg 279: escrever um algoritmo que receba vários números interiso e imprimir a quantidade de números
//primos dentre os números que foram digitados. O algoritmo acaba quando se digita um número menor
//ou igual a zero.
public class Alg279 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 1;
        int quant = 0;

        while (n > 0) {
            System.out.print("Digite um numero: ");
            n = sc.nextInt();
            int cont = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    cont++;
                }
            }
            if (cont == 2){
                quant=quant +1;

            }
        }
        System.out.println( "Total de numeros primos digitados foi: " +quant);
        sc.close();
    }
}


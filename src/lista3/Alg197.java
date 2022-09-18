package lista3;

import java.util.Scanner;

//Alg 197: criar um algoritmo que leia um número que servirá para controlar os primeiros número impares.
//Deverá ser impressa a soma desses números. Suponha que num será maior que zero.
//Quantos: 5
      //  Impares: 1 3 5 7 9 -
       // Soma: 25
public class Alg197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Entre com um numero:");
        int num = sc.nextInt();
        int soma = 0;
        int countImpares = 0;
        int i = 1;
        // enquanto quantidade de impares for menor ou igual a entrada
        // tres tipos que pode ser resolvido
        /*while (countImpares <= num) {
            if (i % 2 != 0) {
                System.out.print("Impares :" +i + " " );
                soma = soma + i;
                countImpares++;
            }
            i++;
        }*/

        /*System.out.print("Impares: ");
        i = 0;
        for (int j = 0; j < num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " " );
                soma = soma + i;
                countImpares++;
                j++;
            }
        }
        System.out.println("Soma:" + soma);
        */

        System.out.print("Impares: ");
        soma = 0;
        for (int j = 1; countImpares < num;  j = j + 2) {
            System.out.print(j + " ");
            soma += j;
            countImpares++;
        }
        System.out.println("\nSoma: " + soma);
    }
}

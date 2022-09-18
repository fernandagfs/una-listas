package lista3;

import java.util.Scanner;

//Alg 195: criar um algoritmo que imprima asoma dos números pares entre 25 e 200.
public class Alg195 {
    public static void main(String[] args) {

        int soma=0;
        for (int i=25 ; i<=200; i++){
            if (i % 2 == 0) {
                System.out.println( i ); // coloquei para imprimir para verificar se a soma bate
                soma = soma + i;
            }
        }
        System.out.println( "Produto = "+soma);

    }
}

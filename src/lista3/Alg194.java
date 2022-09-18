package lista3;

import java.util.Scanner;

//Alg 194: criar um algoritmo que leia um número e imprima todos os números de 1 até o número lido e
//o seu produto. Exemplo:
//número: 3
//Saída: 1 2 3 -
//Produto: 6
public class Alg194 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int numb;
        int soma=0;
        System.out.println( "Entre com um numero:");
        numb= sc.nextInt();

        for (int i=1 ; i<=numb; i++){
            System.out.println( " " + i + " ");
            soma= soma +i;
        }
        System.out.println( "Produto = "+soma);
        sc.close();


    }
}

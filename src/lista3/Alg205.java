package lista3;

import java.util.Scanner;

//Alg 205: criar um algoritmo que leia um número (num) da entrada em seguida, ler n números inteiros
//da entrada negativos e imprimir o maior deles.
public class Alg205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Entre com um numero:");
        int num = sc.nextInt();
        int countVezes = num;
        int i = 1;


        System.out.println("Numero lido: "+ num);
        System.out.print( "Digitos : ");
        int num2=sc.nextInt();
        System.out.print(num2 + " ");
        int maior =num2;

        for ( i = 1; i < countVezes;  i ++) {
            int num3=sc.nextInt();
            System.out.print(num3 + " ");

            if (maior < num3) {
                maior = num3;

            }



        }
        System.out.printf( "maior: %d", maior);
        sc.close();
    }

}

package lista3;

import java.util.Scanner;

//Alg 202: criar um algoritmo que leia um número (num) da entrada e imprima os múltiplos de 3 e 5 ao
//mesmo tempo no intervalo de 1 a num.
public class Alg202 {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner( System.in);
        System.out.println( " Entre com um numero: ");
        num= sc.nextInt();

        System.out.println("Numero lido "+ num);
        System.out.print( "Saida: ");

        for (int i= 1; i< num; i++){
            if (i % 3==0 && i% 5==0){
                System.out.print( i+ " ");
            }
        }
        sc.close();

    }
}

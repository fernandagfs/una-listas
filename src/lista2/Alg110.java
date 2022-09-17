package lista2;

import java.util.Scanner;

//Alg 110: criar um algoritmo que leia dois números e imprimir uma mensagem dizendo se são iguais
//ou diferentes
public class Alg110 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println( "Entre com o primeiro numero: ");
        int numb1= sc.nextInt();
        System.out.println( "Entre com o segundo numero: ");
        int numb2= sc.nextInt();

        if (numb1 == numb2){
            System.out.println( " Os numeros são iguais");
        }
        else {
            System.out.println(" Os numeros são diferentes");
        }
        sc.close();
    }
}

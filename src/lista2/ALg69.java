package lista2;

import java.util.Scanner;

//Alg 69: Criar um algoritmo que leia o numerador e o denominador de uma fração e transformá-lo em
// um número decimal.
public class ALg69 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com o Numerador: ");
        int num= sc.nextInt();
        System.out.println("Entre com o Denominador: ");
        int den= sc.nextInt();

        double result= num/ den;
        System.out.println("Resultado da fração; "+result);
    }
}

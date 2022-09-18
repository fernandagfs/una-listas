package lista2;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

//Alg 119: entrar com três números e imprimi-lo em ordem decrescente
public class Alg119 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println( "Entre com primeiro numero: ");
        int n1= sc.nextInt();
        System.out.println( "Entre com segundo numero: ");
        int n2= sc.nextInt();
        System.out.println( "Entre com terceiro numero: ");
        int n3= sc.nextInt();

        if (n1 >= n2 && n2 >= n3)
        {
            System.out.printf("A ordem decrescente: %d %d %d\n", n1, n2, n3);
        }
        else if (n1 >= n3 && n3 >= n2)
        {
            System.out.printf("A ordem decrescente: %d %d %d\n", n1, n3, n2);
        }
        else if (n2 >= n1 && n1 >= n3)
        {
            System.out.printf("A ordem decrescente: %d %d %d\n", n2, n1, n3);
        }
        else if (n2 >= n3 && n3 >= n1)
        {
            System.out.printf("A ordem decrescente: %d %d %d\n", n2, n3, n1);
        }
        else if (n3 >= n1 && n1 >= n2)
        {
            System.out.printf("A ordem decrescente: %d %d %d\n", n3, n1, n2);
        }
        else if (n3 >= n2 && n2 >= n1)
        {
            System.out.printf("A ordem decrescente: %d %d %d\n", n3, n2, n1);
        }
        sc.close();





    }
}

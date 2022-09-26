package lista3;

import java.util.Scanner;

//208: criar um algoritmo que imprima os 10 primeiros termos da série de fibonacci.
public class Alg208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        int i = 0;
        int n1 = 1;
        int n2 = 1;
        int n3;

        System.out.println( n1 + "\n" + n2 );
        for (i =1 ; i <= 8; i++ ){
            n3=n1 + n2;
            System.out.println(n3);
            n2 = n1;
            n1 = n3;
        }
        sc.close();



    }
}

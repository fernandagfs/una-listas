package lista1;//Alg 58: Entrar com os valores para xnum1, xnum2, xnum3 e imprimir o valor de x, sabendo-se que:

import java.util.Scanner;

public class Alg58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre com valor1: ");
        int xnum1= sc.nextInt();
        System.out.println("Entre com valor2: ");
        int xnum2= sc.nextInt();
        System.out.println("Entre com valor3: ");
        int xnum3= sc.nextInt();

        double x= xnum1 + ((xnum2 / (xnum3 + xnum1)) + (2 * (xnum1 - xnum2)) + (Math.log(64) / Math.log(2)));
        System.out.println("X="+x);
    }
}

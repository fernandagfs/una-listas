package lista3;

import java.util.Scanner;

//lista3.Alg183.entrar com 10 números e imprimir o quadrado de cada número
public class Alg183 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double i,numb;
        for(i=1;i<=10;i++) {
            numb = sc.nextInt();
            System.out.println(Math.pow(numb, 2));
        }

    }
}

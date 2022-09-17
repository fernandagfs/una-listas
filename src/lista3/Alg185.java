package lista3;

import java.util.Scanner;

//lista3.Alg185: entrar com 15 números e imprimir a raiz quadrada de cada número.
public class Alg185 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double i,numb;
        for(i=1;i<=15;i++) {
            numb = sc.nextDouble();
            System.out.println(Math.sqrt(numb));
        }
    }
}

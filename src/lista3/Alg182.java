package lista3;

import java.util.Scanner;

//lista3.Alg182.entrar com 10 números e imprimir a metade de cada número
public class Alg182 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double i,numb;
        for(i=1;i<=10;i++){
            numb= sc.nextInt();
            System.out.println( numb/2);
        }
    }
}

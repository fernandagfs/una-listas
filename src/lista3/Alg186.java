package lista3;

import java.util.Scanner;

//lista3.Alg186.entrar com quatro números e imprimir o cubo e a raiz cúbica de cada número
public class Alg186 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double i,numb;
        for(i=1;i<=15;i++) {
            numb = sc.nextDouble();
            System.out.println(Math.cbrt(numb));
            System.out.println(Math.pow(numb,3));
        }
    }
}

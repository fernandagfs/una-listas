package lista1;//Alg 41: Entrar com quatro números inteiros e imprimir a média ponderada,
// sabendo que os pesos são respectivamente 1, 2, 3, e 4.

import java.util.Scanner;

public class Alg41 {
    public static void main(String[] args) {

        Scanner sc= new Scanner( System.in);
        System.out.print("Entre com primeiro número: ");
        int v1=sc.nextInt();
        System.out.print("Entre com segundo número: ");
        int v2= sc.nextInt();
        System.out.println("Entre com o terceiro número: ");
        int v3=sc.nextInt();
        System.out.print("Ente com quarto número: ");
        int v4=sc.nextInt();

        double mp= (v1*1+v2*2+v3*3+v4*4)/10;  // media pondera = valor1* seu peso1+ valor2*peso2/ peso1+peso2
        System.out.printf(" Amédia ponderada dos valores é : %.2f%n", mp);

    }
}

package lista1;

import java.util.Scanner;

//Alg 38: Ler um número real e imprimir a terça parte deste número.
public class Alg38 {
    public static void main(String[] args) {
       double n1,resultado;

        Scanner sc= new Scanner( System.in);
        System.out.println("Entre com um número real: ");
        double v1= sc.nextInt();
        System.out.println( "A terça parte do número: "+v1+ " é: " + v1/3);

    }
}

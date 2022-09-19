package lista2;

import java.util.Scanner;

//entrar com o salário de uma pessoa e imprimir o valor desconto do INSS (em R$), segundo
//a tabela a seguir:
public class Alg129 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println( "Entre com salario");
        double salario= sc.nextDouble();
        double desconto;

        if ( salario <= 600.00){
            System.out.println( "Isento de desconto ");
        }
        else if (salario > 600.00 && salario <= 1200.00){
            desconto= salario * 0.20;
            System.out.printf( "Desconto INSS+ R$ %.2f%n ", desconto);
        }
        else if (salario > 1200.00 && salario <= 2000.00){
            desconto= salario * 0.25;
            System.out.printf( "Desconto INSS+ R$ %.2f%n ", desconto);
        }
        else {
            desconto= salario * 0.30;
            System.out.printf ("Desconto INSS+ R$ %.2f%n"+ desconto);
        }
    }
}

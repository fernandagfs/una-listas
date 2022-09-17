package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

//Alg 72: Criar um algoritmo que leia o valor de um depósito e o valor da taxa de juros. Calcular e
// imprimir o valor do rendimento e o valor total depois do rendimento.
public class Alg72 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com o Valor do depósito: ");
        double deposito= sc.nextDouble();

        System.out.println("Entre com o valor da taxa de Juros %: ");
        double taxa= sc.nextDouble();

        double rendimento= deposito*(taxa/100);
        double total= rendimento+ deposito;

        System.out.println("Valor de rendimento; "+ new DecimalFormat("00.00").format(rendimento));
        System.out.println("Valor total com rendimento: "+new DecimalFormat("00.00").format(total));

        }
    }


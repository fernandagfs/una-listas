package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

//Alg 70Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% para o garçom
// Fazer um algoritmo que leia o valor gasto com despesas realizadas em um restaurante e imprima o valor total
// com a gorjeta.
public class Alg70 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com valor da despesa 1: ");
        double vl1= sc.nextDouble();
        System.out.println("Entre com valor da despesa 2: ");
        double vl2= sc.nextDouble();
        System.out.println("Entre com valor da despesa 3: ");
        double vl3= sc.nextDouble();

        double sgorgeta= vl1+vl2+vl3;
        double gorgeta = 0;
        double total;

        System.out.println("Será Cobrado a taxa de 10% referente a gorgeta? [S OU N]? ");
        String resp= sc.next();
        if ( resp.equalsIgnoreCase("s")){
            gorgeta= sgorgeta * 0.1;
        }
        total = sgorgeta + gorgeta;
        System.out.println("Total das despesas:R$"+new DecimalFormat("00.00").format(total));
    }
}

package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

//    • Alg 75: Criar um algoritmo que leita o peso de uma pessoa, só a parte inteira, calcular e imprimir:
//O peso da pessoa em gramas
//Novo peso, em gramas, se a pessoa engordar 12%
public class Alg75 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Qual o peso: ");
        double peso= sc.nextDouble();

        int pesoInteiro= (int) peso;
        double pesogramas= peso * 1000;
        double engordar= peso+(peso *0.12);

        System.out.println("Peso Inteiro: "+pesoInteiro);
        System.out.println("Peso em gramas: "+new DecimalFormat("00000").format(pesogramas));
        System.out.println("Peso caso engorde 12%: "+engordar);

        }
    }


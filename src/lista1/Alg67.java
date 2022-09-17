package lista1;

import java.util.Scanner;

//Alg 67    • Efetuar o cálculo do valor de uma prestação em atraso, utilizando a fórmula:
//prestacao = valor + (valor * (taxa/100) * tempo)
public class Alg67 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Qual o valor em atraso?: ");
        double vl= sc.nextDouble();
        System.out.println("Quantos dias em atraso: ");
        int tempo= sc.nextInt();
        System.out.println("Qual a taxa de juros/ dia: ");
        int taxa= sc.nextInt();

        double vltraso= vl+(vl* taxa/100*tempo);
        System.out.println("Novo valor da prestação em atraso: "+ vltraso);
    }
}

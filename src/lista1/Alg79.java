package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

//Alg 79: Uma pessoa resolveu fazer uma aplicação em uma poupança programada.
// Para calcular seu rendimento, ela deverá fornecer o valor constante da aplicação mensal,
// a taxa e o número de meses. Sabendo-se que a fórmula usada para esta cálculo é:
public class Alg79 {
    public static void main(String[] args) {
        Scanner sc= new Scanner ( System.in );
        System.out.println ("Entre com valor constante da aplicação mensal: ");
        double aplicação= sc.nextDouble();

        System.out.println( "Entre com a taxa: ");
        double taxa= sc.nextDouble();
        double tx= taxa/100;

        System.out.println("Qual o número de meses: ");
        int meses= sc.nextInt();

        double valoracumulado= aplicação * (Math.pow ( 1+ tx,meses)) -1 /tx;
        System.out.println( "Valor do seu rendimento : "+ valoracumulado);
    }
}

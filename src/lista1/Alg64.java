package lista1;//Alg 64: Ler uma temperatura em graus centígrados e apresentá-la convertida em graus Fahrenheit.
// A fórmula de conversão é onde F é a temperatura em Fahrenheit e C é a temperatura em centígrados.

import java.util.Scanner;

public class Alg64 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a temperatura em Graus Cesius: ");
        double celsius= sc.nextDouble();

        double fahrenheit= (9*celsius+160)/5;
        System.out.println("Temperatura convertida em F: "+ fahrenheit);
    }
}

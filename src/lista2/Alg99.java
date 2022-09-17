package lista2;// Alg 99: ler um número inteiro de 3 casas decimais e imprimir se o algarismo de casa das centenas
        //é par ou impar

import java.util.Scanner;

public class Alg99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Entre com numero inteiro ");
        double numb = sc.nextDouble();

        if ( numb % 2 == 0) {
            System.out.println("O numero digitado é par ");
        }
        else {
            System.out.println( "O numero digitado é impar ");
        }
        if ( numb >= 100 && numb <= 999) {
            System.out.println("o numero pertece a casa das centenas: ");
        }
        sc.close();
    }
}

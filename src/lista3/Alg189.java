package lista3;

import java.util.Scanner;

//Alg 189: criar um algoritmo que imprima a tabela de conversão de graus Celsius-Fahrenheit para o
//intervalo desejado pelo usuário. O algoritmo deve solicitar ao usuário o limite superior do intervalo e o
//decremento.
public class Alg189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com valor limite");
        int vlLimite = sc.nextInt();
        System.out.println("Entre com o decremento");
        int decremento = sc.nextInt();

        int  celcius;
        System.out.println("Celcius " + " Fahrenheit ");

        for (int i = 0; i <= vlLimite; i = i - decremento) {
            celcius = 5 * (i - 32) / 9;

            System.out.println( celcius+ i);
        }


    }
}

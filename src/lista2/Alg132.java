package lista2;

import java.util.Scanner;

//Alg 132: fazer um algoritmo que possa converter uma determinada quantia dada em reais
//para uma das seguintes moedas
public class Alg132 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com valor em reais");
        double reais= sc.nextDouble();
        System.out.printf( "Digite qual moeda deseja converter:%n");
        System.out.printf( "(F)Franco suiço%n");
        System.out.printf( "(I)Libra esterlina%n");
        System.out.printf( "(D)Dolar%n");
        System.out.printf( "(M)Marco alema%n");
        char moeda= sc.next().charAt(0);
        double conversao;

        if(moeda == 70 || moeda ==102){
            conversao= reais * 0.19;
            System.out.printf("Franco Suiço: %.2f%n", conversao);
        }
        else if (moeda == 73 || moeda ==105){
            conversao= reais * 0.17;
            System.out.printf("Libra esterlina: %.2f%n", conversao);
        }
        else if (moeda == 68 || moeda ==100){
            conversao= reais * 0.19;
            System.out.printf("Dolar: %.2f%n", conversao);
        }
        else if (moeda == 77 || moeda ==109){
            conversao= reais * 0.38;
            System.out.printf("Marco Alemao: %.2f%n", conversao);
        }
        sc.close();



    }
}

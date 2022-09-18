package lista3;

import java.util.Scanner;

//Alg 200: criar um algoritmo que leia os limites inferior e superior de um intervalo e um número cujo
//múltiplos se deseja que sejam impressos no intervalo aberto. Suponha que os dados digitados são para
//um intervalo crescente.
public class Alg200 {
    public static void main(String[] args) {

        int limiteInferior, limiteSuperior;

        Scanner sc=new Scanner( System.in);
        System.out.println( "Entre com limite inferior");
        limiteInferior= sc.nextInt();
        System.out.println( "Entre com limite superior");
        limiteSuperior= sc.nextInt();

        System.out.println( "numero: "+ limiteInferior) ;
        System.out.print( "Saida: ");


        for (int i = limiteInferior +1; i < limiteSuperior; i++) {
            if (i % limiteInferior==0 ) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

package lista3;

import java.util.Scanner;

//Alg 199: criar um algoritmo que leia os limites inferior e superior de um intervalo e imprima todos os
//números múltiplos de 6 no intervalo fechado. Suponha que os dados digitados são para um intervalo
//crescente.
public class Alg199 {
    public static void main(String[] args) {
        int limiteInferior, limiteSuperior;
        Scanner sc=new Scanner( System.in);
        System.out.println( "Entre com limite inferior");
        limiteInferior= sc.nextInt();
        System.out.println( "Entre com limite superior");
        limiteSuperior= sc.nextInt();

        System.out.print( "Saída: ") ;
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (i % 6 ==0 ) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

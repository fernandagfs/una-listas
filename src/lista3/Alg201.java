//Alg 201: criar um algoritmo que leia os limites inferior e superior de um intervalo e imprimir todos os
//números pares no intervalo aberto e se somatório. Suponha que os dados digitados são para um
//intervalo crescente.
//crescente.
package lista3;

import java.util.Scanner;

public class Alg201 {
    public static void main(String[] args) {
        int limiteInferior, limiteSuperior;
        int soma=0;

        Scanner sc=new Scanner( System.in);
        System.out.println( "Entre com limite inferior");
        limiteInferior= sc.nextInt();
        System.out.println( "Entre com limite superior");
        limiteSuperior= sc.nextInt();

        System.out.println( "numero: "+ limiteInferior) ;
        System.out.print( "Saida: ");

        for (int i=limiteInferior+1;i<limiteSuperior;i++){
            if (i % 2 == 0) {
                System.out.print( i + " ");
                soma = soma + i;
            }
        }
        System.out.println( "Soma= "+soma);

    }
}

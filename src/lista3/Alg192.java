package lista3;

import java.util.Scanner;

//Alg 192: criar um algoritmo que leia um número que será superior de um intervalo, e imprimir todos os
//números impares menores que esse número. Exemplo:
//Limite superior: 15
        //Saída: 1 3 5 7 9 11 13
public class Alg192 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        int limite;

        System.out.println(" Entre com o numero limite");
        limite= sc.nextInt();

        for (int i=0; i<limite; i++){
            if (i % 2 !=0){
                System.out.print( " " +i+ " ");

            }
        }
        sc.close();
    }
}

package lista3;

import java.util.Scanner;

//Alg 196: criar um algoritmo que leia um número (num) e imprima a soma dos números múltiplos de 5
//no intervalo aberto entre 1 e num. Suponha que num será maior que zero.
//num: 15
//Multiplos de 5: 5 10 -
//Soma: 15
public class Alg196 {
    public static void main(String[] args) {

        int num;
        int soma = 0;
        Scanner sc = new Scanner( System.in);
        System.out.println("Entre com numero");
        num= sc.nextInt();

        for (int i=1; i< num; i++){
            if(i % 5==0) {
                System.out.print( " "+ i +"  - ");
                soma = soma + i;
            }
        }
        System.out.println( "Soma: "+ soma );

    }
}

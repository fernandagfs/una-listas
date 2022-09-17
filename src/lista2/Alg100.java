package lista2;//Alg 100: ler um número inteiro de 4 casas e imprimir se é ou não multiplo de quatro o número formado
//pelos algarismos que estão nas casas das unidades de milhar e das centenas

import java.util.Scanner;

public class Alg100 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println( "Entre com numero inteiro ");
        int numb= sc.nextInt();

        if (numb % 4 ==0){
            System.out.println( "O numero é multiplo de 4:");
        }
        else {
            System.out.println(" O numero não é multiplo de 4:");
        }
        if (numb >=0 && numb <10 ){
            System.out.println( "O numero digitado e da casa da Unidade: ");
        }
        else if (numb >=10 && numb <= 99 ){
            System.out.println( " O numero digitado e da casa das Dezenas:");
        }
        else if ( numb >=100 && numb <= 999){
            System.out.println( " O numero digitado e da casa das Centenas");
        }
        else if ( numb >=1000 && numb <=9999){
            System.out.println( " O numero digitado é da casa do Milhar");
        }
        sc.close();
    }
}

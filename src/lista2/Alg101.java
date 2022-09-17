package lista2;

import java.util.Scanner;

//• Alg 101: construir um algoritmo que indique se o número digitado está compreendido entre 20 e 90
//ou não
public class Alg101 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println( "Digite um número :");
        int numb= sc.nextInt();

        if ( numb >=20 && numb <= 90){
            System.out.println( " Numero digitado está entre 20 e 90 ");
        }
        else {
            System.out.println(" O numero digitado não está entre 20 e 90 ");
        }
        sc.close();
    }
}

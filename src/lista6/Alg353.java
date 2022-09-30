package lista6;

import java.util.Scanner;

//Alg333.armazenar 10 nomes em um vetor NOME e imprimir os nomes.
public class Alg353 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] nomes = new String[10];

        for (int i =0; i<= nomes.length; i ++){
            System.out.println( "Entre com nomes");
            nomes [i]= sc.next();
            System.out.println((i+1) +":" + nomes [i] );
        }
        sc.close();



    }
}

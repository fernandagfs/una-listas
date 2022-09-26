package lista4;

import java.util.Scanner;

//Alg 262: Entrar com números e imprimir o triplo de cada número. O algoritmo acaba quando entrar o
//número -999.
public class Alg262 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println( "Entre com numero");
        int numero = sc.nextInt();
        int resultado;

        while ( numero != -999){
            resultado =  numero * 3;
            System.out.println("Triplo: "+ resultado);
            System.out.println( "Entre com numero");
            numero = sc.nextInt();
        }
        sc.close();
    }
}

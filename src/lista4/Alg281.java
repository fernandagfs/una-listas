package lista4;

import java.util.Scanner;

//Alg 281: entrar com vários números e imprimir o maior número. O algoritmo acaba quando se digita -
//9999.
public class Alg280 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = 0;
        int n2;


        while (n != 9999){
            System.out.print( "Digite um numero:");
            n2 = sc.nextInt();

            if (n2 == 9999){
                break;
            }

            else if ( n2 > n) {
                n = n2;
            }

        }
        System.out.println( "O maior numero digitado foi: "+ n);
        sc.close();
    }
}

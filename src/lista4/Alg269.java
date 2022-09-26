package lista4;

import java.util.Scanner;

//Alg 269: entrar com números e imprimir o quadrado de cada número até entrar um número múltiplo de
//6 que deverá ter seu quadrado também impresso e terminar.
public class Alg269 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in );
        double quadrado = 0;
        int multiplo;
        double numero = 1;

        while ( numero % 6 != 0){
            System.out.println( "Entre com numero");
            double n2 = sc.nextInt();
            quadrado = Math.pow( n2, 2);
            System.out.println( "Quadrado do numero é :"+ quadrado);
            numero=n2;
            if ( numero % 6 == 0){
                break;
            }
        }
    }
}

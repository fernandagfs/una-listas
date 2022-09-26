package lista4;

import java.util.Scanner;

//Alg 270: ler vários números até entrar o número -999. Para cada número, imprimir seus divisores.
public class Alg270 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n1 = 0;

        while ( n1 != -999){
            System.out.println( "Digite um numero");
            int n2 = sc.nextInt();
            if( n1 % n2== 0){
                System.out.printf( "Divisor de %d é %d: ",n1, n2);
            }
            n1=n2;

        }
    }
}

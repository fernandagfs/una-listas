package lista4;

import java.util.Scanner;

//Alg 264: Entrar com vários números positivos e imprimir a média dos números digitados.
public class Alg264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        double media = 0 ;
        int soma = 0;
        int n1 = 0 ;

        while (n1 >= 0 ) {
            System.out.println( "Entre com numero ");
            int n2 = sc.nextInt();
            if (n2 > 0 ) {
                soma = soma + n2;
            }
            n1 = n2;
        }
        media = soma /2 ;
        System.out.println( "media "+media);
        sc.close();
    }

}

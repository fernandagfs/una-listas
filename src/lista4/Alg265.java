package lista4;

import java.util.Scanner;

//Alg 265: Ler vários números e informar quantos números entre 100 e 200 foram digitados. Quando o
//valor 0 for lido, o algoritmo deverá cessar sua execução.
public class Alg265 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int quantidade = 0;
        int n1 = 1 ;
        while (n1 != 0 ) {
            System.out.println( "Entre com numero ");
            int n2 = sc.nextInt();
            if (n2 >= 100 && n2 <= 200 ) {
                quantidade = quantidade +1 ;
            }
            n1 = n2;
        }
        System.out.println( "Quantidade de vezes que numeros ente 100 e 200 foi digitado foi:  "+quantidade);
        sc.close();
    }
}

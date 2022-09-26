package lista4;

import java.util.Scanner;

//Alg 282: Entrar com o número da conta e o saldo de várias pessoas. Imprimir todas as contas, os
//respsctivos saldos e uma das mensagens (positivo ou negativo). Ao final, o percentual de pessoas com
//saldo negativo. O algoritmo acaba quand ose ditia um número negativo para a conta
public class Alg282 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int numConta = 1;
        double saldo = 0;
        int cont = 0;
        int total = 0;
        int percent;


        while (numConta > 0) {
            System.out.print("Entre com numero da conta: ");
            numConta = sc.nextInt();

            if ( numConta < 0 ){
                break;
            }
            System.out.print( "Entre com o saldo da conta: ");
            saldo = sc.nextDouble();

            if (saldo < 0){
                System.out.printf( "Numero da conta: %d%n",numConta);
                System.out.printf("Saldo Negativo: R$ %.2f%n", saldo);
                System.out.println();
                cont ++;
            }
            else {
                System.out.printf( "Numero da conta: %d%n",numConta);
                System.out.printf("Saldo Positivo: %.2f%n", saldo);
                System.out.println();

            }
            total++;
        }
        percent = (cont * 100) /total;
        System.out.print("O percentual de contas com saldo negativo é: "+ percent);

    }
}

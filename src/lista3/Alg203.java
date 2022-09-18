package lista3;

import java.util.Scanner;

//Alg 203: criar um algoritmo que leia um número (num) da entrada em seguida, ler n números da entrada
//e imprimir o triplo de cada um.
public class Alg203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Entre com um numero:");
        int num = sc.nextInt();
        int countVezes = 0;
        int i = 1;
        System.out.println("Numero lido: "+ num);
        System.out.println( "Digitos :");

        for ( i = 1; countVezes < num;  i = i + 2) {
            int num2=sc.nextInt();
            System.out.print(num2  + " Triplo: "+ (num2*3));

            countVezes++;
        }
        sc.close();
    }
}

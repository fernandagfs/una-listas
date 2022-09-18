package lista3;

import java.util.Scanner;

//Alg 204: criar um algoritmo que leia um número (num) da entrada em seguida, ler n números inteiros
//da entrada e imprimir o maior deles.
public class Alg204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Entre com um numero:");
        int num = sc.nextInt();
        int countVezes = 0;
        int i = 1;
        int maior = 0;
        System.out.println("Numero lido: "+ num);
        System.out.print( "Digitos : ");

        for ( i = 1; countVezes < num;  i ++) {
            int num2=sc.nextInt();
            System.out.print(num2 + " ");

            if (num2>maior) {
                maior =num2;
                countVezes++;
            }
            else{

                countVezes++;
            }


        }
        System.out.println( "maior: "+ maior);
        sc.close();
    }
}

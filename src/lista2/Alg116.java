package lista2;

import java.util.Arrays;
import java.util.Scanner;

//Alg 116: entrar com três números i imprimir o maior número
public class Alg116 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println( "Entre com o primeiro numero: ");
        int x= sc.nextInt();
        System.out.println( "Entre com o segundo numero: ");
        int y= sc.nextInt();
        System.out.println( "Entre com o terceiro numero: ");
        int z= sc.nextInt();

        if (x>y && x>z ) {
            System.out.println( "O Numero "+ x + " é maior");
        }
        else if (y>x && y>z){
            System.out.println( "O Numero "+ y+ " é maior");
        }
        else{
            System.out.println( " O Numero "+ z+ " é maior");
        }


        // usando arrays
       /* int numeros []= new int[3];
        numeros [0]= x;
        numeros [1]= y;
        numeros [2]= z;

        Arrays.sort( numeros);
        System.out.println( "O maior número é :"+ (numeros[2]));

        */
        sc.close();


    }
}

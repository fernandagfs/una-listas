package lista2;//Alg 117: entrar com três números e armazenar o maior número na variável de nome maior

import java.util.Scanner;

public class Alg117 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println( "Entre com o primeiro numero: ");
        int x= sc.nextInt();
        System.out.println( "Entre com o segundo numero: ");
        int y= sc.nextInt();
        System.out.println( "Entre com o terceiro numero: ");
        int z= sc.nextInt();

        int maior=0;

        if (x>y && x>z ) {
            maior= x;

        }
        else if (y>x && y>z){
            maior= y;

        }
        else{
            maior= z;

        }
        System.out.println( " O Numero "+ maior+ " é maior");
    }
}

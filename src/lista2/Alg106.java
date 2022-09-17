package lista2;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Scanner;

//Alg 106: entrar com o nome e imprimi-lo se o primeiro caractere for a letra A (considerar letra
//maiuscula ou minuscula)
public class Alg106 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Entre com seu Nome");
       /* char nome = sc.next().charAt(0);   // teria como usar o IgnoreCase?

        if (nome =='A') {
            System.out.println( " A primeira letra é A");
        }
        else if (nome == 'a'){
            System.out.println( "A primeira letra  é a");
        }
        else {
            System.out.println( "A primeira letra não é A");
        }*/
        String nome= sc.next().substring(0,1);
        if ( nome.equalsIgnoreCase( "a")){
            System.out.println( " O Nome começa com a letra A ");
        }
        else {
            System.out.println( "O nome não começa com a letra A");
        }








        sc.close();
    }
}

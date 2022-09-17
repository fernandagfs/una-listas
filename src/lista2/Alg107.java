package lista2;//Alg 107: entrar com o nome de uma pessoa e só imprimi-lo se o prenome for JOSE


import java.util.Scanner;

public class Alg107 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Entre com nome ");
        String nome= sc.nextLine().substring(0,4);

        if ( nome.equalsIgnoreCase( "JOSE")){
            System.out.println( " Pré nome é JOSE ");
        }
        else {

        }
        sc.close();
    }



}

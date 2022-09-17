package lista2;

import java.util.Scanner;

// Alg.90 Entrar com um numero e imprimi-lo caso seja maior que 20.
public class Alg90 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        //System.out.println( "Entre com um número: ");
        int numb= sc.nextInt();

        if (numb > 20){
            System.out.println( "Numero digitado: "+ numb);
        }
        else{
            System.out.println(" numero invalido");
        }
        sc.close();
    }
}

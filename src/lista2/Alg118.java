package lista2;

import java.util.Arrays;
import java.util.Scanner;

//Alg 118: entrar com três números e imprimi-lo em ordem crescente
public class Alg118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Entre com o primeiro numero: ");
        int numb1 = sc.nextInt();
        System.out.println( "Entre com o segundo numero ");
        int numb2 = sc.nextInt();
        System.out.println( "Entre com o terceiro numero ");
        int numb3 = sc.nextInt();
        int [] numeros= new int[ 3 ];  // opção da resolução com arrays
        numeros [0]= numb1;
        numeros [1]=numb2;
        numeros [2]= numb3;

        Arrays.sort( numeros );
        System.out.println( "Numeros em ordem decrescente = "+ (numeros[2])+","+(numeros[1]) + "," +(numeros[0]));

    }
}

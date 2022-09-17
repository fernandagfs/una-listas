package lista2;

import java.util.Arrays;
import java.util.Scanner;

//Alg 114: entrar com dois números e imprimi-los em ordem decrescente
public class Alg114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Entre com o primeiro numero: ");
        int numb1 = sc.nextInt();
        System.out.println( "Entre com o segundo numero ");
        int numb2 = sc.nextInt();

        int [] numeros= new int[ 2 ];  // opção da resolução com arrays
        numeros [0]= numb1;
        numeros [1]=numb2;

        Arrays.sort( numeros );
        System.out.println( "Numeros em ordem decrescente = "+ (numeros[1]) + "," +(numeros[0]));
//  opçao com arrays e if/else

       /*if (numb1> numb2){
            System.out.println( "Numeros em ordem decrescente= " + numb1+","+ numb2);
        }
        else {
            System.out.println( "Numeros em ordem decrescente = "+ numb2 + ","+ numb1);
        }*/

        sc.close();
    }
}

package lista2;

import java.util.Arrays;
import java.util.Scanner;

//Alg 113: entrar com dois números e imprimi-los em ordem crescente
public class Alg113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Entre com o primeiro numero: ");
        int numb1 = sc.nextInt();
        System.out.println( "Entre com o segundo numero ");
        int numb2 = sc.nextInt();

       /* int [] numeros= new int[ 2 ];  // opção da resolução com arrays
        numeros [0]= numb1;
        numeros [1]=numb2;

        Arrays.sort(numeros);
        System.out.println( "Numeros em ordem crescente = "+ (numeros[0]) + "," +(numeros[1]));

        */
        if (numb1> numb2){
            System.out.println( "Numeros em ordem crescente= " + numb2+","+ numb1);
        }
        else {
            System.out.println( "Numeros em ordem crescene = "+ numb1 + ","+ numb2);
        }
        sc.close();
    }
}

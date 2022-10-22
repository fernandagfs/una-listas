package lista6;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

//Alg 359: criar um algoritmo que deixe entrar com nome e idade de 20 pessoas e armazene em um
//vetor todos os nomes que comecem pela letra do intervalo de L – S.
public class Alg359 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        int idade [] = new int[5];
        String nome [] =  new String[5];

        for (int i = 0; i< idade.length; i++){
            System.out.println();
            System.out.println( "Entre com nome");
            String nome2 = sc.next().toUpperCase();
            char letra = nome2.charAt(0);
            System.out.println("Entre com idade");
            int idade2= sc.nextInt();

            if ( letra>= 76 &&  letra<=83 ){
                nome[i] = nome2;
                idade [i] = idade2;
                System.out.println( "Nome: "+ nome[i]);
                System.out.println( "Idade: "+ idade [i]);
            }
        }
        sc.close();
    }
}

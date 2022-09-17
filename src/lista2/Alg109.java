package lista2;

import java.util.Arrays;
import java.util.Scanner;

//Alg 109: criar um algoritmo que entre com dois nomes e imprimi-los em ordem alfabética
public class Alg109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println( " Entre com o primeiro nome");
        String nome1 = sc.next();
        System.out.println(" Entre com o segundo nomme");
        String nome2 = sc.next();


        char primeiraLetraNome1 = nome1.toCharArray()[0];
        char primeiraLetraNome2 = nome2.toCharArray()[0];

        System.out.println((int)primeiraLetraNome1);//valor da letra na tabela ascii
        System.out.println((int)primeiraLetraNome2);// valor da letra na tabela ascii

        if (primeiraLetraNome1 > primeiraLetraNome2) {
            System.out.println(nome2);
            System.out.println(nome1);
        } else {
            System.out.println(nome1);
            System.out.println(nome2);
        }


        // String primeriaLetraNome1 = nome1.substring(0, 0);
        // String primeriaLetraNome2 = nome2.substring(0, 0);

        /*String[] nomes = new String[2]; //criou um array com 2 posiçoes
        nomes[0] = nome1; //declarando a variavel
        nomes[1] = nome2;

        Arrays.sort(nomes); //metodo para ordenar

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);

         */
    }
}

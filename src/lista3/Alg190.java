package lista3;

import java.util.Scanner;

//Alg 190: entrar com um nome, idade, sexo de 20 pessoas. Imprimir o nome se a pessoa for do sexo
//masculino e tiver mais de que 21 anos.
public class Alg190 {
    public static void main(String[] args) {

        String nome, sexo = null;
        int idade;
        Scanner sc = new Scanner(System.in);


        for (int i = 1; i <= 20; i++) {
            System.out.println("Entre com nome:");
            nome = sc.next();
            System.out.println("Entre com a idade:");
            idade = sc.nextInt();
            System.out.println("Entre com sexo: ");
            sexo = sc.next();

                if (idade > 21 && sexo.equalsIgnoreCase("masculino")) {
                    System.out.println(nome);
                }
        }
        sc.close();


    }
}


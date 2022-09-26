package lista4;

import java.util.Scanner;

//Alg 277: Entrar com vários números e verificar se eles são ou não quadrados perfeitos. O algoritmo
//termina quando se digita um número menor ou igual a 0.
public class Alg277 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        double raiz = 0;
        double num = 1;

        while ( num > 0 ) {
            System.out.println();
            System.out.print("Entre com um numero inteiro ");
            num = sc.nextDouble();

            if (num > 0) {
                raiz = Math.sqrt(num);

                if (raiz - (int) raiz > 0) {
                    System.out.print("O numero não é quadrado perfeito \n");
                } else {
                    System.out.print("O numero é quadrado perfeito \n");
                }
            }
        }
         sc.close();


    }
}

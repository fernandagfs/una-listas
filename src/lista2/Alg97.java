package lista2;

import java.util.Scanner;

//ALG97 Entrar com um numero e informar se ele é divisivel por 10, por 5, por 2 ou se não é divisivel por nenhum destes.
public class Alg97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Entre com um numero:");
        int numb = sc.nextInt();

        if (numb % 10 == 0) {
            System.out.println("O Numero é divisivel por 10");
        } else {
            System.out.println(" Não é divisivel por 10");
        }
        if (numb % 5 == 0) {
            System.out.println(" O Numero é divisivel por 5 ");
        } else {
            System.out.println("Não é divisivel por 5");
        }
        if (numb % 2 == 0) {
            System.out.println(" O Numero é divisivel por 2");
        } else {
            System.out.println(" O Numero não é divisivel por 2:");
        }

    }
}

package lista6;

import java.util.Scanner;

//Alg 354: armazenar 15 números em um vetor NUM e imprimir uma listagem numerada contendo o
//número e uma das mensagens: par ou impar
public class Alg354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NUM[] = new int[15];

        for (int i = 0; i < NUM.length; i++) {
        System.out.println("Digite um numero ");
        NUM[i] = sc.nextInt();
    }
        for (int i = 0;i < NUM.length ; i++){
            System.out.println(NUM [i] + " - ");
            if (NUM [i] % 2 == 0 ){
                System.out.println("Par.");
            }
            else {
                System.out.println( "Impar.");
            }
            sc.close();

        }

    }
}

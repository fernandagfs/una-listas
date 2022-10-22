package lista6;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

//Alg 363: criar um algoritmo que leia vários números inteiros positivos. A leitura se encerra quando
//encontrar um número negativo ou quando o vetor ficar completo. Sabe-se que o vetor possui, no máximo
//10 elementos. Gerar e imprimir um vetor onde cada elemento é o inverso do correspondente do vetor
//original.
public class Alg363 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Entre com numero: ");
            int elemento = sc.nextInt();
            if (elemento > 0) {
                num[i] = elemento;
            } else {
                break;
            }
        }
        System.out.println("Valores do vetor: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
        System.out.println("Valores do vetor inverso: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[9 - i] +"," );
        }
    }
}


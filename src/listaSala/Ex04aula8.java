package listaSala;

import java.util.Scanner;

public class Ex04aula8 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Entre um valor de N: ");

                int N = sc.nextInt();
                if (N <= 0) {
                    System.out.println("Entre um valor maior do que zero para a execução do programa, por gentileza");
                    return;
                }

                double[] valores = new double[N];


                System.out.println();
                for(int i=0; i<N; i++) {
                    System.out.print("Entre um número qualquer: ");
                    valores[i] = sc.nextDouble();
                }

                double total = 0;
                System.out.println();
                for(int i=0; i<N; i++) {
                    System.out.printf("Valor entrado na posição %d: %.1f\n", i, valores[i]);
                    total = total + valores[i];
                }

                System.out.println();
                double media = total/N;
                System.out.printf("Média dos valores: %.2f", media);
            }
        }

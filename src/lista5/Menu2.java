package lista5;

import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor, conversao;
        int opcao;

        do {
            System.out.println("Menu");
            System.out.println("1- Para conversão Real - Dolar");
            System.out.println("2- Para conversão Dolar - Real");
            System.out.println("3- Para sair do programa ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Entre com o valor para conversão:");
                    valor = sc.nextDouble();
                    conversao = valor * 0.19;
                    System.out.printf("Conversão : %.2f dolares %n", conversao);
                    break;
                case 2:
                    System.out.println("Entre com o valor para conversão");
                    valor = sc.nextDouble();
                    conversao = valor * 5.40;
                    System.out.printf("Conversão : %.2f Reais %n", conversao);
                    break;
                case 3:
                    System.out.println("Encerrando o programa");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 3);
    }
}






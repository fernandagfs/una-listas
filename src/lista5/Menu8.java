package lista5;

import java.util.Scanner;
public class Menu8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1- Todas Maiuscula");
            System.out.println("2- Todas Minusculas");
            System.out.println("3- Para sair do programa");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Entre com nome");
                    String nome = sc.next();
                    System.out.println("O nome com as letras maiusculas: " + nome.toUpperCase());
                    break;
                case 2:
                    System.out.println("Entre com nome");
                    String nome2 = sc.next();
                    System.out.println("O nome com as letras minusculas: " + nome2.toLowerCase());
                    break;
                case 3:
                    System.out.println("Encerrado o programa");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        } while (opcao != 3);
        sc.close();
    }
}


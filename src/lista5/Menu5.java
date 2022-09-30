package lista5;

import java.util.Scanner;

public class Menu5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int opcao;



        do {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1- Primeira letra de um nome");
            System.out.println("2– Última letra de um nome");
            System.out.println("3- Letra do meio de um nome");
            System.out.println("4- Para sair do programa ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Entre com o nome");
                    char nome = sc.next().charAt(0);
                    System.out.println("A primeira letra do nome : " + nome);
                    break;
                case 2:
                    System.out.println("Entre com o nome ");
                    String name = sc.next();
                    char namefinal = name.charAt(name.length()-1);
                    System.out.println("A ultima letra do nome é : " + namefinal);
                    break;
                case 3:
                    System.out.println("Entre com o nome ");
                    String name2 = sc.next();
                    char nameMeio = name2.charAt((name2.length()-1)/2);
                    System.out.println("A letra do meio é : " + nameMeio);
                    break;
                case 4:
                    System.out.println("Encerrando o programa");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
        while ( opcao != 4);
        sc.close();
    }
}

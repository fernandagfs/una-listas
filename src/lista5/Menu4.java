package lista5;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Menu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao, numero, divisivel;

        do {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1- Verifica se o número e divisivel por 3");
            System.out.println("2- Verifica se o número e divisivel por 7");
            System.out.println("3- Para sair do programa");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Entre com o numero:");
                    numero = sc.nextInt();
                    if (numero % 3 == 0) {
                        System.out.println("Numero divisivel por 3");
                    } else {
                        System.out.println("Não é divisivel por 3");
                    }
                    break;
                case 2:
                    System.out.print("Entre com o numero:");
                    numero = sc.nextInt();
                    if (numero % 7 == 0) {
                        System.out.println("Numero divisivel por 7");
                    } else {
                        System.out.println("Não é divisivel por 7");
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
            while (opcao != 3) ;
        sc.close();
    }
}







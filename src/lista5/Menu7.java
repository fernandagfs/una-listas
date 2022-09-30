package lista5;

import java.util.Scanner;

public class Menu7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        double num;

        do {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1- Parte inteira de um numero real");
            System.out.println("2– Parte fracionaria de um numero real");
            System.out.println("3- Numero arredondado");
            System.out.println("4- Para sair do programa ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Entre com numero ");
                    num = sc.nextDouble();
                    System.out.println("A parte inteiro do numero:" + (int) num);
                    break;
                case 2:
                    System.out.println("Entre com numero ");
                    num = sc.nextDouble();
                    double fracionario = num - (int) num;
                    System.out.printf( "A parte fracionaria do numero %.2f %n", fracionario);
                    break;
                case 3:
                    System.out.println("Entre com numero ");
                    num = sc.nextDouble();
                    double arrendondar = Math.round( num );
                    System.out.println("O numero arrendondado é: "+ arrendondar);
                    break;


                case 4:
                    System.out.println( "Encerrado o Programa");
                    break;
                default:
                    System.out.println("Opção Invalida");

            }
        }while ( opcao != 5);
        sc.close();
    }
}

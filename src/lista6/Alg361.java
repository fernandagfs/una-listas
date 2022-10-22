package lista6;
//Alg 361: armazenar código, nome, quantidade, valor de compra e valor de venda de 30 produtos. A
//listagem pode ser de todos os produtos ou somente de um ao se digitar o código

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Alg361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigos[] = new int[3];
        String nomes[] = new String[3];
        int qtd[] = new int[3];
        double vlCompra[] = new double[3];
        double vlVenda[] = new double[3];

        for (int i = 0; i < codigos.length; i++) {
            System.out.print("Entre com o codigo do produto: ");
            codigos[i] = sc.nextInt();
            System.out.print("Entre com o nome do produto: ");
            nomes[i] = sc.next();
            System.out.print("Entre com a quantidade do produto: ");
            qtd[i] = sc.nextInt();
            System.out.print("Entre com o Valor de Compra: ");
            vlCompra[i] = sc.nextDouble();
            System.out.print("Entre com o Valor de Venda: ");
            vlVenda[i] = sc.nextDouble();
            System.out.println();
        }
        while (true) {

            System.out.println("Tirar listagem de todos os produtos [S] ou [N]");
            char entrada = sc.next().charAt(0);

            for (int i = 0; i < codigos.length; i++) {

                if (entrada == 'S') {
                    System.out.printf("Código: %d%n", codigos[i]);
                    System.out.printf("Nome: %s%n", nomes[i]);
                    System.out.printf("Quantidade: %d%n", qtd[i]);
                    System.out.printf("Valor de Compra: R$ %.2f%n", vlCompra[i]);
                    System.out.printf("Valor de Venda: R$ %.2f%n", vlVenda[i]);
                    System.out.println();
                } else if (entrada == 'N') {
                    System.out.print("Digite o codigo do produto");
                    int entrada2 = sc.nextInt();
                    for (int j = 0; j <= codigos.length; j++) {
                            if (entrada2 == codigos [j]) {
                                int indice = j;
                                System.out.println();
                                System.out.printf("Codigo: %d%n", codigos[indice]);
                                System.out.printf("Nome: %s%n", nomes[indice]);
                                System.out.printf("Quantidade: %d%n", qtd[indice]);
                                System.out.printf("Valor de Compra: %.2f%n", vlCompra[indice]);
                                System.out.printf("Valor de Venda: %.2f%n", vlVenda[indice]);
                                System.out.println();
                            }
                    }
                }

            }
        }

    }
}



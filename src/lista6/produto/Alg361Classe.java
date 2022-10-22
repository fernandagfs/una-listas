package lista6.produto;
//Alg 361: armazenar código, nome, quantidade, valor de compra e valor de venda de 30 produtos. A
//listagem pode ser de todos os produtos ou somente de um ao se digitar o código

import java.util.Scanner;

public class Alg361Classe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        Produto produtos[] = new Produto[3];

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Entre com o codigo do produto: ");
            int codigo = sc.nextInt();

            System.out.print("Entre com o nome do produto: ");
            String nome = sc.next();

            System.out.print("Entre com a quantidade do produto: ");
            int quantidade = sc.nextInt();

            System.out.print("Entre com o Valor de Compra: ");
            float valorCompra = sc.nextFloat();

            System.out.print("Entre com o Valor de Venda: ");

            float valorVenda = sc.nextFloat();
            System.out.println();

            Produto produto = new Produto();
            produto.setCodigo(codigo);
            produto.setNome(nome);
            produto.setQuantidade(quantidade);
            produto.setValorCompra(valorCompra);
            produto.setValorVenda(valorVenda);

            produtos[i] = produto;
        }
        while (true) {

            System.out.println("Tirar listagem de todos os produtos [S] ou [N]");
            char entrada = sc.next().charAt(0);

            for (int i = 0; i < 3; i++) {

                if (entrada == 'S') {

                    Produto produto = produtos[i];

                    System.out.printf("Código: %d%n", produto.getCodigo());
                    System.out.printf("Nome: %s%n", produto.getNome());
                    System.out.printf("Quantidade: %d%n", produto.getQuantidade());
                    System.out.printf("Valor de Compra: R$ %.2f%n", produto.getValorCompra());
                    System.out.printf("Valor de Venda: R$ %.2f%n", produto.getValorVenda());
                    System.out.println();

                } else if (entrada == 'N') {

                    System.out.print("Digite o codigo do produto");
                    int codigoDigitadoProduto = sc.nextInt();

                    for (int j = 0; j <= produtos.length; j++) {
                        Produto produto = produtos[j];

                        if (codigoDigitadoProduto == produto.getCodigo()) {
                            System.out.println();
                            System.out.printf("Código: %d%n", produto.getCodigo());
                            System.out.printf("Nome: %s%n", produto.getNome());
                            System.out.printf("Quantidade: %d%n", produto.getQuantidade());
                            System.out.printf("Valor de Compra: R$ %.2f%n", produto.getValorCompra());
                            System.out.printf("Valor de Venda: R$ %.2f%n", produto.getValorVenda());
                            System.out.println();
                        }
                    }
                }
            }
        }

    }
}



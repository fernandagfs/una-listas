package lista1;

import java.util.Scanner;

//Alg 62: Em épocas de pouco dinheiro, os comerciantes estão procurando aumentar suas vendas oferecendo
// desconto. Faça um algoritmo que possa entrar com o valor de um produto e imprima o novo valor tendo
// em vista que o desconto foi de 9%.
public class Alg62 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com valor do produto: ");
        double vlproduto= sc.nextDouble();

        double novoVl= vlproduto-(vlproduto*0.09);
        System.out.printf("Novo Valor do Produto R$ %.2f%n",novoVl);

    }
}

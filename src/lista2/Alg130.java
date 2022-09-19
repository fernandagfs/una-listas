package lista2;

import java.util.Scanner;

//Alg 130: um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da
//compra for menor que R$ 20,00; caso contrário, o lucro será de 30%. Entrar com o valor do produto
//e imprimir o valor da venda
public class Alg130 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com o valor do produto");
        double valor= sc.nextDouble();

        double vlVenda;

        if (valor < 20.00){
            vlVenda= valor + (valor* 0.45);
        }
        else {
            vlVenda= valor + (valor * 0.30);
        }
        System.out.printf( "Valor de venda: R$ %.2f%n", vlVenda);
    }
}

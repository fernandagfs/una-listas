package lista6;

import java.util.Scanner;

//Alg 358: criar um algoritmo que leia o preço de compra e o preço de venda de 100 mercadorias. O
//algoritmo deverá imprimir quantas mercadorias proporcionam: lucro de < 10%, lucro de mais de 10% e
//menos e igual de 20% ; lucro de mais de 20%.
public class Alg358 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precoCompra[] = new double[4];
        double precoVenda[] = new double[4];
        double lucro[] = new double[4];
        int menorQDez = 0;
        int maiorQDez = 0;
        int iqualVinte = 0;
        int maiorQVinte = 0;

        for (int i = 0; i < precoCompra.length; i++) {
            System.out.print("Entre com o preço de Compra: ");
            precoCompra[i] = sc.nextDouble();
            System.out.print("Entre com o preço de Venda: ");
            precoVenda[i] = sc.nextDouble();
            System.out.println();
            lucro[i] = ((precoVenda[i] - precoCompra[i]) / precoCompra[i]) * 100;
        }
        for (int i = 0; i < precoCompra.length; i++) {
            if (lucro[i] < 10.00) {
                menorQDez++;
            } else if (lucro[i] >= 10.00 && lucro[i] < 20.00) {
                maiorQDez++;
            } else if (lucro[i] == 20.00) {
                iqualVinte++;
            } else {
                maiorQVinte++;
            }
        }
        System.out.println("Quantidade de produto com lucro menor de 10% : "+ menorQDez);
        System.out.println("Quantidade de produto com lucro maior que 10% : "+ maiorQDez);
        System.out.println("Quantidade de produto com lucro iqual a 20% : "+ iqualVinte);
        System.out.println("Quantidade de produto com lucro maior que 20% : "+ maiorQVinte);
        sc.close();
    }
}

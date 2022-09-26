package lista3;
//Alg 207: sabendo-se que a UAL calcula o produto através de somas sucessivas, criar um algoritmo
//que calcule o produto de dois números lidos. Suponha que os números lidos sejam positivos e que o
//multiplicando seja menor do que o multiplicador

import java.util.Scanner;

public class Alg207 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println("Entre com multiplicando");
        double multiplicando= sc.nextDouble();

        System.out.println("Entre com o multiplicador");
        double multiplicador= sc.nextDouble();

        double produto = 0;

        for (int i = 0; i < multiplicando ; i++) {
            produto = produto + multiplicando;
        }
        System.out.println("Produto: "+ produto);
        sc.close();
    }
}

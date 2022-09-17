package lista1;

import java.util.Scanner;

//Alg 68: Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma que
// a variável A passe a ter o valor da variável B e que a variável B passe a ter o valor da variável A.
// Apresentar os valores trocados.
public class Alg68 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com valor A: ");
        double vlA= sc.nextDouble();
        System.out.println("Entre com valor B: ");
        double vlB= sc.nextDouble();

        double vltrocadoA= vlB;
        double vltrocadoB= vlA;
        System.out.println("Valor Trocado de A= "+vltrocadoA);
        System.out.println("Valor Trocado de B= "+vltrocadoB);
        sc.close();
    }
}

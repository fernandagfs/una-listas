package lista1;

import java.util.Scanner;

//Alg 77: Ler dois números reais e imprimir o quadrado da diferença do primeiro valor pelo segundo e
// a diferença dos quadrados.
public class Alg77 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite um número real: ");
        double num1= sc.nextDouble();
        System.out.println("Digite outro número real: ");
        double num2= sc.nextDouble();

        double quadradoDaDiferenca = (num1 * num1) - (2*num1*num2) + (num2 * num2);
        double diferencaDoQuadrado = (num1 * num1) - (num2 * num2);

        System.out.println("Quadrado da diferença de dois valores: " + quadradoDaDiferenca);
        System.out.println("A diferença dos quadrados: "+ diferencaDoQuadrado);


    }
}

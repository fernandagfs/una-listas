package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

//Alg 74: Para vários tributos, a base de cálculo é o salário mínimo. Fazer um algoritmo que leia o valor
// do salário mínimo e o valor do salário de uma pessoa.
// Calcular e imprimir quantos salários mínimos ela ganharia.
public class Alg74 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com o salario Minimo; ");
        double salariominimo= sc.nextDouble();

        System.out.println("Entre com seu sálario; ");
        double seusalario= sc.nextDouble();

        double quantossal= seusalario/ salariominimo;
        System.out.println("Você Recebe "+new DecimalFormat("00.00").format(quantossal) +" salários minimos");

    }
}

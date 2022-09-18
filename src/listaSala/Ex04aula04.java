package listaSala;

import java.util.Scanner;

//Exercício 04) Faça um programa Java no qual o usuário entra o valor do seu
//salário mensal e o programa calcula e apresenta na tela quanto de imposto de
//renda será descontado por mês (considere apenas o valor tabelado sem contar
//dependentes , dedução e etc) e o total de desconto no ano. Qual tipo de dados
//devemos usar? Por que?

// ver com o professor se e % ou valor
public class Ex04aula04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com seu Salario Mensal: ");
        double salario = sc.nextDouble();

        if (salario <= 1903.98) {
            System.out.println("Não tem desconto IR");
            System.out.printf("Salário anual= R$ %.2f%n", (salario * 12));

        } else if (salario >= 1903.99 && salario <= 2826.65) {
            double desconto = salario * 0.075; // 142.80
            System.out.printf("Valor de desconto IR mensal: %.2f%n ", desconto);
            System.out.printf("Valor de desconto IR Anual: %.2f%n", (desconto * 12));

        } else if (salario >= 2826.66 && salario <= 3751.05) {
            double desconto = salario * 0.15;//354.80
            System.out.printf("Valor de desconto IR mensal: %.2f%n ", desconto);
            System.out.printf("Valor de desconto IR Anual: %.2f%n", (desconto * 12));

        }
        else if (salario >= 3751.06 && salario <= 4466.68) {
            double desconto = salario * 0.225;//636.13
            System.out.printf("Valor de desconto IR mensal: %.2f%n ", desconto);
            System.out.printf("Valor de desconto IR Anual: %.2f%n", (desconto * 12));

        } else if (salario >= 4664.69) {
            double desconto = salario * 0.275;//869.36
            System.out.printf("Valor de desconto IR mensal: %.2f%n ", desconto);
            System.out.printf("Valor de desconto IR Anual: %.2f%n", (desconto * 12));
        }
    }
}


package lista2;//g 98: a prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estaduais. O
//valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um algoritmo que
//permita entrar com o salário bruto e o valor da prestação e informar se o empréstimo pode ou não
//ser concedido.

import java.util.Scanner;

public class Alg98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor do Salario bruto: ");
        double salario = sc.nextDouble();
        System.out.println("Entre com o valor da prestação: ");
        double prestacao = sc.nextDouble();

        double PrestacaoAceitavel = salario * 0.30;

        if (prestacao < PrestacaoAceitavel) {
            System.out.println(" Emprestimo pode ser concedido ");
        } else {
            System.out.println(" Emprestimo não pode ser concedido ");
        }
        sc.close();
    }
}


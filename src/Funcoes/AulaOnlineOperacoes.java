package Funcoes;

import java.util.Scanner;

public class AulaOnlineOperacoes {
    //aqui outras funções
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        double resultado;
        resultado = a - b;
        return resultado;
    }

    public static double multiplicacao(double a, double b) {
        double resultado;
        resultado = a * b;
        return resultado;
    }

    public static double divisao(double a, double b) {
        double resultado;
        resultado = a / b;
        return resultado;
    }

    public static void exibe(double soma, double subt, double mult, double divi) {
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + subt);
        System.out.println("Resultado da multiplicação: " + mult);
        System.out.println("Resultado da divisão: " + divi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com um valor real para x, por gentileza: ");
        double x = sc.nextDouble();
        System.out.print("Entre com um valor real para y, por gentileza: ");
        double y = sc.nextDouble();
        double somaResult = soma(x, y);
        double subtracaoResult = subtracao(x, y);
        double multiplicacaoResult = multiplicacao(x, y);
        double divisaoResult = divisao(x, y);
        exibe(somaResult, subtracaoResult, multiplicacaoResult, divisaoResult);
    }
}

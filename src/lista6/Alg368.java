package lista6;

import java.util.Scanner;

//Alg 368: criar um algoritmo que, dados dois vetores de 10 posições cada, efetue as operações
//aritméticas básicas, indicadas por um terceiro vetor cujos dados também são fornecidos pelo usuário,
//gerando e imprimindo um quarto vetor.
public class Alg368 {
    static Scanner sc = new Scanner(System.in);

    public static int[] criarVetor() {
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero inteiro: ");
            vetor[i] = sc.nextInt();
        }
        return vetor;
    }

    public static char[] entrarOperacao() {
        char[] operacoes = new char[10];
        for (int i = 0; i < operacoes.length; i++) {
            System.out.print("Entre com a operação aritmetica:(+, -, * ou /)");
            String operacao = sc.next();
            operacoes[i] = operacao.charAt(0);
        }
        return operacoes;
    }

    public static float[] resultadoOperacao(int[] vetor1, int[] vetor2, char[] vetor3) {
        float[] resultadoOperacoes = new float[10];
        for (int i = 0; i < resultadoOperacoes.length; i++) {
            if (vetor3[i] == '+') {
                resultadoOperacoes[i] = vetor1[i] + vetor2[i];
            } else if (vetor3[i] == '-') {
                resultadoOperacoes[i] = vetor1[i] - vetor2[i];
            } else if (vetor3[i] == '*') {
                resultadoOperacoes[i] = vetor1[i] * vetor2[i];
            } else if (vetor3[i] == '/') {
                resultadoOperacoes[i] = vetor1[i] / vetor2[i];
            }
        }
        return resultadoOperacoes;
    }


    public static void main(String[] args) {
        int[] vetorNum1 = criarVetor();
        char[] operacaoAritmetica = entrarOperacao();
        int[] vetorNum2 = criarVetor();
        float[] resultado = resultadoOperacao(vetorNum1,vetorNum2,operacaoAritmetica);
        for(int i = 0; i< resultado.length ; i++){
            System.out.println("O resultado da operação entre: "+
                    vetorNum1[i] +" "+ operacaoAritmetica[i]+ " "+
                    vetorNum2 [i]+ " = "+ resultado[i]);
        }
    }
}

package Funcoes;

import java.util.Scanner;

//Alg 367: criar um algoritmo que leia dados para um vetor de 10 elementos inteiros. Imprimir o
// maior, o menor, o percentual de números pares e a média dos elementos no vetor.
public class AulaOnline367 {

    //criar uma função pra declarar e ler um vetor de 10 elementos inteiros
    public static int [] criarVetor (){
        int[] vetor = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<vetor.length; i++) {
            System.out.println("Digite um numero inteiro: ");
            vetor[i] = sc.nextInt();
        }
        sc.close();
        return  vetor;
    }
    //criar uma função que recebe um vetor de inteiros e retorna o maior valor deles
    public static int pegarMaior(int [] vetor) {
        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    //criar uma função que recebe um vetor de inteiros e retorna o menor valor deles
    public static int pegarMenor (int [] vetor) {
        int menor = vetor [0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    //criar uma função que recebe um vetor de inteiros e retorna o percentual de números pares
    public static double acharPercentual(int [] vetor) {
        int p = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                p ++;
            }
        }
        double percentual = (p * 100)/ vetor.length;
        return percentual;
    }

    //criar uma função que recebe um vetor de inteiros e retorna a média dos valores do vetor

    public static double acharMedia (int [] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        double media = soma / vetor.length;
        return media ;
    }


    public static void main(String[] args) {
        int [] vetor = criarVetor();

        int valorMaior= pegarMaior(vetor);
        System.out.println("Maior numero:" + valorMaior);
        int valorMenor = pegarMenor(vetor);
        System.out.println( "Menor Valor: "+ valorMenor);
        double percentual = acharPercentual(vetor);
        System.out.println("Percentual de valores pares: "+percentual);
        double media = acharMedia(vetor);
        System.out.println("Média dos valores: "+ media);
    }
}

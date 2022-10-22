package Funcoes;

import java.util.Scanner;

public class AulaOnline364 {

    //- criar uma função que declara, lê e retornar um array com os 10 elementos;
    public static int[] leVetor() {
        int[] vetor = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
        sc.close();
        return  vetor;
    }

    //- criar uma função que calcula e retorn o fatorial de um número
    //	- usar essa função pra gerar o array w com os fatoriais;
    public static int fatorial(int n) {
        int total = 1;
        for(int i=1; i<=n; i++) {
            total = total * i;
        }
        return total;
    }

    //- criar uma função que mostra todos os valores de um array recebido como argumento.
    public static void mostraVetor(int[] vetor) {
        for(int i=0; i<vetor.length; i++) {
            System.out.println("posição " + i + ", fatorial = " + vetor[i]);
        }
    }

    //Alg. 364: ler um vetor (array) vet de 10 elementos inteiros e obter um
    // vetor w cujos componentes são os fatoriais dos respectivos componentes de vet.
    public static void main(String[] args){
        int[] vetor = leVetor();
        int[] w = new int[vetor.length];
        for(int i=0; i<vetor.length; i++) {
            int n = vetor[i];
            w[i] = fatorial(n);
        }
        mostraVetor(w);
    }
}
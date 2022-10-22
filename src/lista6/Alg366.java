package lista6;

import java.util.Scanner;

//Alg 366: criar um algoritmo que armazene em dois vetores nome e profissão de 20 pessoas. Deverá
//sair uma lista no vídeo.
public class Alg366 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomes [] = new String[20];
        String profissoes [] = new  String[20];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Entre com nome: ");
            nomes[i] = sc.next();
            System.out.print("Entre com a profissão: ");
            profissoes[i] = sc.next();
            System.out.println();
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println();
            System.out.print("Nome: "+ nomes [i]+ "  ");
            System.out.print("Profissão: "+ profissoes [i]);
            System.out.println();
        }
        sc.close();

    }
}

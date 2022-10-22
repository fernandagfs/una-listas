package lista6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Alg 362: criar um algoritmo que leia dois conjuntos de números inteiros, tendo cada um 10 e 20
//elementos e apresente os elementos comuns aos conjuntos. Lembrem-se de que os elementos podem
//se repetir mas não podem aparecer repetidos na saída.
public class Alg362 {
    public static void main(String[] args) {

        int[] conj1 = {2, 2, 8, 0, 9, 12, 22, 50, 74, 11, 31};
        int[] conj2 = {3, 2, 7, 9, 12, 80, 71, 11, 51, 34, 22, 25, 31, 40, 43, 74, 10, 18, 70, 90};
        String encontrados = "";  // string vazia

        for (int i = 0; i < conj1.length; i++) {
            for (int j = 0; j < conj2.length; j++) {
                if (conj1[i] == conj2[j] && !encontrados.contains(conj1[i]+"")) { //nao contem na variavel encontrados o mesmo elemento
                    encontrados = encontrados + ", " + conj1[i]; // concatenação de strings
                }
            }
        }

        System.out.println(encontrados);
    }

}

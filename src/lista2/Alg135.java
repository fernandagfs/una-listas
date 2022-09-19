package lista2;

import java.util.Scanner;

//Alg 135: criar um algoritmo que leia a idade de uma pessoa e informar a sua classe eleitoral: não-
//eleitor (abaixo de 16 anos), eleitor obrigatório (entre 18 e 65 anos) e eleitor facultativo (entre 16 e 18
//e maior que 65 anos)
public class Alg135 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a idade");
        int idade = sc.nextInt();
        String categoria = "classe eleitoral";

        if (idade <= 16) {
            categoria = "não eleitor ";
        } else if (idade >= 18 && idade <=65) {
            categoria = "eleitor obrigatorio ";
        } else {
            categoria = "eleitor facultativo ";
        }
        System.out.println(categoria);
        sc.close();
    }
}

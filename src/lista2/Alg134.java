package lista2;

import java.util.Scanner;

//Alg 134: a confederação brasileira de natação irá promover eliminatórias para o próximo
//mundial. Fazer um algoritmo que receba a idade de um nadador e imprimir a sua categoria
//segundo a tabela a seguir:
public class Alg134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a idade");
        int idade = sc.nextInt();
        String categoria = "Categoria";

        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A ";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B ";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A ";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B ";
        } else if (idade >= 18) {
            categoria = "Senior ";
        }
        System.out.println( categoria);
    }
}

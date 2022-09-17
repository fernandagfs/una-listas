package lista1;

import java.util.Scanner;

//Alg 76: Criar um algoritmo que leia um número entre 0 e 60 e imprimir o seu sucessor,
// sabendo que o sucessor de 60 é 0. Não pode ser utilizado nenhum comando de seleção e nem de repetição.
public class Alg76 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Informe um número entre 0 e 60; ");
        int numero= sc.nextInt();
        int resultado=0;
        if (numero>=60) {
            resultado=0;
        } else {
            resultado = numero + 1;
        }
        System.out.println("O Sucessor é; "+resultado);
    }
}


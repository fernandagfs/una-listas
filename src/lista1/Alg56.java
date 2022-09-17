package lista1;

import java.util.Scanner;

//Alg 56: Entrar com nome e idade. Imprimir a seguinte saída:
//nome
//idade
public class Alg56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nome: ");
        String nome= sc.next();
        System.out.println("Idade: ");
        int idade= sc.nextInt();

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }
}

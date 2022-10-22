package Funcoes;

import java.util.Scanner;

public class Exercicio03 {
    public static String lername (String str){
        Scanner sc = new Scanner( System.in);
        System.out.println("Digite o nome: ");
        String retorno = sc.next();
        return retorno;
            }
    public  static String modificarNome (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digte o novo nome: ");
        String retorno = sc.next();
        return retorno;
    }

    public static void main(String[] args) {
        String nome = "";
        nome = lername(nome);
        System.out.println(nome);
        nome = modificarNome();
        System.out.println( nome);

    }
}

package Funcoes;

import java.util.Scanner;

public class Testando {

    public static void teste (){
        Scanner sc = new Scanner(System.in);
        int recebe = sc.nextInt();
        System.out.println(recebe);
    }
    public static int valor(){
        Scanner sc = new Scanner( System.in);
        System.out.println("Digite um número: ");
        int resultado = sc.nextInt();
        return resultado;
    }
    public static void nomeEstudante(String nome){  //procedimento com parametro
        System.out.println("Nome do estudante : "+ nome);
    }
    public static String nomeCompleto (String nome, String sobrenome){ // função com parametro
        return "Nome completo: "+ nome + " " +sobrenome;
    }

    public static void main(String[] args) {
        //teste();
       // int numero = valor();
       // System.out.println( numero);
        nomeEstudante( "Carlos"); // usando procedimento com parametro
        System.out.println( nomeCompleto( "Fernanda", "Guimarães")); // usando função com função

    }
}

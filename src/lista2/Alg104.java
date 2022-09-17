package lista2;//Alg 104: entrar com nome, sexo e a idade de uma pessoa. Se a pessoa for do sexo feminino e tiver
//menos que 25 anos, imprimir nome e a mensagem: ACEITA. Caso contrario, imprimir nome e a
//mensagem: NÃO ACEITA.

import java.util.Scanner;

public class Alg104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Entre com seu Nome");
        String nome= sc.next();
        System.out.println(" Qual seu sexo (feminino) ou ( masculino)");
        String sexo= sc.next();
        System.out.println(" Qual sua idade");
        int idade= sc.nextInt();

        if ( sexo.equalsIgnoreCase("feminino") && idade < 25) { //IgnoreCase para ignorar letras maiusculas e minusculas
            System.out.println(nome + ": ACEITA.");
        }
        else {
            System.out.println( nome + ": NÃO ACEITO");
        }
    }
}

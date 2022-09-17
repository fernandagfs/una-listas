package lista2;//Alg 103: entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade da pessoa.
//Não se esqueça de verificar se o ano de nascimento é um ano válido.

import java.util.Scanner;

public class Alg103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o ano do nascimento");
        int AnoNascimento = sc.nextInt();
        System.out.println(" Entre com o ano atual");
        int AnoAtual = sc.nextInt();

        if (AnoNascimento < AnoAtual) {
            int idade = AnoAtual - AnoNascimento;
            System.out.println(" Idade é: " + idade);
        } else {
            System.out.println(" Ano de nascimnto inválido");
        }
    }
}

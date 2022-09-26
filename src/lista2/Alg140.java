package lista2;

import java.util.Scanner;

//Alg 140: um restaurante faz uma promoção semanal de descontos para clientes de acordo com as
//iniciais do nome da pessoa. Criar um algoritmo que leia o primeiro nome do cliente, o valor de sua
//conta e se o nome iniciar com as letras A, D, M ou S, dar um desconto de 30%. Para o cliente cujo
//nome não se inicia por nenhuma dessas letras, exibir a mensagem “Que pena. Nesta semana o
//desconto não é para seu nome, mas continue nos prestigiando que sua vez chegará”.
public class Alg140 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println( "Entre com o nome do cliente");
        String cliente= sc.nextLine().toUpperCase();
        System.out.println( "Entre com o valor da conta");
        double conta= sc.nextDouble();
        double contaComDesconto=0;

        char [] nome= cliente.toCharArray();

        if (nome [0] == 65 || nome [0] == 68 || nome [0] == 77 || nome [0] == 83 ) {
            contaComDesconto = conta - (conta * 0.30);
            System.out.printf( "O valor da sua conta com desconto: %.2f %n ", contaComDesconto);
        }
        else {
            System.out.println("Que pena, nesta semana o desconto nao e para seu nome mas continue nos prestigiando que sua vez chegara");
        }

        sc.close();
    }

}

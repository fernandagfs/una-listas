package lista2;

import java.util.Scanner;

//Alg 136: depois da liberação do governo para as mensalidade dos planos de saúde, as pessoas
//começaram a fazer pesquisas para descobrir um bom plano, não muito caro. Um vendedor de um
//plano de saúde apresentou a tabela a seguir. Criar um algoritmo que entre com o nome e a idade de
//uma pessoa e imprimir o nome e o valor que ela deverá pagar:
public class Alg136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Entre com o nome");
        String nome= sc.nextLine();
        System.out.println("Entre com a idade");
        int idade = sc.nextInt();
        double valorConvenio= 0;

        if (idade < 10) {
            valorConvenio = 30.00;
        }
        else if  (idade >= 10 && idade < 29) {
            valorConvenio = 60.00;
        }
        else if  (idade >= 29 && idade < 45) {
            valorConvenio = 120.00;
        }
        else if  (idade >= 45 && idade < 59) {
            valorConvenio = 150.00;
        }
        else if  (idade >= 59 && idade < 65) {
            valorConvenio = 250.00;
        }
        else {
            valorConvenio = 400.00;
        }
        System.out.println( nome);
        System.out.printf( "Valor a pagar: %.2f%n", valorConvenio);
    }
}

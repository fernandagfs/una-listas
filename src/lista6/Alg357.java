package lista6;

import java.util.Scanner;

// armazenar nome e salário de 20 pessoas. Calcular e armazenar o novo salário sabendo-se
//que o reajuste foi de 8%. Imprimir uma listagem numerada com nome e novo salário.
public class Alg357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] salario = new double [5];
        String [] nome = new String[5];
        for ( int i = 0 ; i< salario.length ; i ++) {
            System.out.println("Entre com o nome: ");
            nome[i] = sc.next();
            System.out.println("Entre com salario");
            salario[i] = sc.nextDouble();
        }
        double reajuste [] = new double[5];
        for (int i = 0; i < salario.length ; i ++){
            reajuste [i] = salario [i] + (salario [i] * 0.08 );
            System.out.printf("%d : %s - Novo salario: %.2f %n" ,(i +1), nome [ i ], reajuste [ i ]);
        }
    }
}


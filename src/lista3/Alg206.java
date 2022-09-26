package lista3;

import java.util.Scanner;

//Alg 206: criar um algoritmo que leia a quantidade de números que se deseja digitar para que posse
//ser impresso o maior e o menor número digitados. Não suponha que todos os números lidos serão
//positivos.
public class Alg206 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um numero:");
        int contVezes = sc.nextInt();
        int i = 1;
        double maior = Double.NEGATIVE_INFINITY; // vai começar com o menor valor negativo
        double menor  = Double.POSITIVE_INFINITY;// vai começar com o maior valor positivo


        for (i = 1; i <= contVezes; i++) {
            System.out.println(" Digite um numero");
            int valor = sc.nextInt();
            System.out.print(valor + " ");

            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor ){
                menor =valor;
            }


        }
        System.out.println("maior"+ maior);
        System.out.println(" menor"+ menor);
        sc.close();
    }
}

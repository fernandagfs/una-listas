package lista4;

import java.util.Scanner;

//Alg 263: Entrar com números enquanto forem positivos e imprimir quantos números foram digitados.
public class Alg263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com numero");
        int numero = sc.nextInt();
        int quantidade = 0;

        while (numero >= 0) {
            System.out.println("Entre com numero");
            int numero2 = sc.nextInt();
            numero = numero2;
            quantidade++;
        }
        System.out.println( "Numeros digitados foi: " + quantidade);
    }
}

package Funcoes;

import java.util.Scanner;

public class AulaOnlineFatorial {  // usando recursão
    public static int fatorial(int n) {
        if(n == 0) return 1;
        return n * fatorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um número inteiro maior ou igual a zero: ");
        int n = sc.nextInt();
        int fat = fatorial(n);
        System.out.printf("Fatorial de %d = %d\n", n, fat);
    }

}

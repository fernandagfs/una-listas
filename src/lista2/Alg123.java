package lista2;

import java.util.Scanner;

//Alg 123: ler três números, os possíveis lados de um triângulo, e imprimir a classificação segundo os
//lados
public class Alg123 {
    public static void main(String[] args) {


        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a == b && a == c && b == c) {
            System.out.println("Triangulo equilatero");

        } else if (a != b && b != c && c != a) {
            System.out.println("Triangulo escaleno");

        } else if (a == b || b == c || c == a) {
            System.out.println("Triangulo isosceles");
        }
        sc.close();
    }
}


package lista1;

import java.util.Scanner;

public class Alg68b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com valor A: ");
        double A = sc.nextDouble();
        System.out.println("Entre com valor B: ");
        double B = sc.nextDouble();
        A = B + A;
        B = A - B ;
        A = A - B;

        System.out.println("Valor Trocado de A= " + A);
        System.out.println("Valor Trocado de B= " + B);
        sc.close();
    }
}

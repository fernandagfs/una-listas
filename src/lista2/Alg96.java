package lista2;

import java.util.Scanner;

public class Alg96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com  um numero: ");
        int numb = sc.nextInt();
        if (numb % 3 == 0 && numb % 7 == 0) {
            System.out.println(" O numero é divisivel por 3 e 7: " + numb);
        }
    }
}

package listaSala;

import java.util.Scanner;

public class Alg1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] N = new int[20] ;

        for (int i = 0; i < 20; i++) {
            N[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            int j = 19 - i;
            int temp = N[i];
            N[j] = N[i];
            N[i] = temp;
        }
        for (int i = 0; i < 20; i++) {
            System.out.printf("N[%d] = %d\n", i, N[i]);

        }
    }
}


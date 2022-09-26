package lista4;

import java.util.Scanner;

//Alg 271: Dado um país A, com 5.000.000 de habitantes e uma taxa de natalidade de 3% ao ano, e um
//país B com 7.000.000 de habitantes e uma taxa de natalidade de 2% ao ano, calcular e imprimir o tempo
//necessário para que a população do país A ultrapasse a população do país B.
public class Alg271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempo = 0;
        double a = 5000;
        double b = 7000;

        while (b >= a) {

            a = a + (a * 0.03);
            b = b + (a *0.02);
            tempo++;
        }
        System.out.printf("É necessario %d anos para A ultrapassr a populacao de B", tempo);
    }
}

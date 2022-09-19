package lista2;

import java.util.Scanner;

//Alg 137: ler três valores inteiros (variáveis a, b, e c) e efetuar o cálculo da equação de segundo grau,
//apresentando: as duas raizes, se para os valores informados for possível fazer o cálculo (delta
//positivo ou zero); a mensagem “Não há raízes reais”, se não for possível fazer o cálculo (delta
//negativo); e a mensagem “Não é equação do segundo grau”, se o valor de a for igual a zero
public class Alg137 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com valor de a");
        int a = sc.nextInt();
        System.out.println("Entre com valor de b");
        int b = sc.nextInt();
        System.out.println("Entre com valor de c");
        int c = sc.nextInt();
        double delta, x1, x2;

        delta = (b * b) - (4 * a * c);
        x1 = -b + Math.sqrt(delta) / (2 * a);
        x2 = -b - Math.sqrt(delta) / (2 * a);
        if (a == 0) {
            System.out.println("Não é equação do segundo grau");
        } else if (delta >= 0) {
            System.out.println("Raiz positivo: " + x1);
            System.out.println("Raiz negativa: " + x2);
        } else {
            System.out.println("Não há raizes reais");
        }
        sc.close();
    }
}











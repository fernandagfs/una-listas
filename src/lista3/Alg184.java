package lista3;//lista3.Alg184 entrar com 8 números e, para cada número, imprimir o logaritmo desse número na base 10

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Alg184 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double i,numb;
        for(i=1;i<=8;i++) {
            numb = sc.nextDouble();
            System.out.println(calcularLogBase10(numb));
            System.out.println(calcularSoma(1, 20));
        }
    }

    public static double calcularLogBase10(double numero) {
        return Math.log10(numero);
    }

    public static int calcularSoma(int a, int b) {
        return a + b;
    }
}

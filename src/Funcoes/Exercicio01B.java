package Funcoes;
// criar um procedimento para
import java.util.Scanner;

public class Exercicio01B {
    static double x ; //declaracao da variavel global x

    public  static  double calcularQuadrado (double y){
        return Math.pow( y,2);

    }
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num  = sc.nextDouble();
        double resultado = calcularQuadrado(num); //chamada do procedimento
        System.out.println(resultado);
        sc.close();

    }
}

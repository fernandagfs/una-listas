package Funcoes;
// criar funcao para calcular o quadrado de um numero x
import java.util.Scanner;

public class Exercicio01 {
   static double x ; //declaracao da variavel global x

    public  static  void calcularQuadrado (){
        x = Math.pow(x,2);
    }



    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        x = sc.nextDouble();
        calcularQuadrado(); //chamada do procedimento
        System.out.println(x);
        sc.close();

    }
}

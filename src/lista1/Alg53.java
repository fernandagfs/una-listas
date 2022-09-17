package lista1;

import java.util.Scanner;

//Alg 53: Entrar com os lados a, b, c, de um paralelepípedo. Calcular e imprimir a diagonal
public class Alg53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre com lado A, de um paralelepídedo: ");
        double ladoA= sc.nextDouble();
        System.out.println("Entre com lado B, de um paralelepídedo: ");
        double ladoB= sc.nextDouble();
        System.out.println("Entre com lado C, de um paralelepídedo: ");
        double ladoC= sc.nextDouble();

        double diagonal=Math.sqrt(Math.pow(ladoA,2)+Math.pow(ladoB,2)+Math.pow(ladoC,2));

        System.out.println("Diagonal do paralelepípedo é: "+diagonal);
    }
}

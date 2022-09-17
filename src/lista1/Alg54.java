package lista1;

import java.util.Scanner;

//Alg 54: Criar um algoritmo que calcule i emprima a área de um triângulo
public class Alg54 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com Base do Trinângulo:");
        double base= sc.nextDouble();
        System.out.println("Entre com Altura do Trinângulo:");
        double altura= sc.nextDouble();

        double area= (base*altura)/2;
        System.out.println("Área do triângulo: "+area);

    }
}

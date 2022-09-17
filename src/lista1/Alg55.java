package lista1;

import java.util.Scanner;

//Alg 55: Criar um algoritmo que calcule i emprima a área de um losango
public class Alg55 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com a diagonal Maior :");
        double D= sc.nextDouble();
        System.out.println("Entre com a diagonal menor ");
        double d= sc.nextDouble();

        double area= (D*d)/2; //area= (diametro maior* diametro menor/ 2)

        System.out.println("Valor da área do Losango é: "+ area);

    }
}

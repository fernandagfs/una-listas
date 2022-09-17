package lista1;

import java.util.Scanner;

// • Alg 50: Entrar com a base e a altura de um retângulo e imprimir a seguinte saída:
//Perimetro
//Área
//Diagonal
public class Alg50
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com base do Retângulo: ");
        double base= sc.nextDouble();
        System.out.println("Entre com altura do Retângulo: ");
        double altura= sc.nextDouble();

        double area= base*altura;
        double perimetro= (2* base)+ (2*altura);
        double diagonal= Math.sqrt(Math.pow(altura,2)+Math.pow(base,2));
        System.out.println("Perimetro: "+ perimetro);
        System.out.println("Área: "+area);
        System.out.println("Diagonal: "+ diagonal);


    }
}

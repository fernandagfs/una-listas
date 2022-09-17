package lista1;

import java.util.Scanner;

//    • Alg 51: Entrar com o raio de um circulo e imprimir a seguinte saída:
//Perimetro
//Área
public class Alg51 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com raio de um circulo: ");
        double raio= sc.nextDouble();

        double pi= 3.1415;
        double perimetro= 2*pi*raio;
        double area=pi*Math.pow(raio,2);

        System.out.println("Perimetro: "+perimetro);
        System.out.println("Área= "+ area);

    }
}

package lista1;

import java.util.Scanner;

//    • Alg 52: Entrar com o lado de um quadrado e imprimir a seguinte saída:
//Perimetro
//Área
//diagonal
public class Alg52 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com um lado de um quadrado: ");
        double ladoquadro= sc.nextDouble();

        double perimetro= 4*ladoquadro;
        double area= Math.pow(ladoquadro,2);
        double diagonal= ladoquadro* Math.sqrt(2);
        System.out.println("Perimentro= "+perimetro);
        System.out.println("Área: "+ area);
        System.out.println("Diagonal: "+ diagonal);
    }
}

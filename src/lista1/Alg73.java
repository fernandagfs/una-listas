package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

//    • Alg 73: Criar um algoritmo que receba um número real, calcular e imprimi:
//A parte inteira do número
//A parte fracionária do número
//O número arredondado
public class Alg73 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digte um número real; ");
        double numero= sc.nextDouble();

        int valor= (int) numero;
        double fracionario = numero- valor;
        double arrendodamento= Math.round(numero*100.0/100.0);

        System.out.println("A parte inteira do numero é ; "+ valor);
        System.out.println("A parte fracionario do número é: "+new DecimalFormat("00.00").format(fracionario));
        System.out.println("O número com arredondamento; "+ arrendodamento);
    }
}

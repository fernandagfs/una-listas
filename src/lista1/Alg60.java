package lista1;

import java.util.Scanner;

//Alg 60: Entrar com a razão de uma PA e o valor do 1º termo. Calcular e imprimir o 10º termo da série.
public class Alg60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre com o valor Razão da PA: ");
        int razao= sc.nextInt();
        System.out.println("Entre com o 1ºtermo: ");
        int primeirotermo= sc.nextInt();


        int termoSerie= primeirotermo+razao*(10-1);
        System.out.println("O 10º termo da série é: "+ termoSerie);

    }
}

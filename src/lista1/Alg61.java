package lista1;

import java.util.Scanner;

//Alg 61: Entrar com a razão de uma PG e o valor do 1º termo. Calcular e imprimir o 5º termo da série
public class Alg61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre com o valor Razão da PG: ");
        int razao= sc.nextInt();
        System.out.println("Entre com o 1ºtermo: ");
        int primeirotermo= sc.nextInt();

        double quintotermo= primeirotermo * Math.pow(razao,5-1);

        System.out.println("O 10º termo da série é: "+ quintotermo);


    }
}

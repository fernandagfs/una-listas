package lista1;

import java.util.Scanner;

//Alg 59: Entrar com os valores dos catetos de um triângulo retângulo e imprimir a hipotenusa
public class Alg59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre com Cateto oposto: ");
        int catetooposto= sc.nextInt();
        System.out.println("Entre com Cateto adjacente: ");
        int catetoadjacente= sc.nextInt();

        double hipotenusa= Math.sqrt(Math.pow(catetoadjacente,2)+Math.pow(catetooposto,2));
        System.out.println("Hipotenusa= "+ hipotenusa);

    }
}

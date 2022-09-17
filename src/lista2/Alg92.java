package lista2;//lista2.Alg92  construir um algoritmo que leia dois numeros e efetue a adição . Caso o valor somado seja maior que 20, este devera ser
// apresentado somando se ele mais 8,caso o valor seja menor ou iqual a  20, este deverá ser apresentado subtraindo se 5.

import java.util.Scanner;

public class Alg92 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println( " Digite o primeiro número: ");
        int vl1 = sc.nextInt();
        System.out.println( "Digite o segundo numero: ");
        int vl2= sc.nextInt();
        int soma= vl1+vl2;

        if (soma > 20) {
            System.out.println( "soma "+ (soma+8));

        }
        else {
            System.out.println( " resultado "+ (soma - 5));
        }
    }
}

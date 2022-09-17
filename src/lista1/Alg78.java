package lista1;

import java.util.Scanner;

//Alg 78: Dado um polígono conexo de n lados, podemos calcular o número de diagonais diferentes (nd) desse polígono pela
// formula: nd = n * (n - 3) / 2. Fazer um algoritmo que leia quantos lados tem o polígono, calcule e escreva o número de
// diagonais diferentes (nd) do mesmo.
public class Alg78 {
    public static void main(String[] args) {
        Scanner sc= new Scanner ( System.in );
            System.out.println( "Entre com o número de lados do Polígono: " );
            int lados = sc.nextInt();
            int diagonal= lados*(lados-3)/2;
            System.out.println( "Número de diagonais do polígono é: "+ diagonal);

    }
}

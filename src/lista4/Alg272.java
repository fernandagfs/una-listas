package lista4;

import java.util.Scanner;

//Alg 272: Chico tem 1.50m e cresce 2 centímetros por ano, enquanto Juca tem 1.10m e cresce 3
//centimetros por ano. Construir um algoritmo que calcule e imprima quantos anos serão necessários
//para que Juca seja maior que Chico.
public class Alg272 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempo = 0;
        double juca = 110;
        double chico = 150;

        while (chico >= juca) {
            juca = juca + 3;
            chico = chico + 2;
            tempo++;
        }

            System.out.println("Passou :" + tempo);



    }
}


package lista6;

import java.util.Scanner;

//Alg 360: criar um algoritmo que imprima o horóscopo de várias pessoas, a partir de sua data de
//nascimento (ddmm). O fim é determinado quando sei digita 9999 para data, considere que a data foi
//digitada corretamente.
public class Alg360 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int[] meses         = { 1,  2,  3,  4,  5,  6,  7,  8,  9, 10, 11, 12};
            int[] ultimosDias   = {20, 19, 20, 20, 20, 20, 21, 22, 22, 22, 21, 21};
            String[] signos = {
                    "Capricórnio", "Aquário", "Peixes", "Áries",
                    "Touro", "Gêmeos", "Cancer", "Leão",
                    "Virgem", "Libra", "Escorpião", "Sagitário"
            };

            int data = 0;
            while(true) {

                System.out.println("Entre uma data de nascimento (ddmm): ");
                data = sc.nextInt();

                if(data == 9999) {
                    break;
                }

                int dia = data/100;
                int mes = data % 100;

                String signo = null;
                int indice = mes - 1;
                if(dia <= ultimosDias[indice]) {
                    signo = signos[indice];
                } else {
                    signo = signos[indice+1];
                }
                System.out.println("Signo: " + signo);
            }

        }
    }
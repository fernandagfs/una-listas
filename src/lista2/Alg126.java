package lista2;

import java.util.Scanner;

//Alg 126: ler um número e imprimir se ele é igual a 5, a 200, a 400, se está no intervalo entre 500 e
//1000, inclusive, ou se ele está for dos escopos anteriores
public class Alg126 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        int num= sc.nextInt();

        if (num == 5 || num == 200 || num == 400) {
            System.out.println("o numero é iqual a " + num);
        }

            if (num >= 500 && num <=1000 ){
                System.out.println(" O numero esta no intervalo entre 500 a 1000");
            }
            else {
                System.out.println("O numero esta fora do escopo anterior");
            }







    }
}

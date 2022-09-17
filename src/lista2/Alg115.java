package lista2;//Alg 115: criar um algoritmo que deixe entrar com dois números e imprimir o quadrado do menor e a
//raiz quadrada do maior número

import java.util.Scanner;

public class Alg115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o primeiro numero: ");
        double numb1 = sc.nextInt();
        System.out.println("Entre com o segundo numero ");
        double numb2 = sc.nextInt();
        double quadrado;
        double raiz;

        if (numb1 > numb2) {
            raiz = Math.sqrt(numb1);
            quadrado = Math.pow(numb2, 2);
        } else {
            raiz = Math.sqrt(numb2);
            quadrado = Math.pow(numb1, 2);
        }
        System.out.println(" Raiz quadrada do maior numero é :" + raiz);
        System.out.println(" O quadrado do menor numero é : " + (int) quadrado);

        sc.close();


    }
}


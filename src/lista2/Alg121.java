package lista2;

import java.util.Scanner;

//Alg 121: efetuar a leitura de cinco números inteiros diferentes e identificar o maior e o menor valor
public class Alg121 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior = input.nextInt();  //o primeiro numero recebe maior e menor
        int menor = maior;

        int b = input.nextInt();   // apartir daqui a variavel recebe seu numero de acordo com a comparaçao
        if (b > maior) { maior = b; }
        if (b < menor) { menor = b; }

        int c = input.nextInt();
        if (c > maior) {maior = c;}
        if (c < menor) {menor = c;}

        int d = input.nextInt();
        if (d > maior) {maior = d;}
        if (d < menor) {menor = d;}

        int e = input.nextInt();
        if (e > maior) {maior = e;}
        if (e < menor) {menor = e;}

        System.out.println("Maior:" + maior);
        System.out.println("Menor:" + menor);

    }

}

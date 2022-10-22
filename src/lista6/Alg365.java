package lista6;

import java.util.Date;
import java.util.Scanner;

//Alg 365: uma pessoa muito organizada gostaria de fazer um algoritmo para armazenar os seguintes
//dados de um talonário total do mesmo: numero do cheque, valor, data e destino. Sabendo-se que o
//numero dos cheques pode ser variável e não ultrapassa 20, construa esse algoritmo que posse gerar
//um relatório.
public class Alg365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] num  = new int[20];
        double [] valor = new double[20];
        String [] data = new String [20];
        String [] destino = new String[20];

        for (int i = 0; i< num.length; i++){
            System.out.print( "Entre com numero do cheque: ");
            num [i] = sc.nextInt();
            System.out.print("Entre com o valor do cheque: ");
            valor[i] = sc.nextDouble();
            System.out.print( "Entre com a data do cheque: ");
            data [i] = sc.next();
            System.out.print("Entre com o destino: ");
            destino[i] = sc.next();
            System.out.println();

        }
        for (int i = 0; i< num.length; i++){
            System.out.println("Deseja tirar relatório de todos os cheques cadastrados? [S] ou [N]");
            char resposta = sc.next().toUpperCase().charAt(0);
            if (resposta == 'S') {
                for (int l = 0; l < num.length; l++) {
                    System.out.printf("Número do cheque: %d%n", num[l]);
                    System.out.printf("Valor do cheque:R$ %.2f%n", valor[l]);
                    System.out.printf("Data do cheque: %s%n", data[l]);
                    System.out.printf("Destino do cheque: %s%n", destino[l]);
                    System.out.println();
                }
            }
            else{
                System.out.println("Entre com o Número do cheque: ");
                int numb = sc.nextInt();
                for( int j = 0; j < num.length; j++){
                    if( numb == num[j]){
                        int indice = j;
                        System.out.println();
                        System.out.printf("Número do cheque: %d%n", num[indice]);
                        System.out.printf("Valor do cheque:R$ %.2f%n",valor[indice]);
                        System.out.printf("Data do cheque: %s%n", data[indice]);
                        System.out.printf("Destino do cheque: %s%n", destino [indice]);
                        System.out.println();
                    }
                }
            }
        }
        sc.close();

    }
}

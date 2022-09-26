package lista4;

import java.util.Scanner;

//Alg 267: entrar com profissão de várias pessoas enquanto forem diferentes de FIM e imprimir quantos
//são dentistas (considerar: DENTISTA, dentista, e Dentista).
public class Alg267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String nome2 = "A";
        int quantidade =0 ;


        while ( !nome2 .equalsIgnoreCase( "FIM") ){ //nome2 for diferente de fim encerra
            System.out.print( "Entre com nome de uma profissão ");
            String n2 = sc.nextLine();
            if ( n2 .equalsIgnoreCase("Dentista")){
                quantidade ++;
            }
            nome2 = n2 ;
        }
        System.out.println( "Quantidade de profissão dentista foi digitado: "+ quantidade);
        sc.close();
    }
}

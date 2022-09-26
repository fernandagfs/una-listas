package lista4;

import java.util.Scanner;

//Alg 266: entrar com nomes enquanto forem diferentes de FIM e imprimir o primeiro caracter de cada
//nome.
public class Alg266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String nome2 = "A";


        while ( !nome2 .equalsIgnoreCase( "FIM") ){ //nome2 for diferente de fim encerra
            System.out.print( "Entre com nome ");
            String n2 = sc.nextLine();
            char letra = n2 .charAt(0);
            System.out.println( letra);
            nome2 = n2 ;
        }
        sc.close();

    }
}

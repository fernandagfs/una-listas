package lista4;

import java.util.Scanner;

//Alg 276: Entra com a idade de várias pessoas e imprimir: o total de pessoas com menos de 21 anos e
//o total de pessoas com mais de 50 ano
public class Alg276 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        int total1 = 0;
        int total2 = 0;
        int idade = 1;

        while ( idade > 0){
            System.out.print( "Entre com a idade: ");
            idade = sc.nextInt();

            if ( idade > 0 && idade < 21 ){
                total1 ++ ;
            }
            else if ( idade > 50 ) {
                total2 ++;
            }
        }
        System.out.printf( "Total de pessoas com menos de 21 anos: %d%n", total1);
        System.out.printf( "Total de pessoas com mais de 50 anos: %d%n", total2);
        sc.close();
    }
}

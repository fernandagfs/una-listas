package lista4;

import java.util.Locale;
import java.util.Scanner;

//Alg 268: entrar com sexo de várias pessoas enquanto forem diferentes de N e imprimir quantas pessoas
//são do sexo feminino (considerar F ou f).
public class Alg268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        char sexo1 = 'f';
        int quantidade =0 ;


        while ( sexo1 == 'f' || sexo1 == 'm'){
            System.out.print( "Qual sexo (F) femnino e (M) masculino)");
            String n2 = sc.next().toLowerCase();
            char n3 = n2 .charAt(0);

            if ( Character.compare( n3,'f')==0)  { // COMPARACAO DE CHAR
                quantidade ++;

            }
            sexo1  = n3 ;
        }
        System.out.println( "Quantidade de pessoas do sexo feminino: "+ quantidade);
        sc.close();
    }
}

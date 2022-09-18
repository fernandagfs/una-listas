package lista2;

import java.util.Scanner;

//Alg 122: ler três números e imprimir se eles podem ou não ser lados de um triangulo
public class Alg122 {
    public static void main(String[] args) {

        int a,b,c;
        Scanner sc= new Scanner( System.in);
        a = sc.nextInt();
        b =sc.nextInt();       //"se a soma das medidas de dois lados e sempre que for maior que a terceira medida"
        c = sc.nextInt();

        if ( (a+b)> c || (a+c)> b || (b+c)>a ){
            System.out.println( "Pode ser formar um triangulo");
        }
        else {
            System.out.println( "Não podem formar um triangulo");
        }
        sc.close();

    }
}

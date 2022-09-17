package lista2;//• Alg 102: entrar com um número e imprimir uma das mensagens: maior do que 20, igual a 20 ou
//menor do que 20

import java.util.Scanner;

public class Alg102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " Entre com um número: ");
        int numb= sc.nextInt();

        if ( numb < 20){
            System.out.println( " O numero é menor que 20");
        }
        else if (numb == 20){
            System.out.println( " O numero é iqual a 20 ");
        }
        else {
            System.out.println( " O numero é maior que 20");
        }
        sc.close();
    }
}

package lista2;

import java.util.Scanner;

// lista2.Alg96 entrar com um numero e informar se ele é ou não divisivel por 5.
public class Alg95
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Digite um numero: ");
        int numb = sc.nextInt();

        if (numb % 5 ==0){
            System.out.println( " Eh divisivel por 5");
        }
        else {
            System.out.println( "Não é divisivel por 5");
        }
    }
}

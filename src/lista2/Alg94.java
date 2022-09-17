package lista2;

import java.util.Scanner;

//lista2.Alg94 Entrar com um numero e imprimir uma das mensagens: é multiplo de 3 ou não é multiplo de 3.
public class Alg94 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Digite um numero: ");
        int numb = sc.nextInt();

        if (numb % 3==0){
            System.out.println( " Eh divisivel por 3");
        }
        else {
            System.out.println( "Não é divisivel por 3");
        }
    }
}

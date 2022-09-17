package lista2;

import java.util.Scanner;

//lista2.Alg93 Entrar com um numero e imprimir a raiz quadrada do numero caso ele seja positivo e o quadrado do
// numero caso ele seja negativo.
public class Alg93 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println( " Entre com um número: ");
        int numb= sc.nextInt();


        if ( numb >=0) {

            System.out.println("Raiz quadrada é positivo: " + (Math.sqrt(numb)));
        }
        else {
            System.out.println("Quadrado é : " + (Math.pow(numb,2)));
        }
    }
}

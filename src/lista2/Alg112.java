package lista2;

import java.util.Scanner;

//Alg 112: entrar com dois números e imprimir o menor número
public class Alg112 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println(" Entre com o primeiro numero");
        int numb1= sc.nextInt();
        System.out.println( "Entre com o segundo numero ");
        int numb2= sc.nextInt();

        if (numb1 < numb2) {
            System.out.println("o numero " + numb1 + " é menor");
        }
        else {
            System.out.println(" O numero "+ numb2+ " é menor");
        }
        sc.close();
    }
}

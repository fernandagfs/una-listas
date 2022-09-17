package lista1;//Alg 40: Entrar com dois números inteiros e imprimir a seguinte saída:
// Dividendo
//Divisor
//Quociente
//resto

import java.util.Scanner;

public class Alg40 {
    public static void main(String[] args) {
        int resto,quociente; //quociente pode ser double também devido seu resultado.

        Scanner sc= new Scanner( System.in);
        System.out.print("Entre com um número inteiro: ");
        int v1= sc.nextInt();

         System.out.println("Entre com outro número inteiro: ");
        int v2=sc.nextInt();
        if (v2 == 0) {
            System.out.println("O Divisor não pode ser zero");
            return;
        }

        quociente= v1 / v2;
        resto=v1 %v2;

        System.out.println("Dividendo= "+v1);
        System.out.println("Divisor= "+v2);
        System.out.println("Quociente= "+quociente);
        System.out.print("Resto= "+resto);




    }
}

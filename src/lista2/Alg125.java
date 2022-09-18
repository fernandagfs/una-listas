package lista2;

import java.util.Scanner;

//Alg 125: entrar com a idade de uma pessoa e informar: se é maior de idade, se é menor de idade
//ou se é maior de 65 anos
public class Alg125 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        int idade= sc.nextInt();

        if (idade < 18){
            System.out.println( "Menor de idade");
        }
        else if (idade >= 65){
            System.out.println( "Maior que 65 anos");
        }
        sc.close();
    }
}

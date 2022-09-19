package lista2;

import java.util.Scanner;

//Alg 133: segundo uma tabela médica, o peso ideal está relacionado com a altura e o sexo.
//Fazer um algoritmo que receba a altura e o sexo de uma pessoa, calcular e imprimir o seu
//peso ideal, utilizando as seguintes formulas:
public class Alg133 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Entre com a altura");
        double altura= sc.nextDouble();
        System.out.println("SEXO:");
        System.out.println("(M) Mulher");
        System.out.println("(H) Homem");
        char sexo= sc.next().charAt(0);
        double pesoIdeal;

        if (sexo == 72 || sexo == 104 ){
            pesoIdeal= (72.7 *altura)-58;
            System.out.println("Peso ideal:"+pesoIdeal);
        }
        else if ( sexo == 77 || sexo == 109){
            pesoIdeal= (62.1 *altura)-44.7;
            System.out.println("Peso ideal:"+pesoIdeal);
        }
    }
}

package lista1;

import java.util.Scanner;

//Alg 63: Criar um algoritmo que efetue o cálculo do salário líquido de um professor.
// Os dados fornecidos serão: valor da hora aula, número de aulas dadas
// no mês e percentual de desconto do INSS.
public class Alg63 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Valor da hora aula: ");
        double vlHaula= sc.nextDouble();
        System.out.println("Número de aulas dadas mês: ");
        double quantAulas= sc.nextDouble();
        System.out.println("Percentual de desconto do INSS: ");
        double percINSS= sc.nextDouble();

        double salariobruto= quantAulas*vlHaula;
        double salariodescto=( salariobruto* percINSS)/100;
        double salarioliquido= salariobruto-salariodescto;
        System.out.println("Salário liquido= "+salarioliquido);



    }
}

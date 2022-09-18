package listaSala;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

//Exercício 01) Faça um programa Java no qual o usuário entra sua idade usando três valores
// de entrada: nroAnos, nroMeses e nroDias. O programa calcula a idade em quantidade de dias
// e apresenta como saída. Qual tipo de dados devemos usar?
public class Ex01aula3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Inserir sua idade em Ano:");
        int ano= sc.nextInt();
        System.out.println(" Inserir sua idade em meses:");
        int meses= sc.nextInt();
        System.out.println(" Inserir sua idade em dias:");
        int dias= sc.nextInt();

        int vl1=ano*365;
        int vl2= meses*30;
        int idadedias= vl1+vl2+dias;
        System.out.println(" Idade em dias é:"+ idadedias +"dias");
        sc.close();


    }
}

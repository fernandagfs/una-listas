package lista1;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

//Alg 80: Criar um algoritmo que leia a quantidade de fitas qe uma locadora de vídeo possui e o
// valor que ela cobra por cada aluguel, mostrando as informações pedidas a seguir
public class Alg80 {
    public static void main(String[] args) {
        Scanner sc= new Scanner ( System.in );
        System.out.println( "Qual a quantidade de fitas: ");
        int quantfitas= sc.nextInt();

        System.out.println ( "Qual o valor cobrado do aluguel por cada fita: ");
        double valoraluguel= sc.nextDouble();
            double pormes= quantfitas/3;
            double fat= pormes*valoraluguel*12;
        double multa= valoraluguel *0.10;
        double aluguelatraso= pormes/10;
        double ganhoatraso= aluguelatraso * multa;

        double danificado= quantfitas * 0.02;
        double recompra= danificado/10;

         double totaldefitas= quantfitas-danificado+recompra;

         System.out.println( "Total do faturamento anual: "+fat);
         System.out.println( "Ganho por atraso por mês: "+ganhoatraso);
         System.out.println( "Total de Fitas no final do ano: "+(int) totaldefitas);




    }
}

package lista2;

import java.util.Scanner;

//Alg 139: sabendo que somente os municípios que possuiem mais que 20.000 eleitores têm segundo
//turno nas eleições para prefeito caso o primeiro colocado tenha mais do que 50% dos votos, fazer
//um algoritmo que leia o nome do município, a quantidade de eleitores aptos, o número de vosoto do
//candidato mais votado e informar se ele terá ou não segundo turno e msua eleição municipal
public class Alg139 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com nome do municipio");
        String municipio = sc.nextLine();
        System.out.println("Entre com a quantidade eleitores aptos");
        int eletitores = sc.nextInt();
        System.out.println("Informe a quantidade de votos do candidato mais votado");
        int candidato = sc.nextInt();
        int segundoTurno;


        segundoTurno= eletitores/2;

        if( candidato >= segundoTurno){
            System.out.printf( "%s terá o segundo turno%n",municipio);
        }
        else{
            System.out.printf( "%s não terá o segundo turno%n",municipio);
        }

    }
}

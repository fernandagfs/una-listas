package lista1;//    • Alg 57: Entrar com as notas da PR1 e PR2 e imprimir a média final
//Truncada
//Arredondada

import java.util.Scanner;

public class Alg57 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com a nota Prova1: ");
        double PR1= sc.nextDouble();
        System.out.println("Entre com a nota Prova2: ");
        double PR2= sc.nextDouble();

        double media= (PR1+PR2)/2;
        double mediatruncada= ((PR1*0.05)+(PR2*0.05)+media);  //media trucada e 5% menos das medias+ a média
        double mediaarredondada= Math.round(media);

        System.out.println("A média truncada é: "+mediatruncada);
        System.out.println("A média arredondada é: "+mediaarredondada);






    }
}

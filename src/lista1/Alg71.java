package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

//Alg 71: Criar um algoritmo que leia um valor de hora e informe quantos minuts se parassram desde
// o início do dia.
public class Alg71 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Qual hora atual (Formato 24h): ");
        int horatual= sc.nextInt();
        System.out.println("Informe os minutos:  ");
        int minuatual= sc.nextInt();

        double minutos= (horatual*60)+minuatual;
        System.out.println("Se passaram "+new DecimalFormat( "00000").format(minutos) +"minutos do dia");

    }
}

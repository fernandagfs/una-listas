package lista1;//Alg 39: Entrar com dois números reais e imprimir a média aritmética com a mensagem média antes do resultado .

import java.util.Scanner;

public class Alg39 {
    public static void main(String[] args) {
        double vl1,vl2;

        Scanner sc= new Scanner(System.in);
        System.out.println("Digite um número real: ");
        vl1= sc.nextDouble();

        System.out.print("Digite outro número real: ");
        vl2=sc.nextDouble();

        double med = (vl1 + vl2) / 2;
        System.out.print( "A média dos valores: "+ med);
    }
}

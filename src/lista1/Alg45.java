package lista1;//    • Alg 45: Entrar com um número e imprimir a seguinte saída:
//número
//quadrado
//raiz quadrado

import java.util.Map;
import java.util.Scanner;

public class Alg45 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Digite um número: ");
        int v1= sc.nextInt();

        int numero=v1;
        int quadrado=v1*v1;
        int raizquadrada= (int) Math.sqrt(v1);

        System.out.println("Número: "+v1);
        System.out.println("Quadrado: "+ quadrado);
        System.out.println("Raiz Quadrada: "+raizquadrada);

    }
}

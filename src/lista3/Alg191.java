package lista3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

//Alg 191: criar um algoritmo que leia um número que será superior de um intervalo e o incremento (incr).
//Imprimir todos os números naturais de 0 até esse número. Suponha que os dois números lidos são
//maiores que zero. Exemplo: Limite superior: 20     Incremento: 5
// Saída: 0 5 10 15 20
public class Alg191 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println( "Entre com numero limite:");
        int limite= sc.nextInt();
        System.out.println("Entre com o incremento:");
        int incremento= sc.nextInt();

        for (int i=0; i<= limite;i= i+incremento) {
            if (i >= 0) {
                System.out.print(" "+i+" ");
            }
        }
        sc.close();
    }
}

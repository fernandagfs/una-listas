package Funcoes;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class AulaOnlineLerNotas {
    public static double calculaMedia(double[] notas) {
        double total = 0;
        for(int i=0; i<notas.length; i++) {
            total = total + notas[i];
        }
        double media = total/notas.length;
        return  media;
    }

    public static void mostraNotas(double[] notas, double media) {
        for(int i=0; i<notas.length; i++) {
            System.out.printf("Nota %d = %.2f, diferença da média: %.2f\n",
                    i, notas[i], notas[i] - media);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        System.out.println("Entre com as 10 notas: ");
        for(int i=0; i<notas.length; i++) {
            notas[i] = sc.nextDouble();
        }
        double media = calculaMedia(notas);
        System.out.printf("Média das notas da turma de PdSC: %.2f\n", media);
        mostraNotas(notas, media);
        sc.close();
    }

}
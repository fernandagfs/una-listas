package lista5;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

// Faça programa que implementem os seguinte menus de opçoes:
//menu
//1
public class Menu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        double temp, convertido;

        do {
            System.out.println("Menu");
            System.out.println("1: Converte de C para F ");
            System.out.println("2 : Convert de F para C ");
            System.out.println("3: Sair do programa ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Entre com a temperatura em Graus C: ");
                    temp = sc.nextDouble();
                    convertido = ((9 * temp) + 160) / 5;
                    System.out.println("Conversão: " + convertido + "F");
                    break;
                case 2:
                    System.out.println("Entre com a temperatura em Graus F: ");
                    temp = sc.nextDouble();
                    convertido = ((5 * temp) - 160) / 9;
                    System.out.println("Conversão: " + convertido + "C");
                    break;
                case 3:
                    System.out.println("Encerrando o programa");
                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 3);

    }

}

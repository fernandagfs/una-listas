package lista5;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Menu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada;
        double area, circunferencia, base, altura;

        do {
            System.out.println("Menu");
            System.out.println("1- Área do retầngulo");
            System.out.println("2-Área da circunferência");
            System.out.println("3-Área de um triângulo");
            System.out.println("4- Sair do programa");
            entrada = sc.nextInt();

            switch (entrada) {
                case 1:
                    System.out.println("Entre com a base ");
                    base = sc.nextDouble();
                    System.out.println("Entre com a altura ");
                    altura = sc.nextDouble();
                    area = base * altura;
                    System.out.println("Area do retangulo é " + area);
                    break;
                case 2:
                    System.out.println("Entre com raio:");
                    double raio = sc.nextDouble();
                    circunferencia = 3.14159265359 * Math.pow(raio, 2);
                    System.out.println("Area da circunferencia é " + circunferencia);
                    break;
                case 3:
                    System.out.println("Entre com a base:");
                    base = sc.nextDouble();
                    System.out.println("Entre com a altura ");
                    altura = sc.nextDouble();
                    area = (base * altura) / 2;
                    System.out.println("Area do triangulo é "+ area);
                    break;
                case 4:
                    System.out.println("Encerrando o programa");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while (entrada != 4);
    }
}



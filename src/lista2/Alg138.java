package lista2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

//Alg 138: ler um número inteiro entre 1 e 12 e escrever o mês correspondente. Caso usuário digite
//um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe mês
//com este número
public class Alg138 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com numero mes");
        int mes= sc.nextInt();

        switch ( mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Marco");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println(" Não exite mes com esse numero");
        }

    }
}

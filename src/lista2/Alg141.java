package lista2;

import java.util.Locale;
import java.util.Scanner;

//Alg 141: criar um algoritmo que leia o nome e o total de pontos de três finalistas de um campeonato
//de pingue-pongue e exibir a colocação da seguinte forma:
public class Alg141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do finalista");
        String finalista = sc.nextLine();
        System.out.println("Pontuação total");
        int pts1 = Integer.parseInt(sc.nextLine()); // como tem nextLine no meio do algoritmo, não entende que o enter faz parte
                                                    //da entrada. Para não ter erros, usei na entrada int, onde ler nextline e
        System.out.println("Nome do finalista");     // converte para inteiro.
        String finalista2 = sc.nextLine();
        System.out.println("Pontuação total");
        int pts2 = Integer.parseInt(sc.nextLine());

        System.out.println("Nome do finalista");
        String finalista3 = sc.nextLine();
        System.out.println("Pontuação total");
        int pts3 = Integer.parseInt(sc.nextLine());

        int primeiro = 0;
        int segundo = 0;
        int terceiro = 0;

        if (pts1 > pts2 && pts2 > pts3) {
            primeiro = pts1;
            segundo = pts2;
            terceiro = pts3;
        } else if (pts1 > pts3 && pts3 > 2) {
            primeiro = pts1;
            segundo = pts3;
            terceiro = pts2;
        } else if (pts2 > pts1 && pts1 > pts3) {
            primeiro = pts2;
            segundo = pts1;
            terceiro = pts3;
        } else if (pts2 > pts3 && pts3 > pts1) {
            primeiro = pts2;
            segundo = pts3;
            terceiro = pts1;
        } else if (pts3 > pts2 && pts2 > pts1) {
            primeiro = pts3;
            segundo = pts2;
            terceiro = pts1;
        } else if (pts3 > pts1 && pts1 > pts2) {
            primeiro = pts3;
            segundo = pts1;
            terceiro = pts2;
        }
        System.out.println("Vencedor:____________________" + primeiro + "pontos");
        System.out.println("Segundo colocado:____________" + segundo + "pontos");
        System.out.println("Terceiro colocado:___________" + terceiro + "pontos");


        sc.close();


    }
}

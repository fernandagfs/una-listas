package lista6;

import java.util.Scanner;

//Alg 356: armazenar nomes e notas das PR1 e PR2 de 15 alunos. Calcular e armazenar a media
// arredondada. Armazenar também a situação do aluno: AP ou RP. Imprimir uma listagem contendo
// nome, notas, média e situação de cada aluno, tabulando.
public class Alg356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];
        String[] situacao = new String[15];
        double[] media = new double[15];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println();
            System.out.print("Entre com nome do aluno: ");
            nomes[i] = sc.next();
            System.out.print("Entre com nota PR1: ");
            pr1[i] = sc.nextDouble();
            System.out.print("Entre com nota PR2: ");
            pr2[i] = sc.nextDouble();
            System.out.print("Situação do aluno AP ou RP: "); // entendi que o usuario colocaria se está AP ou RP. Caso tivesse
            situacao[i] = sc.next();                            // a média para aprovação era so fazer um if e else e jogar os dados no array.
            media[i] = pr1[i] + pr2[i] / 2;
        }
        System.out.println();
        System.out.println("Listagem de Alunos:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println();
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Nota PR1: " + pr1[i]);
            System.out.println("Nota PR2:" + pr2[i]);
            System.out.println("Média: " + Math.round(media [i]));
            System.out.println("Situação: " + situacao[i]);
        }
        sc.close();
    }
}

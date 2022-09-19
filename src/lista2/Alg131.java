package lista2;
//a turma de programação, por ter muitos alunos, será dividida em dias de prova. Após um
//estudo feito pelo coordenador, decidiu-se dividi-la em três grupos. Fazer um algoritmo que leia o
//nome do aluno e indicar a sala em que ele deverá fazer a prova, tendo em vista a tabela a seguir e
//sabendo-se que todas as aslas se encontram no bloco F.

import java.util.Scanner;

public class Alg131 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println("Entre com o nome do aluno: ");
        String nome= sc.next().toUpperCase(); //salva como string, e para maiusculo caso entrar com letra minuscula
        char [] nome2 =nome.toCharArray(); //cria um array char, e transforma a string em char

        if (nome2 [0] <=75){  //compara o valor do char perante a tabela ascii isso em letra maiuscula
            System.out.println( "Sala: 101");
        }
        else if (nome2 [0] >= 76 && nome2 [0]<=78) {
            System.out.println("Sala: 102");
        }
        else if (nome2 [0] >= 79 && nome2 [0] <=90) {
            System.out.println("Sala: 103");
        }
        sc.close();
    }
}

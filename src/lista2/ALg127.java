package lista2;

import java.util.Scanner;

//Alg 127: entrar com nome, nota da PR1 e nota da PR2 de um aluno. Imprimir nome, nota da PR1,
//nota da PR2, média e uma das mensagens: Aprovado, reprovado ou em prova final (a média é 7
//para aprovação, menor que 3 para reprovação e as demais em prova final)
public class ALg127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite primeira nota: ");
        int nota1 = sc.nextInt();

        System.out.println("Digite a segunda nota: ");
        int nota2 = sc.nextInt();

        int media = (nota1 + nota2) / 2;
        System.out.println("Nome: "+ nome);
        System.out.println("Nota prova 1: "+ nota1);
        System.out.println( "Nota prova 2 :"+ nota2);
        System.out.println( "Media: "+ media);

        if (media > 7){
            System.out.println( "Aprovado");
        }
        else if (media <3){
            System.out.println( "Reprovado");
        }
        else {
            System.out.println( "Prova final");
        }
        sc.close();
    }
}

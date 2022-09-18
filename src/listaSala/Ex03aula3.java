package listaSala;

import com.sun.org.apache.xerces.internal.xinclude.XIncludeNamespaceSupport;

import java.util.Locale;
import java.util.Scanner;

//Exercício 03) Faça um programa Java, no qual o usuário entra uma
// frase qualquer inicialmente e depois entra uma palavra qualquer.
// O programa mostra se a palavra entrada ocorre ou não na frase entrada inicialmente
public class Ex03aula3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase= sc.nextLine();
        System.out.println("Digite uma palavra: ");
        String palavra= sc.nextLine();

        if (frase.contains( palavra)){
            System.out.println( "Contém");
        }
        else
            System.out.println( "Não Contém");

    }
}

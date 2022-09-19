package lista2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

//Alg 128: entrar com um verbo no infinitivo e imprimir uma das mensagens: se o verbo não está no
//infinitivo, se o verbo é da 1a conjugação, se o verbo da 2a conjução, se o verbo é da 3a conjugação
public class Alg128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println( "Entre com um verbo no infinitivo");
        String verbo= sc.nextLine().toLowerCase();  //passando a string para minusculas

        if (verbo.endsWith( "ar")) {   // se verbo termina em...
            System.out.println("Verbo na primeira conjungacao ");
        }
        else if (verbo.endsWith( "er")) {
            System.out.println( "Verbo na segunda conjugacao");
        }
        else if (verbo.endsWith( "ir")){
            System.out.println( "Verbo na terceira conjugacao");
        }
        else {
            System.out.println( " O verbo não está no infinitivo");
        }
        sc.close();
    }
}

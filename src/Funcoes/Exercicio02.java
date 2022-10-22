package Funcoes;
// criar funcao/ procedimento/  para ler um nome e alterar.
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Exercicio02 {
    static String name ;

    public static void lerName ( ){
        Scanner sc = new Scanner(System.in);
        name = sc.next();


    }
    public static void mudarname (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite novo nome: ");
        name = sc.next();

    }

    public static void main(String[] args) {
        lerName();
        System.out.println( name );
        mudarname();
        System.out.println(name);


    }


}

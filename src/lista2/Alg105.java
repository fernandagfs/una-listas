package lista2;

import java.util.Scanner;

//Alg 105: entrar com a sigla do estado de uma pessoa e imprimir umas das mensagens:
//Carioca
//Paulista
//Mineiro
//outro estado
public class Alg105 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Entre com o seu estado");
        String estado= sc.next();


        switch ( estado) {
            case "RJ":
                System.out.println(" Carioca");
                break;
            case "SP":
                System.out.println(" Paulista ");
                break;
            case "MG":
                System.out.println("Mineiro");
                break;
            default:
                System.out.println("Outro Estado");
        }
        sc.close();
    }
}

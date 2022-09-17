import java.util.Scanner;

//Exercício 02) Faça um programa Java no qual o usuário entra as dimensões,
// largura e profundidade de um lote retangular e o programa apresenta como saída a
// área desse lote. Qual tipo de dados devemos usar?
public class Ex02aula3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Entre com a Largura do lote");
        float largura= sc.nextFloat();
        System.out.println( "Entre com a Profundidade do lote");
        float profundidade= sc.nextFloat();

        float area= profundidade*largura;
        System.out.println("A área do terreno é: "+area);
        sc.close();

    }
}

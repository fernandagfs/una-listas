package lista1;

import java.util.Scanner;

//Alg 65: Calcular e apresentar o valor do volume de uma lata de óleo,
// utilizando a fórmula: volume = 3.14159 * R2 * altura.
public class Alg65 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a altura da lata; ");
        int altura= sc.nextInt();
        System.out.println("Digite o raio da lata: ");
        int raio= sc.nextInt();

        double volume= 3.14159* Math.pow(raio,2)* altura;
        System.out.println("Volume da lata de oleo é: "+volume);
    }
}

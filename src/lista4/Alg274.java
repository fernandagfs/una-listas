package lista4;

import java.util.Scanner;

//Alg 274: criar um algoritmo que deixe entrar com 10 números postivos e imprimir raiz quadrada de cada
//número. Para cada entrada de dados deverá haver um trecho de proteção para que um número negativo
//não seja aceito
public class Alg274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raiz;
        int quantidade = 1;
        int n1;

        while (quantidade <= 10) {
            System.out.print("Entre com numero");
            int n2 = sc.nextInt();
            if (n2 > 0) {
                n1 = n2;
                raiz = Math.sqrt(n1);
                System.out.println("A raiz quadrada " + n1 + " é: " + raiz);
                quantidade++;
            }
        }
        sc.close();
    }
}

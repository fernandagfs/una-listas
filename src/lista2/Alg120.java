package lista2;

import java.util.Scanner;

//Alg 120: entrar com três números e armazená-los em três variáveis com os seguintes nomes: maior,
//intermediario e menor
public class Alg120 {
    public static void main(String[] args) {

        int maior, intermediario, menor,n1,n2,n3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("Entre com segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("Entre com terceiro numero: ");
        n3 = sc.nextInt();
        menor=0;
        intermediario=0;
        maior= 0;



        if((n1 > n2) && (n2 > n3)){
            menor = n3;
            intermediario = n2;
            maior = n1;
        }
        else if((n2 > n1) && (n3 > n1)){
            menor = n1;
            intermediario = n3;
            maior = n2;
        }
        else if((n3 > n2) && (n2 > n1)){
            menor = n1;
            intermediario = n2;
            maior = n3;
        }
        else if ((n3 > n1) && (n1 > n2)){
            menor = n2;
            intermediario = n1;
            maior = n3;
        }
        else if ((n1 > n3) && (n3 > n2)){
            menor = n2;
            intermediario = n3;
            maior = n1;
        }
        else if((n2 > n1) && (n1 > n3)) {
            menor = n3;
            intermediario = n1;
            maior = n2;
        }

        System.out.println( "Maior" + maior);
        System.out.println("Intermediario: " + intermediario);
        System.out.println("Menor: " + menor);
























    }
}





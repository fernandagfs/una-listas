package lista3;

//lista3.Alg181.criar um algoritmo que imprima todos os números de 1 até 100 e a soma deles
public class Alg181 {
    public static void main(String[] args) {
        int i;
        int soma=0;
        for(i=1;i<=100;i++){
            System.out.println( i );
            soma= i+soma;

        }
        System.out.println("Soma "+ soma);

    }



}

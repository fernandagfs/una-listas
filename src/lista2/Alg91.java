package lista2;//lista2.Alg91: Construir um algoritmo que  leia dois valores numéricos inteiros e efetue a adiação;
// caso o resultado seja maior que 10, aprenta-lo
import java.util.Scanner;
public class Alg91 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Entre com o primeiro valor: ");
        int Vl1= sc.nextInt();
        System.out.println( "Entre com o segundo valor: ");
        int Vl2= sc.nextInt();

        int soma=  Vl1+ Vl2;
        if ( soma >10){
            System.out.println( " Soma: "+ soma);
        }
        sc.close();

    }
}

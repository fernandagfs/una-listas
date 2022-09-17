package lista1;

import java.util.Scanner;

//Alg 81: Criar um algoritmo que dado um número de uma conta corrente com três dígitos,
// retorne o seu dígito verificador, o qual é calculado da seguinte maneira.
public class Alg81 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in );
        System.out.println( "Entre com o número da conta corrente com trẽs dígitos: ");
        int conta= sc.nextInt();

        int quocienteCentena = conta / 100;//quociente da divisão
        int restoCentena = conta % 100; //resto da divisão por 100

        int quocienteDezena = (conta % 100) / 10; //resto da divisão por 100 divido por 10
        int restoDezena = restoCentena % 10;//resto
        String numeroInvertido = String.valueOf(restoDezena) + String.valueOf(quocienteDezena) + String.valueOf(quocienteCentena);
            // conversão numero para string
        int numero= Integer.valueOf( numeroInvertido);// conversão string para numero
        int somaContaInvertido= conta+ numero;

        int quocienteC=somaContaInvertido / 100 ;
        int restoC= somaContaInvertido % 100 ;
        int quocienteD= (somaContaInvertido % 100) / 10;
        int restoD= restoC % 10;

        int multiplicacao1= restoD *1;
        int multiplicacao2= quocienteD *2;
        int multiplicacao3= quocienteC *3;

        int somatoriamultiplicacao= multiplicacao1 + multiplicacao2 + multiplicacao3;


        System.out.println( "Valor inverso: "+ numeroInvertido);
        System.out.println(" Somatoria da Conta com Inverso: "+ somaContaInvertido);
        System.out.println( " Somatoria da multiplicaçao; "+ somatoriamultiplicacao);






        // formas de transformar numero em string
        // 1. concatenar o numero com string vazia. Ex: (1 + "")
        // 2. Usar o método String.valueOf(numero)



    }
}

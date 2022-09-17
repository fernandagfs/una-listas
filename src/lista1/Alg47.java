package lista1;

import java.util.Scanner;

//Alg 47: Entrar com o número no formato CDU e imprimir invertido: UDC (Exemplo: 123, sairá 321).
// O número deverá ser armazenado em outra variável antes de ser impresso.
public class Alg47 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com número 3 digitos: ");
        int valor = sc.nextInt();

        int quocienteCentena = valor / 100;//quociente da divisão
        int restoCentena = valor % 100; //resto da divisão por 100

        int quocienteDezena = (valor % 100) / 10; //resto da divisão por 100 divido por 10
        int restoDezena = restoCentena % 10;//resto

        System.out.println("Valor inverso:" + restoDezena + quocienteDezena + quocienteCentena);
    }
}

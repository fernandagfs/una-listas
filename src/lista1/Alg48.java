package lista1;//    • Alg 48: Antes do racionamento de energia ser decretado, quase ninguém falava em quilowatts,
//    mas, agora, todos imcorporaram essa palavra em seu vocabulário. Sabendo-se que 100 quilowatts de
//    energia custa um sétimo do salário mínimo, fazer um algoritmo que receba o valor do salário mínimo e a
//    quantidade de quilowatts gasta por uma residência e calcule. Imprima:
//O valor em reais de cada quilowatt
//O valor em reais a ser pago
//O novo valor a ser pago por essa residência com um desconto de 10%

import java.util.Scanner;

public class Alg48 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com Salário Minimo: ");
        double salarioMinimo= sc.nextDouble();

        System.out.println("Qual o consumo de energia eletrica da residẽncia?: ");
        double consumoEnergia=sc.nextDouble();

        double valor100KW= salarioMinimo/7;
        double vkw= (valor100KW)/100;
        double valorpg= consumoEnergia*vkw;
        double des= valorpg*0.1;

        System.out.println("Valor de cada Kw/h="+"R$"+ vkw);
        System.out.println("Valor a ser pago="+"R$"+ valorpg);
        System.out.println("Valor a ser pago com desconto:"+"R$"+(valorpg-des));
    }
}

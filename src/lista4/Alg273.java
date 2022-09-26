package lista4;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

//Alg 273: uma empresa de fornecimento de energia elétrica faz a leitura mensal dos medidores de
//consumo. Para cada consumidor, são digitados os seguintes dados:
public class Alg273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );



        double media1 = 0;
        double media2 = 0;


        double custo = 0;
        int numConsumidor1 = 0;
        int numConsumidor2 = 0;

        double totalConsumidor1 =0;
        double totalConsumidor2 =0;
        double totalConsumidor3 =0;



        System.out.print( "Entre com código do cliente: ");
        int codigo = sc.nextInt();

        while ( codigo != 0) {

            System.out.print( "Entre com o cosumo khw: ");
            int consumo = sc.nextInt();
            System.out.print( "Entre com o tipo do cliente: ");
            int tipo = sc.nextInt();

            if (tipo == 1) {
                custo = (consumo * 0.30);
                numConsumidor1 = numConsumidor1 + 1;
                totalConsumidor1 = totalConsumidor1 + consumo;
            }
            else if (tipo == 2) {
                custo = (consumo * 0.50);
                numConsumidor2 = numConsumidor2 + 1;
                totalConsumidor2 = totalConsumidor2 + consumo;
            }
            else if (tipo == 3) {
                custo = (consumo * 0.70);
                totalConsumidor3 = totalConsumidor3 + consumo;

            }
            else {
                System.out.print("Tipo de consumidor digitado errado");
            }

            System.out.printf ( "O custo total desse consumidor é: %.2f %n", custo);
            System.out.print( "Entre com código do cliente: ");
            codigo = sc.nextInt();
        }
        System.out.println("O total de consumo dos consumidores tipo 1: " + totalConsumidor1);
        System.out.println("O total de consumo dos consumidores tipo 2: " + totalConsumidor2);
        System.out.println("O total de consumo dos consumidores tipo 3: " + totalConsumidor3);

        media1 = totalConsumidor1 / numConsumidor1;
        media2 = totalConsumidor2 / numConsumidor2 ;
        System.out.println( "A média de consumo do tipo 1: "+ media1);
        System.out.println( "A média de consuma do tipo 2: "+ media2);

            sc.close();


    }
}

package Funcoes;

import java.util.Scanner;

public class ExercicioFixacao01 {
    static double x, y;

    public static double soma (){
       return x + y;
    }
    public static double subtracao ( ){
        return  x -y;
    }
    public static double multiplicacao ( ) {
        return  x * y;
    }
    public static double divisao ( ) {
        return  x / y;
    }
    public static  void exibe (double res){
        System.out.println("Resultado: "+ res);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Entre com dois numeros ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        double resultado = 0;

        System.out.println("Opções:");
        System.out.println("1- soma");
        System.out.println("2- subtração");
        System.out.println("3- multiplicaçao");
        System.out.println("4- divisão");
        System.out.println("Digite a opção");
        int opcao = sc.nextInt();
        switch ( opcao){
            case 1:
                resultado = soma();
                        break;
            case 2:
                resultado = subtracao();
                break;
            case 3:
                resultado = multiplicacao();
                break;
            case 4:
                resultado = divisao();
                break;
            default:
                System.out.println("Opção inválida!");


        }
        exibe( resultado);
        sc.close();








    }
}

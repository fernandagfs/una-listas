package lista3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

//lista3.Alg187. criar um algoritmo que calcule e imprima o valdor de bn O valor de n deverá ser maior do que
//1 e inteiro e o valor de b maior ou igual a 2 e inteiro.
public class Alg187 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Entre com o expoente");
        int n= sc.nextInt();
        System.out.println( "Entre com a base");
        int b= sc.nextInt();
        int resultado =1;

        for(int i =1; i<=n;i++){
        resultado=b*resultado;
        }
        System.out.println( "Exponte: "+ resultado);
    }
}

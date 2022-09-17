package lista1;

import java.util.Scanner;

//    • Alg 66: Efetuar o cálculo da quantidade de litros de combustível gasto em uma
//    viagem sabendo-se que o carro faz 12 km com um litro. Deverão ser fornecidos o tempo
//    gasto na viagem e a velocidade média. Utilizar as seguintes formulas:
//        ◦ Distância = tempo x velocidade
//        ◦ Litros usados = distância / 12
//O algoritmo deverá apresentar os valores da velocidade média, tempo gasto na viagem, distância percorrida
// e a quantidade de litros utilizados na viagem.
public class Alg66 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Quanto tempo gosto na viagem?: ");
        float tempo= sc.nextFloat();
        System.out.println("Qual a velocidade média?: ");
        float velocidade= sc.nextFloat();
        float distancia= tempo* velocidade;
        float litros= distancia/12;

        System.out.println("Velocidade média é: "+velocidade);
        System.out.println("Distância percorrida foi: "+distancia);
        System.out.println("Tempo gasto na viagem: "+tempo);
        System.out.println("Quantiade de litros gasto: "+litros);
        sc.close();
    }
}

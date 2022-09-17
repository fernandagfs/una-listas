import java.util.Scanner;

//Exercício 05) Faça um programa Java, no qual o usuário será indagado a entrar
//dois valores reais, um após o outro, (cada um deve ser armazenado numa
//variável do tipo adequado. Após isso o usuário é solicitado para entrar com uma
//operação (+, -, * ou /). E finalmente o programa mostra o resultado da operação
//solicitada.
public class Ex05aula4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int vl1,vl2, resultado;
        String operacao;
        System.out.println(" Entre com o primeiro valor real; ");
        vl1= sc.nextInt();
        System.out.println( "Entre com o segundo valor real: ");
        vl2= sc.nextInt();
        System.out.println(" Entre com a operção entre os valores (+,-,*ou /)");
        operacao = sc.next();

        if (operacao.equals("+")) {
            resultado= vl1+vl2;
            System.out.println( "Resultado da operação: ="+resultado);
        }
        if (operacao.equals("-")) {
            resultado= vl1-vl2;
            System.out.println( "Resultado da operação: ="+resultado);
        }
        if (operacao.equals("*")) {
            resultado= vl1*vl2;
            System.out.println( "Resultado da operação: ="+resultado);
        }
        if (operacao.equals("/")) {
            if (vl2==0) {
                System.out.println("Denominador 0, impossivel fazer divisão!");
            }
           else {
                resultado = vl1 / vl2;
                System.out.println("Resultado da operação: =" + resultado);
            }
        }

    }
}

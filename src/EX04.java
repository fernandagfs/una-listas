//Exercício 04) Faça um outro programa Java, similar ao 03 acima, no qual o
//usuário será indagado a entrar dois valores reais, um após o outro, (cada um
//deve ser armazenado numa variável do tipo adequado. Após isso o usuário é
//solicitado para entrar com uma operação (+, -, * ou /). E finalmente o programa
//mostra o resultado da operação solicitada.


import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Entre com um valor: ");
        int v1 = sc.nextInt();

        System.out.println(" Entre com outro valor: ");
        int v2 = sc.nextInt();

        System.out.println(" Escolha a operação: *,+,-,/");
        String op = sc.next();

        int resultado = 0;
        if (op.equals("-")) {
            resultado = v1 - v2;
        } else if (op.equals("+")) {
            resultado = v1 + v2;
        } else if (op.equals("*")) {
            resultado = v1 * v2;
        } else if (op.equals("/")) {
            if (v2 == 0) {
                System.out.println("O denominador não pode ser zero");
                return;
            }
            resultado = v1/v2;
        } else {
            System.out.println("Valor invalido");
            return;
        }

        System.out.println("Resultado:" + resultado);
    }
}

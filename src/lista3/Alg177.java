package lista3;

//Alg. imprimir os múltiplos de 5, no intervalo de 1 até 500
public class Alg177 {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=500;i=i+5) {
            imprimir(i);
        }
    }

    public static void imprimir(int bosta) {
        System.out.println(bosta);
    }
}

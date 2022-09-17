import java.util.Scanner;

public class Ex02aula4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Entre com primeiro valor");
        double V1= sc.nextDouble();
        System.out.println(" Entre com segundo valor");
        double V2= sc.nextDouble();

        if (V1>V2){
            System.out.println( V1 + "é maior que" +V2);
        }
        else  {
            System.out.println( V2+ "é maior que" + V1);
        }
    }
}

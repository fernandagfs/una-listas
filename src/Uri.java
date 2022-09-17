import java.util.Scanner;

public class Uri {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double A,B,C,R1,R2;

        //System.out.println();
        A= sc.nextDouble();
        //System.out.println();
        B= sc.nextDouble();
        //System.out.println();
        C= sc.nextDouble();
        if ((A==0) || ((B*B)-4*A*C) < 0){
            System.out.println("Imporssivel calcular");
            return;
        }
        double raiz= Math.sqrt((B*B)-4*A*C);
        R1=(-B+ raiz)/(2*A);
        R2= (-B-raiz)/(2*A);
        System.out.printf( "R1 = %.5f%n",R1);
        System.out.printf( "R2 = %.5f%n",R2);
        sc.close();
    }
}

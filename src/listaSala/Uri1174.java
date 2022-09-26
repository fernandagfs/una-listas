package listaSala;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

// uri1174
public class Uri1174 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);

        double [] A = new double [ 100];

        for ( int i= 0; i < A.length; i++) {
            A[i] = sc.nextDouble();
        }
        for (int i =0 ; i< A.length ; i++){
            if ( A[i] <=10.0) {
                System.out.println("A["+i+"] = "+ A[i]);
            }

        }
    }
}

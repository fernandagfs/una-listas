import java.text.DecimalFormat;
import java.util.Scanner;

public class TesteUri {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        double media = ((N1 * 2.0) + (N2 * 3.0) + (N3 * 4.0) + (N4 * 1.0)) / 10;
        new DecimalFormat( "0.0").format(media);


        if (media >= 7.0) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado.");
        }

        else if (media >= 5.0 && media <= 6.9) {
            double Nexame = sc.nextDouble();
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f%n", Nexame);
            double MediaExame = (Nexame + media) / 2;
            if (MediaExame >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", MediaExame);
            } else {
                System.out.println("Aluno reprovado");
                System.out.printf("Media final: %.1f%n", MediaExame);
            }

        }
        else if (media < 5.0) {
            System.out.printf("Media: %.1f%n" , media);
            System.out.println("Aluno reprovado.");
        }
        sc.close();

    }
}

import java.util.Scanner;

public class uri {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int soma=0;

        while ( x <y) {

            if (x % 2 != 0 )
                soma = soma + x;
            x = x + 1;
        }
        while (x>y) {

        if (x % 2 == 1 || x % 2 == -1)

            soma = soma + x;

        }
        System.out.println( soma);



    }
}

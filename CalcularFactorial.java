
import java.util.Scanner;

public class CalcularFactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("introduce un numero: ");
            num = sc.nextInt();

            if (num < 0)
                System.out.println("el numero no puede ser negativo");
        } while (num < 0);

        int factorial = num;

        if (num == 0)
            System.out.println("el factorial de 0 es 1");
        else {
            for (int i = 1; i < num; i++) {
                factorial = factorial * i;
            }
            System.out.println(num + "! = " + factorial);
        }

    }

}

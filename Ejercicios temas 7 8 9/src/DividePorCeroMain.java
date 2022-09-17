import java.util.Scanner;

public class DividePorCeroMain {

    public static void DividePorCero() throws ArithmeticException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int A = scanner.nextInt();
        System.out.println("Introduce un número: ");
        int B = scanner.nextInt();


        try {
            int resultado = A / B;
            System.out.println("Demo de código: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        }

    }

}




import java.util.Scanner;

public class ExceptionHandling {

    public static double exceptionIf(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.print("c hasil exception if: ");
            return 0;
        }
    }

    public static double exceptionTryCatch(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.print("c hasil exception try catch: ");
            return 0;
        }
    }

    public static void main(String[] args) {
        int a, b;

        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();

        System.out.println(exceptionIf(a, b));
        System.out.println(exceptionTryCatch(a, b));
    }
}

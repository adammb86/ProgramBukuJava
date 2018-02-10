import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryBanyakCatch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger x;
        BigInteger y;

        try {
            x = new BigInteger(String.valueOf(input.nextBigInteger()));
            y = new BigInteger(String.valueOf(input.nextBigInteger()));
            System.out.println(x.divide(y));
        } catch (ArithmeticException e1) {
            System.out.println("Pembagian dengan 0");
        } catch (InputMismatchException e2) {
            System.out.println("Input tidak bertipe Big Integer");
        }
    }
}

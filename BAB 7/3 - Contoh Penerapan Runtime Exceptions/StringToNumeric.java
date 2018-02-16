import java.util.Scanner;

public class StringToNumeric {

    public static void main(String[] args) {
        String NIK;
        int numberNIK;

        Scanner input = new Scanner(System.in);
        NIK = input.next();

        try {
            numberNIK = Integer.parseInt(NIK);
            System.out.println(numberNIK);
        } catch (NumberFormatException e) {
            System.out.println("NIK mengandung huruf");
        }
    }
}

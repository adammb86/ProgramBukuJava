import java.util.Scanner;

public class ArrayNegative {

    public static void main(String[] args) {
        int ukuran;
        Scanner input = new Scanner(System.in);
        ukuran = input.nextInt();

        try {
            int[] angka = new int[ukuran];
        } catch (NegativeArraySizeException e) {
            System.out.println("Ukuran array tidak boleh negatif");
        }
    }
}

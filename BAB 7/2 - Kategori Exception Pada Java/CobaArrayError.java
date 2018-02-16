import java.util.Scanner;

public class CobaArrayError {

    public static void main(String[] args) {
        String nama[] = {"Firman", "Adam", "Daniyal"};
        int maks;

        Scanner input = new Scanner(System.in);
        maks = input.nextInt();

        for (int i = 0; i < maks; i++) {
            System.out.println(nama[i]);
        }
    }
}

import java.util.Scanner;

public class CobaArrayError {

    public static void main(String[] args) {
        String nama[]={"Firman","Adam","Daniyal"};
        int maks;

        Scanner input=new Scanner(System.in);
        maks=input.nextInt();

        try {
            for (int i = 0; i < maks; i++) {
                System.out.println(nama[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks Array melebihi batas maks");
        }
    }
}

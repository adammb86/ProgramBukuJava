import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryFinally {

    public static void main(String[] args) {
        String[] nama = new String[2];
        nama[0] = "Adam";
        nama[1] = "Firman";

        try {
            System.out.println(nama[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Akses array ke indeks yang salah");
        } finally {
            for (int i = 0; i < 2; i++) {
                System.out.println(nama[i]);
            }
            System.out.println("Finally berjalan");
        }
    }
}

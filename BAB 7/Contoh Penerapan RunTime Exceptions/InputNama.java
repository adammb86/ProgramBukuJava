import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNama {
    public static void main(String args[]) {
        System.out.print("Masukkan nama anda: ");

        // Instansiasi objek Scanner
        BufferedReader baca = new BufferedReader
                        (new InputStreamReader(System.in));

        String nama = null;
        try {
            // Menyimpan hasil masukkan
            nama = baca.readLine();
        } catch (IOException e) {
            System.out.println("Gagal membaca data");
        }

        System.out.println("Nama anda adalah: " + nama);
    }
}

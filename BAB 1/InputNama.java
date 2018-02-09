import java.util.Scanner; //baris kode ini dibutuhkan

public class InputNama {
    public static void main(String args[]) {
        System.out.print("Masukkan nama anda: ");

        // Instansiasi objek Scanner
        Scanner scanner = new Scanner(System.in); 

        // Menyimpan hasil masukkan
        String nama = scanner.next();

        System.out.println("Nama anda adalah: " + nama);
    }
}

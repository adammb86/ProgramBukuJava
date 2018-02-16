public class MethodTanpaNilaiBalik2 {
    public static void main(String[] args) {
        // Menampilkan data orang 1
        tampilDataOrang("Adam", "Dago");

        System.out.println();

        // Menampilkan data orang 2
        tampilDataOrang("Firman", "Antapani");
    }

    // Method tanpa nilai balik untuk menampikan nama dan alamat
    public static void tampilDataOrang(String nama, String alamat) {
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
    }
}

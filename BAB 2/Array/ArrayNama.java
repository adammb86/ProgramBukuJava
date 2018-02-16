public class ArrayNama {
    public static void main(String[] args) {
        String[] nama = new String[5];
        nama[0] = "Adam";
        nama[1] = "Firman";
        nama[2] = "Ramdhan";
        nama[3] = "Evan";
        nama[4] = "Rizal";

        for (int i = 0; i < 5; i++) {
            /* Mengakses dan menampilkan array sesuai dengan variabel i yang
            dijadikan sebagai indeks */
            System.out.println("Nama pada indeks " + i + ": " + nama[i]);
        }
    }
}

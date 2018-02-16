public class PermenGlobal {
    // Variabel jumlahPermen menjadi variabel instance
    // Inisialisasi variabel jumlahPermen = 10
    int jumlahPermen = 10;

    // Method untuk menampilkan jumlah permen
    public void getJumlahPermen() {
        System.out.println("Jumlah permen: " + jumlahPermen);
    }

    public void tambahPermen() {
        jumlahPermen = jumlahPermen + 1;
        System.out.println("Jumlah permen setelah ditambah: " + 
                            jumlahPermen);
    }

    public static void main(String[] args) {
        PermenGlobal permenSusu = new PermenGlobal();

       // Menampilkan jumlah permen yang ada saat program pertama x berjalan
        permenSusu.getJumlahPermen();

        // Menambah satu permen
        permenSusu.tambahPermen();

        // Menampilkan jumlah permen yang ada
        permenSusu.getJumlahPermen();
    }
}

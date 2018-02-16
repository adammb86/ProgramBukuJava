public class Permen {
    public void tambahPermen() {
        // Deklarasi variabel lokal
        int jumlahPermen = 0;

        jumlahPermen = jumlahPermen + 1;
        System.out.println("Jumlah permen setelah ditambah: " + 
                         jumlahPermen);
    }

    public static void main(String[] args) {
        Permen permenSusu = new Permen();
        permenSusu.tambahPermen();
    }
}

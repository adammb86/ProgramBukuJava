public class Tester {
    // NAMA_UNIVERSITAS sebagai konstanta
    public static final String NAMA_UNIVERSITAS = "UNIKOM";

    public static void main(String[] args) {
        Universitas.jumlahMahasiswa = 10000;
        System.out.println(NAMA_UNIVERSITAS + " memiliki mahasiswa sebanyak" 
                           + Universitas.jumlahMahasiswa);
    }
}

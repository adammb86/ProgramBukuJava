public class Tester {

    public static void main(String[] args) {
    // write your code here
        Dosen dosen=new Dosen();
        dosen.setNama("Adam Mukharil Bachtiar");
        dosen.setUmur(24);
        dosen.setNip("41277006024");
        dosen.setMatakuliah("Rekayasa Perangkat Lunak");
        System.out.println("NIP Dosen     : "+dosen.getNip());
        dosen.mengajarApa();
        dosen.siapaKamu();

        Mahasiswa mahasiswa=new Mahasiswa();
        mahasiswa.setNama("Iqbal Dwi");
        mahasiswa.setUmur(19);
        mahasiswa.setNim("10114007");
        mahasiswa.setKelas("IF-1");
        System.out.println("NIM Mahasiswa : "+mahasiswa.getNim());
        mahasiswa.kelasApa();
        mahasiswa.siapaKamu();
    }
}

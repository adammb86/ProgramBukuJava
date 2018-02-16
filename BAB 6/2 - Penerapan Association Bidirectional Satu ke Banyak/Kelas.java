import java.util.LinkedList;

public class Kelas {
    private String namaKelas;
    private LinkedList<Mahasiswa> mahasiswa;

    public Kelas(String namaKelas, LinkedList<Mahasiswa> mahasiswa) {
        this.namaKelas = namaKelas;
        this.mahasiswa = mahasiswa;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public LinkedList<Mahasiswa> getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(LinkedList<Mahasiswa> mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}

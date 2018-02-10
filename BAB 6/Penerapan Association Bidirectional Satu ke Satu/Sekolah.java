public class Sekolah {
    private String namaSekolah;
    private KepalaSekolah kepalaSekolah;

    public Sekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public KepalaSekolah getKepalaSekolah() {
        return kepalaSekolah;
    }

    public void setKepalaSekolah(KepalaSekolah kepalaSekolah) {
        this.kepalaSekolah = kepalaSekolah;
    }
}

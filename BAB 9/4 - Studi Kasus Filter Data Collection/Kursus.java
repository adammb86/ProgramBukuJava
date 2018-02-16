public class Kursus {
    private String idKursus;
    private String namaKursus;
    private double harga;

    public Kursus(String idKursus, String namaKursus, double harga) {
        this.idKursus = idKursus;
        this.namaKursus = namaKursus;
        this.harga = harga;
    }

    public String getIdKursus() {
        return idKursus;
    }

    public void setIdKursus(String idKursus) {
        this.idKursus = idKursus;
    }

    public String getNamaKursus() {
        return namaKursus;
    }

    public void setNamaKursus(String namaKursus) {
        this.namaKursus = namaKursus;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}

public class PersegiPanjang {
    private double panjang;
    private double lebar;

    // tambahkan bagian konstruktor ini setelah deklarasi atribut
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        System.out.println("Objek Persegi Panjang diinstansiasi");
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double hitungKeliling() {
        return (2 * panjang) + (2 * lebar);
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}

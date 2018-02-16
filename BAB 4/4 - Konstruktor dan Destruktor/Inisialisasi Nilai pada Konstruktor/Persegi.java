public class Persegi {
    private double sisi;
 
    // tambahkan bagian konstruktor ini setelah deklarasi atribut
    public Persegi(double sisi){
        this.sisi = sisi;
        System.out.println("Objek Persegi diinstansiasi");
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
}

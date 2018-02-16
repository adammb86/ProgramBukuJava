public class Tester {

    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(6);
        System.out.println("Keliling persegi = " 
                + persegi.hitungKeliling());
        System.out.println("Luas persegi     = " 
                + persegi.hitungLuas());

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setR(100);
        System.out.println("Keliling lingkaran = "
                + lingkaran.hitungKeliling());
        System.out.println("Luas lingkaran     = " 
                + lingkaran.hitungLuas());
    }
}

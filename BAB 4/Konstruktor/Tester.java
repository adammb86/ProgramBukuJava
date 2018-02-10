public class Tester {

    public static void main(String[] args) {
        Persegi persegi = new Persegi(10);
        System.out.println("Sisi Persegi     = "+persegi.getSisi());
        System.out.println("Keliling Persegi = "+persegi.hitungKeliling());
        System.out.println("Luas Persegi     = "+persegi.hitungLuas());

        PersegiPanjang persegipanjang = new PersegiPanjang(5,4);
        System.out.println("Panjang Persegi          = "
                            +persegipanjang.getPanjang());
        System.out.println("Lebar Persegi            = "
                            +persegipanjang.getLebar());
        System.out.println("Keliling Persegi Panjang = "
                            +persegipanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang     = "
                            +persegipanjang.hitungLuas());
    }
}

public class MethodDenganNilaiBalik {
    public static void main(String[] args) {
        int sisi = 4;
        System.out.println("Luas Persegi dengan panjang sisi " + sisi + 
                           " adalah " + hitungLuasPersegi(sisi));
    }

    // Method dengan nilai balik untuk menghitung luas persegi
    public static int hitungLuasPersegi(int sisi) {
        int luas = sisi * sisi;

        return luas;
    }
}

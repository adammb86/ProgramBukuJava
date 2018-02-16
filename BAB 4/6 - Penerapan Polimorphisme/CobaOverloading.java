public class CobaOverloading {

    public static void ulangiHalo() {
        for (int i = 1; i <= 3; i++)
            System.out.println("Halo");
    }

    public static void ulangiHalo(int berapakali) {
        for (int i = 1; i <= berapakali; i++)
            System.out.println("Halo");
    }

    public static void main(String[] args) {
        // memanggil ulangiHalo()
        ulangiHalo();

        System.out.println();

        // memanggil ulangiHalo(int berapaKali)
        ulangiHalo(4);
    }
}

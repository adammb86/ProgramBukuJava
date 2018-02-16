public class Tester {

    public static void main(String[] args) {
        Angkot angkot = new Angkot("D 506 DAM");
        Masyarakat masyarakat = new Masyarakat("34050221");

        masyarakat.naikAngkot(angkot);
    }
}

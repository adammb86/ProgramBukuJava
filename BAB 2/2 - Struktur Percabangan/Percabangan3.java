public class Percabangan3 {

    public static void main(String[] args) {
        int nilai = 87;

        if (nilai >= 80) {
            System.out.println("Nilai " + nilai + " mendapat indeks A");
        } else if (nilai >= 70) {
            System.out.println("Nilai " + nilai + " mendapat indeks B");
        } else if (nilai >= 60) {
            System.out.println("Nilai " + nilai + " mendapat indeks C");
        } else if (nilai >= 50) {
            System.out.println("Nilai " + nilai + " mendapat indeks D");
        } else {
            System.out.println("Nilai " + nilai + " mendapat indeks E");
        }
    }
}

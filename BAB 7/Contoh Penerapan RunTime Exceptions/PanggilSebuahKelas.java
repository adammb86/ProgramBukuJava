public class PanggilSebuahKelas {
    public static void main(String[] args) {
        try {
            // Coba mencari kelas String yang terdapat di Java
            Class kelas = Class.forName("java.lang.String");

            System.out.println("Kelas '" + kelas.getName() + "' ditemukan");
        } catch (ClassNotFoundException e) {
            System.out.println("Kelas yang dicari tidak ditemukan");
        }
    }
}

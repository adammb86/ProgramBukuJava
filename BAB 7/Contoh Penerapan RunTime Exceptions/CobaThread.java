public class CobaThread {
    public final static int DELAY = 2000;

    public static void main(String[] args) {
        Thread thread = new Thread();
        try {
            // Tahan eksekusi dari thread selama 2 detik
            thread.sleep(DELAY);

            System.out.println("Menampilkan teks setelah 2 detik");
        } catch (InterruptedException e) {
            System.out.println("Thread diinterupsi");
        }

        try {
            // Coba interupsi thread
            Thread.currentThread().interrupt();

            // Tahan eksekusi dari thread selama 2 detik
            thread.sleep(DELAY);

            System.out.println("Menampilkan teks setelah 2 detik");
        } catch (InterruptedException e) {
            System.out.println("Thread diinterupsi");
        }
    }
}

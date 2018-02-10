public class CobaThread {
    public final static int DELAY = 3000;

    public static void main(String[] args) {
        Thread thread = new Thread();
        try {
            // Pause eksekusi dari thread
            thread.sleep(DELAY);

            System.out.println("Menampilkan teks setelah 3 detik");
        } catch (InterruptedException e) {
            System.out.println("Thread diinterupsi");
        }
    }
}

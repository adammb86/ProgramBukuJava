public class ThreadSaya implements Runnable {
    private Thread thread;
    private String namaThread;

    public ThreadSaya(String namaThread) {
        this.namaThread = namaThread;
        System.out.println("Thread " + namaThread + " diciptakan");
    }

    @Override
    public void run() {
        System.out.println("Thread "+namaThread +" dijalankan.");


        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("Thread " + namaThread + " ke-" + i);

                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + namaThread + " diinterupsi.");
        }

        System.out.println("Thread "+namaThread+" selesai.");
    }

    public void start() {
        System.out.println"Thread "namaThread + " dimulai.");

        if (thread == null) { //belum diinstansiasi
            thread = new Thread(this, namaThread);
            thread.start(); //mempersiapkan thread ke fase runnable
        }
    }
}

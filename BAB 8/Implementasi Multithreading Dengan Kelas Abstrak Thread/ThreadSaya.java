public class ThreadSaya extends Thread {
    private Thread thread;
    private String namaThread;

    public ThreadSaya(String namaThread) {
        this.namaThread = namaThread;
        System.out.println("Thread " + namaThread + " diciptakan.");
    }


    public void run() {
        System.out.println(namaThread + " dijalankan.");

        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("Thread " + namaThread + " ke-" + i);
            }

            Thread.sleep(50);
        } catch (InterruptedException e) {
            System.out.println("Thread " + namaThread + " diinterupsi.");
        }

        System.out.println("Thread " + namaThread + " selesai.");
    }

    public void start() {
        System.out.println("Thread " + namaThread + " dimulai");

        if (thread == null) {
            thread = new Thread(this, namaThread);
            thread.start();
        }
    }

    public void start(int priority) {
        System.out.println("Thread " + namaThread + " dimulai");

        if (thread == null) {
            thread = new Thread(this, namaThread);
            thread.setPriority(priority); //bisa menentukan priority
            thread.start();
        }
    }
}

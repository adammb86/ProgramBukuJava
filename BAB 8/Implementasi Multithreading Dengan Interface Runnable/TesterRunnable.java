public class TesterRunnable {

    public static void main(String[] args) {
        ThreadSaya thread1=new ThreadSaya("Satu");
        ThreadSaya thread2=new ThreadSaya("Dua");

        thread1.start();
        thread2.start();
    }
}

import java.util.PriorityQueue;

public class OperasiPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<String> nama = new PriorityQueue<>();

        // coba operasi offer
        nama.offer("Dodi");
        nama.offer("Silvi");
        nama.offer("Keke");
        nama.offer("Queen");

        // coba operasi peek
        System.out.println(nama.peek());

        // untuk membuktikan bahwa nama yang di-peek tidak hilang
        System.out.println("\nList nama setelah operasi peek");
        System.out.println("==============================");
        for (String name : nama) {
            System.out.println(name);
        }

        // coba operasi poll
        System.out.println(nama.poll());

        // untuk membuktikan bahwa nama yang di-poll tidak hilang
        System.out.println("\nList nama setelah operasi poll");
        System.out.println("==============================");
        for (String name : nama) {
            System.out.println(name);
        }
    }
}

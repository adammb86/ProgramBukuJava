import java.util.LinkedList;

public class OperasiLinkedList {

    public static void main(String[] args) {
        LinkedList<String> nama= new LinkedList<>();

        //coba operasi addFirst dan addLast
        nama.addFirst("Elsa");
        nama.addFirst("Zaenal");
        nama.addLast("Herti");
        nama.addLast("Vano");

        System.out.println("List nama setelah addFirst dan addLast");
        System.out.println("======================================");
        for (String name:nama) {
            System.out.println(name);
        }

        //coba getFirst dan getLast
        System.out.println("\nNama pertama:  "+nama.getFirst());
        System.out.println("Nama terakhir: "+nama.getLast());

        //coba removeFirst dan removeLast
        nama.removeFirst(); //menghapus Zaenal
        nama.removeLast(); //menghapus Vano

        System.out.println("\nList nama setelah addFirst dan addLast");
        System.out.println("======================================");
        for (String name:nama) {
            System.out.println(name);
        }
    }
}

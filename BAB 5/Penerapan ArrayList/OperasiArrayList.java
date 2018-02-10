import java.util.ArrayList;

public class OperasiArrayList {

    public static void main(String[] args) {
       //coba operasi add
        ArrayList<String> nama=new ArrayList<>();
        nama.add("Ani");
        nama.add("Budi");
        nama.add("Elsa");
        nama.add("Herti");

        System.out.println("List nama setelah operasi add");
        System.out.println("=============================");
        for (String name:nama) {
            System.out.println(name);
        }

        //menyisipkan nama Zaenal di posisi ketiga
        nama.add(2,"Zaenal");

        System.out.println("\nList nama setelah disisipkan nama Zaenal");
        System.out.println("========================================");
        for (String name:nama) {
            System.out.println(name);
        }

        //coba operasi get
        //mendapatkan nama Elsa
        System.out.println("\nHasil operasi get untuk nama di posisi 
                            keempat");
            
        System.out.println("==========================================
                            ====");
        System.out.println(nama.get(3));

        //coba operasi remove
        nama.remove(0);

        System.out.println("\nList nama setelah nama pertama dihapus");
        System.out.println("======================================");
        for (String name:nama) {
            System.out.println(name);
        }

        //coba operasi size
        System.out.println("\nUkuran array list nama: "+nama.size());
    }
}

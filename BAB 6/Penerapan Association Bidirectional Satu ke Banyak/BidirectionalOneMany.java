import java.util.LinkedList;

public class BidirectionalOneMany {

    public static void main(String[] args) {
        // membuat beberapa data mahasiswa
        LinkedList<Mahasiswa> mhs = new LinkedList<>();
        Kelas kelas = new Kelas("IF-1", mhs);

        // association one to many
        mhs.addFirst(new Mahasiswa("10104007", kelas));
        mhs.addFirst(new Mahasiswa("10104008", kelas));

        System.out.println("List mahasiswa " + kelas.getNamaKelas());
        System.out.println("====================");
        for (Mahasiswa listMhs : kelas.getMahasiswa()) {
            System.out.println(listMhs.getNim());
        }
    }
}

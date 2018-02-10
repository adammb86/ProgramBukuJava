import java.util.LinkedList;

public class Tester {

    public static void main(String[] args) {
        LinkedList<Dosen> listDosen=new LinkedList<>();
        ProgramStudi programStudi=new ProgramStudi("Teknik Informatika");

        listDosen.add(new Dosen("Mira Kania Sabariah"));
        listDosen.add(new Dosen("Andri Heryandi"));
        listDosen.add(new Dosen("Alif Finandhita"));

        programStudi.setListDosen(listDosen);

        System.out.println("List Dosen "
                           +programStudi.getNamaProgramStudi());
        System.out.println("==================================");
        for(Dosen lecturer:listDosen){
            System.out.println(lecturer.getNamaDosen());
        }
    }
}

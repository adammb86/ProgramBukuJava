import java.util.LinkedList;

public class ProgramStudi {
    private String namaProgramStudi;
    private LinkedList<Dosen> listDosen;

    public ProgramStudi(String namaProgramStudi) {
        this.namaProgramStudi = namaProgramStudi;
    }

    public String getNamaProgramStudi() {
        return namaProgramStudi;
    }

    public void setNamaProgramStudi(String namaProgramStudi) {
        this.namaProgramStudi = namaProgramStudi;
    }

    public LinkedList<Dosen> getListDosen() {
        return listDosen;
    }

    public void setListDosen(LinkedList<Dosen> listDosen) {
        this.listDosen = listDosen;
    }
}

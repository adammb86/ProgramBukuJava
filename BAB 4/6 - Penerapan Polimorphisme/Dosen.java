public class Dosen extends Manusia {
    private String nip;
    private String matakuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }

    public void mengajarApa() {
        System.out.println("Saya " + nama + " umur " + umur
                + " mengajar " + matakuliah);
    }

    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
}

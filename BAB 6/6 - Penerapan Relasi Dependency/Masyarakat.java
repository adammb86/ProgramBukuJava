public class Masyarakat {
    private String NIK;

    public Masyarakat(String NIK) {
        this.NIK = NIK;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void naikAngkot(Angkot angkot) {
        // dependensi terjadi
        System.out.println(NIK + " naik angkot " + angkot.getNomorAngkot());
    }
}

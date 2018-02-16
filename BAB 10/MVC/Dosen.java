public class Dosen {
    private String NIP;
    private String namaDosen;

    public Dosen(String NIP, String namaDosen) {
        this.NIP = NIP;
        this.namaDosen = namaDosen;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }
}

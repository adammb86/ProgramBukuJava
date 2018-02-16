public class PC {
    private String merekPC;
    private MotherBoard motherboard;

    public PC(String merekPC, MotherBoard motherboard) {
        this.merekPC = merekPC;
        this.motherboard = motherboard;
    }

    public String getMerekPC() {
        return merekPC;
    }

    public void setMerekPC(String merekPC) {
        this.merekPC = merekPC;
    }

    public MotherBoard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(MotherBoard motherboard) {
        this.motherboard = motherboard;
    }
}

public class Lingkaran extends BangunDatar{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double hitungKeliling() {
        return 2*3.14*r;
    }

    @Override
    public double hitungLuas() {
        return 3.14*r*r;
    }
}

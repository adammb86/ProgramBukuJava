public class Persegi {
    private double sisi;

    public double getSisi(){
        return sisi;
    }
    
    public void setSisi(double sisi){
        this.sisi=sisi;
    }

    public double hitungKeliling(){
        return 4*sisi; //rumus keliling persegi
    }
    
    public double hitungLuas(){
        return sisi*sisi; //rumus luas persegi
    }
}

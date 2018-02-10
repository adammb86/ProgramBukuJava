public class TesterVariabel {

    public static void main(String[] args) {
        PertukaranNilai pertukarannilai=new PertukaranNilai();
        Integer a=10;
        Integer b=20;  
        pertukarannilai.setDatasatu(a);
        pertukarannilai.setDatadua(b);
        pertukarannilai.tukarNilai();
        pertukarannilai.tampilHasilTukar();

        String nama1="Adam";
        String nama2="Iqbal";
        pertukarannilai.setDatasatu("Adam");
        pertukarannilai.setDatadua("Iqbal");
        pertukarannilai.tukarNilai();
        pertukarannilai.tampilHasilTukar();
    }
}

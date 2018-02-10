public class Tester {

    public static void main(String[] args) {
        PertukaranNilai pertukarannilai=new PertukaranNilai();
        pertukarannilai.setDatasatu(10);
        pertukarannilai.setDatadua(20);
        pertukarannilai.tukarNilai();
        pertukarannilai.tampilHasilTukar();

        pertukarannilai.setDatasatu("Adam");
        pertukarannilai.setDatadua("Iqbal");
        pertukarannilai.tukarNilai();
        pertukarannilai.tampilHasilTukar();
    }
}

public class Tester {

    public static void main(String[] args) {
        PertukaranNilai<Integer> tukarinteger=new PertukaranNilai<>();
        tukarinteger.setDatasatu(10);
        tukarinteger.setDatadua(20);
        tukarinteger.tukarNilai();
        tukarinteger.tampilHasilTukar();

        PertukaranNilai<String> tukarstring=new PertukaranNilai<>();
        tukarstring.setDatasatu("Adam");
        tukarstring.setDatadua("Iqbal");
        tukarstring.tukarNilai();
        tukarstring.tampilHasilTukar();
    }
}

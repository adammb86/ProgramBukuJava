public class PertukaranNilai {
    private Object datasatu;
    private Object datadua;
    private Object temp;

    public Object getDatasatu() {
        return datasatu;
    }

    public void setDatasatu(Object datasatu) {
        this.datasatu = datasatu;
    }

    public Object getDatadua() {
        return datadua;
    }

    public void setDatadua(Object datadua) {
        this.datadua = datadua;
    }

    public void tukarNilai(){
        temp=datasatu;
        datasatu=datadua;
        datadua=temp;
    }

    public void tampilHasilTukar(){
        System.out.println("Nilai variabel satu sesudah ditukar = "
                            +datasatu);
        System.out.println("Nilai variabel dua sesudah ditukar  = "
                            +datadua);
    }
}

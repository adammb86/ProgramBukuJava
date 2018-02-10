public class PertukaranNilai <E>{
    private E datasatu;
    private E datadua;
    private E temp;

    public E getDatasatu() {
        return datasatu;
    }

    public void setDatasatu(E datasatu) {
        this.datasatu = datasatu;
    }

    public E getDatadua() {
        return datadua;
    }

    public void setDatadua(E datadua) {
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

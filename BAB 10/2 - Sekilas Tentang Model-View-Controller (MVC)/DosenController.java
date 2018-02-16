public class DosenController {
    Dosen dosenModel;
    DosenView dosenView;

    public DosenController(Dosen dosenModel, DosenView dosenView) {
        this.dosenModel = dosenModel;
        this.dosenView = dosenView;
    }

    public void setDosenNIP(String NIP) {
        dosenModel.setNIP(NIP);
    }

    public void getDosenNIP() {
        dosenModel.getNIP();
    }

    public void setDosenNama(String namaDosen) {
        dosenModel.setNamaDosen(namaDosen);
    }

    public void getDosenNama() {
        dosenModel.getNamaDosen();
    }

    public void updateView() {
        dosenView.cetakDataDosen(dosenModel.getNIP(),
                dosenModel.getNamaDosen());
    }
}

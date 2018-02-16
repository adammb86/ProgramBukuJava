public class TesterDosenMVC {

    private static Dosen retrieveData() {
        Dosen dosen = new Dosen("1", "Adam MB");
        return dosen;
    }

    public static void main(String[] args) {
        // mapping hasil retrieveData() ke kelas Dosen
        Dosen dosen = retrieveData();

        // implementasi kelas View
        DosenView dosenView = new DosenView();

        // mapping kelas model dan view ke controller
        DosenController dosenControl =
                new DosenController(dosen, dosenView);

        dosenControl.updateView();

        dosenControl.setDosenNIP("2");
        dosenControl.setDosenNama("Andri Heryandi");

        dosenControl.updateView();
    }
}

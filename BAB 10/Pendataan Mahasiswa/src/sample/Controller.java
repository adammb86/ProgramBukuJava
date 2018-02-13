package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.*;

public class Controller {
    @FXML
    TextField tfNIM;
    @FXML
    TextField tfNama;
    @FXML
    TextField tfAlamat;
    @FXML
    Button btnSubmit;
    @FXML
    TableView tvDataMahasiswa;
    @FXML
    Button btnSave;
    @FXML
    Button btnLoad;

    @FXML
    public void onButtonClicked(ActionEvent e) {
        if (e.getTarget().equals(btnSubmit)) {
            ObservableList<Mahasiswa> data = tvDataMahasiswa.getItems();
            data.add(new Mahasiswa(
                    tfNIM.getText(),
                    tfNama.getText(),
                    tfAlamat.getText()
            ));

            tfNIM.setText("");
            tfNama.setText("");
            tfAlamat.setText("");
        } else if (e.getTarget().equals(btnSave)) {
            try {
                ObservableList<Mahasiswa> data = tvDataMahasiswa.getItems();
                BufferedWriter writer = new BufferedWriter(new FileWriter("data-mahasiswa.dat"));
                for (int i = 0; i < data.size(); i++) {
                    writer.write(String.valueOf(data.get(i).getNim()) +
                            "," + String.valueOf(data.get(i).getNama()) + "," +
                            String.valueOf(data.get(i).getAlamat()));
                    writer.newLine();
                }
                writer.close();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setContentText("Success Save Data to File");
                alert.showAndWait();
            } catch (IOException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("Error IO Exception: " + ex.getMessage());

                alert.showAndWait();
            }
        } else if (e.getTarget().equals(btnLoad)) {
            try {
                ObservableList<Mahasiswa> data = tvDataMahasiswa.getItems();
                data.clear();
                BufferedReader reader = new BufferedReader(new FileReader("data-mahasiswa.dat"));

                String line;
                while ((line = reader.readLine()) != null) {
                    String[] temp = line.split(",");
                    Mahasiswa mahasiswa = new Mahasiswa(temp[0], temp[1], temp[2]);
                    data.add(mahasiswa);
                }
                reader.close();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setContentText("Success Load Data from Saved File");
                alert.showAndWait();
            } catch (IOException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("Error IO Exception: " + ex.getMessage());
                alert.showAndWait();
            }
        }
    }
}

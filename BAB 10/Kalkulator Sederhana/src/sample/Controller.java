package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField tfBilanganPertama;
    @FXML
    TextField tfBilanganKedua;
    @FXML
    Button btnTambah;
    @FXML
    Button btnKurang;
    @FXML
    Button btnKali;
    @FXML
    Button btnBagi;
    @FXML
    TextField tfHasil;

    @FXML
    public void onButtonClicked(ActionEvent e) {
        BilanganModel bilanganModel = new BilanganModel();

        // Try catch untuk menghindari masukkan selain angka
        try {
            // Mengambil dan memparsing  nilai dari tfBilanganPertama
            bilanganModel.setBilanganPertama(
                    Double.parseDouble(tfBilanganPertama.getText()));

            // Mengambil dan memparsing nilai dari tfBilanganKedua
            bilanganModel.setBilanganKedua(
                    Double.parseDouble(tfBilanganKedua.getText()));
        } catch (NumberFormatException e1) {
            tfHasil.setText("Masukkan hanya boleh angka.");
            return;
        }

        if (e.getTarget().equals(btnTambah)) {
            bilanganModel.setHasil(bilanganModel.getBilanganPertama() +
                    bilanganModel.getBilanganKedua());
            tfHasil.setText(String.valueOf(bilanganModel.getHasil()));
        } else if (e.getTarget().equals(btnKurang)) {
            bilanganModel.setHasil(bilanganModel.getBilanganPertama() -
                    bilanganModel.getBilanganKedua());
            tfHasil.setText(String.valueOf(bilanganModel.getHasil()));
        } else if (e.getTarget().equals(btnKali)) {
            bilanganModel.setHasil(bilanganModel.getBilanganPertama() *
                    bilanganModel.getBilanganKedua());
            tfHasil.setText(String.valueOf(bilanganModel.getHasil()));
        } else if (e.getTarget().equals(btnBagi)) {
            bilanganModel.setHasil(bilanganModel.getBilanganPertama() /
                    bilanganModel.getBilanganKedua());
            tfHasil.setText(String.valueOf(bilanganModel.getHasil()));
        }
    }
}
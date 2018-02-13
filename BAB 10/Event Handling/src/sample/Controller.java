package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField tfNama;
    @FXML
    private Label lblSayHello;

    @FXML
    public void onButtonSayHelloClicked(ActionEvent e) {
        //  Parameter KelasEvent bersifat opsional

        // Menampilkan nama yang diinput di lblSayHello
        lblSayHello.setText("Hello, " + tfNama.getText());
    }
}
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Menghubungkan  Main ke sample.fxml
        Parent root =
                FXMLLoader.load(getClass().getResource("sample.fxml"));

        // Mengatur title pada window
        primaryStage.setTitle("Kalkulator Sederhana");

        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
package domain;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Андрей on 02.02.2016.
 */
public class Login {

    public void openLoginWindow() {
        Stage login = new Stage();
        Parent root = null;
        try {
        root = FXMLLoader.load(getClass().getResource("../resource/fxml/login.fxml"));
        login.setTitle("ArkStore - Login");
        login.setScene(new Scene(root, 440, 250));
        login.setResizable(false);
        login.setAlwaysOnTop(true);
        login.initModality(Modality.WINDOW_MODAL);
        login.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

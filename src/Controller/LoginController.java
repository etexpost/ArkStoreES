package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * Created by Андрей on 22.03.2016.
 */


public class LoginController {

    @FXML
    private Button btnEnter;

    @FXML
    private Button btnCancel;

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtPassword;

    public void authentic(ActionEvent actionEvent) {
        String login = txtLogin.getText();
        String password = txtPassword.getText();
        System.out.println(login.toString());
        System.out.println(password.toString());

        if (login == " " || password == " "){
            //** вывести сообщение о том, что нужно ввести логин и пароль
            System.out.println("Введите логин и пароль");
        } else {
              System.out.println("Login: " + login + " Password: " + password );
              openAdministratorWindow();
        }
    }

    public void openAdministratorWindow() {
        Stage login = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../resource/fxml/admin.fxml"));
            login.setTitle("ArkStore - Administrator");
            login.setScene(new Scene(root, 1024, 768));
            login.setResizable(true);
            login.setAlwaysOnTop(true);
            login.initModality(Modality.WINDOW_MODAL);
            login.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

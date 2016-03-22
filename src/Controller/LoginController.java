package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


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

    public void checkLogin(ActionEvent actionEvent) {

        System.out.println("Нажата кнопка ВХОД");

    }


}

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

    public void authentic(ActionEvent actionEvent) {
        String login = txtLogin.getText();
        String password = txtPassword.getText();
        if (login != ""  password != "") {
            System.out.println("Login: " + login + " Password: " + password );
        } else {
            //** вывести сообщение о том, что нужно ввести логин и пароль
            System.out.println("Введите логин и пароль");
        }



    }




}

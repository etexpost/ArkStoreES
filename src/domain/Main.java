package domain;

import Controller.Login;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../resource/fxml/mainWindow.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("ArkStore");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        primaryStage.setScene(new Scene(root, screenSize.width, screenSize.height));
        primaryStage.setMaximized(true);
        primaryStage.show();
        Login loginWindow = new Login();
        ActionEvent actionEvent = new ActionEvent();
        Login login = new Login();
        login.loginWindow();

    }


    public static void main(String[] args) {
        launch(args);
    }
}

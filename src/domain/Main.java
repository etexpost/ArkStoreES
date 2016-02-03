package domain;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../resource/fxml/login.fxml"));
        primaryStage.setTitle("ArkStore");
        primaryStage.setMinHeight(350);
        primaryStage.setMinWidth(350);
        primaryStage.setMaxHeight(350);
        primaryStage.setMaxWidth(350);
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

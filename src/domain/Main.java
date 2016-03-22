package domain;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
    /** ініціалізація параметрів поточного користувача **/

        User curentUser = new User();
        initCurentUser(curentUser);

        Login loginWindow = new Login();
        loginWindow.openLoginWindow();



 /**
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
**/


    }

    /** ініціалізація параметрів поточного користувача **/
    private static void initCurentUser (User curentUser) {
        curentUser.setAccessStatus(false);
        curentUser.setStatus(null);
    };


    public static void main(String[] args) {
        launch(args);
    }
}

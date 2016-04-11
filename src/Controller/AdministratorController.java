package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Андрей on 22.03.2016.
 */
public class AdministratorController {

    @FXML
    private Button btnDirClients;

    @FXML
    private Button btnDirTMC;

    @FXML
    private Button btnDirAcceptInvoice;


    //відкриття вікна "Довідник Клієнтів"
    public void openDirClientsWindow() {
        Stage login = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../resource/fxml/dir_clients_admin.fxml"));
            login.setTitle("ArkStore - Довідник прибуткових накладних");
            login.setScene(new Scene(root, 1024, 768));
            login.setResizable(true);
            login.setAlwaysOnTop(true);
            login.initModality(Modality.WINDOW_MODAL);
            login.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //відкриття вікна "Довідник ТМЦ"
    public void openDirTMCWindow() {
        Stage login = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../resource/fxml/dir_tmc_admin.fxml"));
            login.setTitle("ArkStore - Довідник клієнтів");
            login.setScene(new Scene(root, 1024, 768));
            login.setResizable(true);
            login.setAlwaysOnTop(true);
            login.initModality(Modality.WINDOW_MODAL);
            login.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //відкриття вікна "Довідник Прибуткових накладних"
    public void openDirAcceptInvoiceWindow() {
        Stage login = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../resource/fxml/dir_acceptInvoice_admin.fxml"));
            login.setTitle("ArkStore - Довідник прибуткових накладних");
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

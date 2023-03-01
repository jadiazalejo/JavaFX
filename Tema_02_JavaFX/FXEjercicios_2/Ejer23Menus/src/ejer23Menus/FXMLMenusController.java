/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer23Menus;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class FXMLMenusController implements Initializable {

    @FXML
    private MenuItem idAnyadir;
    @FXML
    private MenuItem idListar;
    @FXML
    private MenuItem idItem;
    @FXML
    private MenuItem idClose;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void anyadir() {
        // creamos la alerta
        Alert a = new Alert(Alert.AlertType.NONE);
        // creamos la alerta y la respuesta
        // set alert type
        a.setAlertType(Alert.AlertType.INFORMATION);
        // set header
        a.setHeaderText(null);
        // set content text
        a.setContentText("Has seleccionado AÑADIR");
        // mostramos la alerta
        a.show();
    }

    @FXML
    public void listar() {
        // creamos la alerta
        Alert a = new Alert(Alert.AlertType.NONE);
        // creamos la alerta y la respuesta
        // set alert type
        a.setAlertType(Alert.AlertType.INFORMATION);
        // set header
        a.setHeaderText(null);
        // set content text
        a.setContentText("Has seleccionado LISTAR");
        // mostramos la alerta
        a.show();
    }

    @FXML
    public void item() {
        // creamos la alerta
        Alert a = new Alert(Alert.AlertType.NONE);
        // creamos la alerta y la respuesta
        // set alert type
        a.setAlertType(Alert.AlertType.INFORMATION);
        // set header
        a.setHeaderText(null);
        // set content text
        a.setContentText("Has seleccionado ITEM");
        // mostramos la alerta
        a.show();
    }

    @FXML
    private void cerrarVentana() {

        System.exit(0);
    }

}

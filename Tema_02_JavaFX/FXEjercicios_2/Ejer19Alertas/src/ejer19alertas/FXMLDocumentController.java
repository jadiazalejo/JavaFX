/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer19alertas;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;

/**
 * FXML Controller class
 *
 * @author adminroot
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button idConfirmacion;
    @FXML
    private Button idConfirmacion1;
    @FXML
    private Button idConfirmacion11;
    @FXML
    private Button idConfirmacion111;
    @FXML
    private Label idTexto;
    @FXML
    private Button idConfirmacion1111;
    @FXML
    private Label idSelect;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void alertaConfirm() {
        // creamos la alerta y la respuesta
        Alert a = new Alert(AlertType.NONE);
        Optional<ButtonType> result;

        // set alert type
        a.setAlertType(AlertType.CONFIRMATION);
        // set header
        a.setHeaderText(null);
        // set content text
        a.setContentText("Ejemplo ALERTA confirmación");

        // mostramos la alerta y recogemos la respuesta
        result = a.showAndWait();
        if (result.get() == ButtonType.OK) {
            System.out.println("Has pulsado Aceptar");
        } else {
            System.out.println("Has pulsado Cancelar");
        }
    }

    @FXML
    private void alertaError() {
        // creamos la alerta
        Alert a = new Alert(AlertType.NONE);

        // set alert type
        a.setAlertType(AlertType.ERROR);
        // set header
        a.setHeaderText(null);
        // set content text
        a.setContentText("El valor no es válido");

        // mostramos la alerta
        a.show();
    }

    @FXML
    private void alertaInfo() {

        // creamos la alerta
        Alert a = new Alert(AlertType.NONE);

        // set alert type
        a.setAlertType(AlertType.INFORMATION);
        // set header
        a.setHeaderText(null);
        // set content text
        a.setContentText("El objeto ha sido creado");

        // mostramos la alerta
        a.show();
    }

    @FXML
    private void textInputVentana() {
        String respuesta = null;
        Optional<String> result;

        // create a text input dialog 
        TextInputDialog td = new TextInputDialog("Escribe texto ");
        // setHeaderText 
        td.setHeaderText("Teclea tu nombre ");
        result = td.showAndWait();
        if (result.isPresent()) {
            respuesta = td.getEditor().getText();
            idTexto.setText(respuesta);
        } else {
            System.out.println("Has pulsado Cancelar");
        }
    }
    
    @FXML
    private void selectChoiceVentana() {
        
        // items for the dialog
        String days[] = { "Lunes", "Martes", "Mirércoles", 
                          "Jueves", "Viernes" };
        // create a choice dialog
        ChoiceDialog d = new ChoiceDialog(days[1], days);
        // la cabecera
        d.setHeaderText("Día de la semana");
        // set content text
        d.setContentText("Por favor seleccione el día");
        // show the dialog
        d.showAndWait();
        // get the selected item
        idSelect.setText(d.getSelectedItem() + " seleccionado");
    }
}

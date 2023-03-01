/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Vistas;

import Modelo.Empleado;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author adminroot
 */
public class FXMLMuestraController implements Initializable {

    Empleado empleado;

    @FXML
    TextField dni, nombre, apellidos, telefono, sueldo;
    @FXML
    TextArea direcc;
    @FXML
    Slider edad;
    @FXML
    Label edadValor;
    @FXML
    ComboBox dpto;
    @FXML
    RadioButton indefinido, eventual;
    @FXML
    Button btnCerrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        dpto.getItems().add("Personal");
        dpto.getItems().add("Informática");
        dpto.getItems().add("Comercial");
        dpto.getSelectionModel().selectFirst();
        edad.setOnMouseClicked(event -> {
            edadValor.setText(String.valueOf(edad.getValue()));
        });

    }

    public void botonAceptar() {

        Stage v = (Stage) btnCerrar.getScene().getWindow();
        v.close();
    }

    public void setDatos(Empleado e) {
        empleado = e;
        dni.setText(e.getDni());
        nombre.setText(e.getNombre());
        direcc.setText(e.getDireccion());
        telefono.setText(e.getTelefono());
        edad.setValue(e.getEdad());
        edadValor.setText(String.valueOf(edad.getValue()));
        if (e.isEstado()) {
            indefinido.setSelected(true);
        } else {
            eventual.setSelected(true);
        }
        dpto.setValue(e.getDpto());
        sueldo.setText(String.valueOf(e.getSueldo_bruto()));

    }

}

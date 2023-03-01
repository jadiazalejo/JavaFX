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
public class FXMLAltaController implements Initializable {

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
    Button btnAceptar;

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
        empleado.setDni(dni.getText());
        empleado.setNombre(nombre.getText() + " " + apellidos.getText());
        empleado.setDireccion(direcc.getText());
        empleado.setDpto(dpto.getValue().toString());
        empleado.setTelefono(telefono.getText());
        empleado.setEdad((int) edad.getValue());
        if (indefinido.isSelected()) {
            empleado.setEstado(true);
        } else if (eventual.isSelected()) {
            empleado.setEstado(false);
        }
        empleado.setSueldo_bruto(Float.parseFloat(sueldo.getText()));
        Stage v = (Stage) btnAceptar.getScene().getWindow();
        v.close();
    }

    public void setDatos(Empleado e) {
        empleado = e;
    }
}

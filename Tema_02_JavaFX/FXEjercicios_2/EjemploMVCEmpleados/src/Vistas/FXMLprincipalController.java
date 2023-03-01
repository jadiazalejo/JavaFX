/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Vistas;

import Modelo.Empleado;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FXMLprincipalController implements Initializable {
 Empleado empleado = new Empleado();

    @FXML
    private Button btnAlta;
    @FXML
    private Button btnMostrar;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        Button boton = (Button) event.getSource();
        if (boton.getText().equals("Alta Empleado")) {
            try {
                FXMLLoader fxml = new FXMLLoader(getClass().getResource("FXMLAlta.fxml"));
                AnchorPane rootC = fxml.<AnchorPane>load();
                Scene scene = new Scene(rootC);
                Stage altaStage = new Stage();
                altaStage.setTitle("Alta Empleados");
                altaStage.setScene(scene);
                altaStage.initModality(Modality.APPLICATION_MODAL);
                altaStage.show();
                FXMLAltaController cc = fxml.getController();
                cc.setDatos(empleado);
            } catch (IOException ex) {
                System.out.println("Error al crear la vista"+ex.getMessage());
            }
        } else {
            try {
                FXMLLoader fxml = new FXMLLoader(getClass().getResource("FXMLMuestra.fxml"));
                AnchorPane rootC = fxml.<AnchorPane>load();
                Scene scene = new Scene(rootC);
                Stage altaStage = new Stage();
                altaStage.setTitle("Muestra Empleados");
                altaStage.setScene(scene);
                altaStage.initModality(Modality.APPLICATION_MODAL);
                altaStage.show();
                FXMLMuestraController cc = fxml.getController();
                cc.setDatos(empleado);
            } catch (IOException ex) {
                System.out.println("Error al crear la vista");
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}

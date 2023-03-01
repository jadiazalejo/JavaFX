/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer10otrosbotones;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class FXMLDocumentController implements Initializable {

    @FXML
    private ToggleButton idIzq, idCen, idDer;
    @FXML
    private Label idLabIzq, idLabCen, idLabDer;
    @FXML
    private ToggleButton idIzq1, idCen1, idDer1;
    @FXML
    private ToggleGroup grupoToggle;
    @FXML
    private Label idLabGrupo;
    @FXML
    private Label idLabelPass;
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML   
    private void verEstadoGrupo(ActionEvent event) {
        
        ToggleButton seleccionadoToggleButton =(ToggleButton) grupoToggle.getSelectedToggle();
        if (seleccionadoToggleButton!=null)
           idLabGrupo.setText("Botón seleccionado :"+seleccionadoToggleButton.getText());
        
    }
    @FXML  
    private void verEstados(ActionEvent event) {
        if (idIzq.isSelected())
            idLabIzq.setText("Izquierda pulsado");
           else
            idLabIzq.setText("Izquierda NO pulsado");
        if (idCen.isSelected())
            idLabCen.setText("Centro pulsado");
           else
            idLabCen.setText("Centro NO pulsado");
        if (idDer.isSelected())
            idLabDer.setText("Derecha pulsado");
           else
            idLabDer.setText("Derecha NO pulsado");
    }
    

}

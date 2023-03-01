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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Label idLabelRadio, idLabC1, idLabC2, idLabC3;
    @FXML
    private CheckBox idCheck1, idCheck2, idCheck3;
    @FXML
    private ToggleGroup grupoRadios;
    @FXML
    private Label idLabelPass;
    @FXML
    private RadioButton idRadio1, idRadio2, idRadio3, idRadio4;

            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        actualiza1();
        actualiza2();
        actualiza3();
    }    

    @FXML
    private void actualiza1(){
        if (idCheck1.isSelected())
            idLabC1.setText("Estado CHECK Nº1 SELECCIONADO");
        else if (idCheck1.isIndeterminate())
            idLabC1.setText("Estado CHECK Nº1 INDETERMINADO");
        else
            idLabC1.setText("Estado CHECK Nº1 NO SELECCIONADO");
        
    }
    @FXML
    private void actualiza2(){
        if (idCheck2.isSelected())
            idLabC2.setText("Estado CHECK Nº2 SELECCIONADO");
        else if (idCheck2.isIndeterminate())
            idLabC2.setText("Estado CHECK Nº2 INDETERMINADO");
        else
            idLabC2.setText("Estado CHECK Nº2 NO SELECCIONADO");
        
    }
    @FXML
    private void actualiza3(){
        if (idCheck3.isSelected())
            idLabC3.setText("Estado CHECK Nº3 SELECCIONADO");
        else if (idCheck3.isIndeterminate())
            idLabC3.setText("Estado CHECK Nº3 INDETERMINADO");
        else
            idLabC3.setText("Estado CHECK Nº3 NO SELECCIONADO");
        
    }
    @FXML
    private void actualizaRadios(){
        if (idRadio1.isSelected())
            idLabelRadio.setText("Radio seleccionado : Izquierda");
        else if (idRadio2.isSelected())
            idLabelRadio.setText("Radio seleccionado : Derecha");
        else if (idRadio3.isSelected())
            idLabelRadio.setText("Radio seleccionado : Arriba");
        else if (idRadio4.isSelected())
            idLabelRadio.setText("Radio seleccionado : Abajo");
    }
}

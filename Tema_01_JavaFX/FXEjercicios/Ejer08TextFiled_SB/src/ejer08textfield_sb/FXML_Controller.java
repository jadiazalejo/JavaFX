/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer08textfield_sb;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author adminroot
 */
public class FXML_Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML 
    private TextField idNombre;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void onClickBoton(ActionEvent actionEvent){
        // código asociado al evento click sobre el botón
        System.out.println("Este el el texto: "+idNombre.getText());
    }
    
}

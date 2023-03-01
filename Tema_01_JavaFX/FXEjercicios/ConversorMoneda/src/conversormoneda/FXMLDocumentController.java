/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package conversormoneda;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author adminroot
 */
public class FXMLDocumentController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField euros;
    @FXML
    private Label lbLibras;
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void manejoBoton(){
        float cantEuros, cantLibras;
        
        cantEuros = Float.parseFloat(euros.getText());
        cantLibras = (float) (cantEuros * 1.13);
        
        lbLibras.setText(cantLibras+ " Libras");
    }
    
}

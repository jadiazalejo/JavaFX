/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer14calcufact;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    private TextField idNum;
    @FXML
    private Button btnCalcular;
    @FXML
    private Label idLabFactorial, idLabelError;
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void calculaFactorial(){
        String r="";
        int n1, cont, result=1;
        try {
            idLabelError.setVisible(false);
            n1 = Integer.parseInt(idNum.getText());
            for (cont=2;cont<=n1;cont++)
                result = result * cont;
            r += String.valueOf(result);
            idLabFactorial.setText("Factorial : " + r);
           
        } catch (NumberFormatException e) {
            idLabelError.setText("ERROR: número incorrecto");
            idLabelError.setVisible(true);
            idNum.requestFocus();
        }
        
    }
    
}

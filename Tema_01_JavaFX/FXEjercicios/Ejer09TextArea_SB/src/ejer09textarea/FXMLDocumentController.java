/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer09textarea;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author adminroot
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btnLeeTraspasa;
    @FXML
    private TextArea idTextAreaInicial;
    @FXML
    private TextArea idTextAreaFinal;
    @FXML
    private PasswordField idPass;
    @FXML
    private Button idVer;
    @FXML
    private Label idLabelPass;
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void manejoBoton(){
        String s;
        
        s = idTextAreaInicial.getText();
        idTextAreaFinal.setText(s);
    }
    
    @FXML
    private void verPassWord(){
        String s;
        
        s = idPass.getText();
        idLabelPass.setText("Tu password es :"+s);
    }
}

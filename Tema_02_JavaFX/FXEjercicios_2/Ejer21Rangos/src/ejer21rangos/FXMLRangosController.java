/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer21rangos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;

public class FXMLRangosController implements Initializable {

    @FXML
    private Slider sliderR, sliderV, sliderA;
    @FXML
    private Label idLabelColor;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void cambiaColor() {
        float rojo = 0, verde = 0, azul = 0;

        rojo = (float)  sliderR.getValue()/255;
        verde = (float) sliderV.getValue()/255;
        azul = (float)  sliderA.getValue()/255;
        
        Color c = new Color(rojo, verde, azul,1.0);
       
        idLabelColor.setTextFill(c);

    }

}

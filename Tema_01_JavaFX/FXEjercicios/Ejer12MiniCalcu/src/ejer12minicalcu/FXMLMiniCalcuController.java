/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer12minicalcu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLMiniCalcuController implements Initializable {

    @FXML
    private Button idBSuma, idBResta, idBMult, idBDiv, idBReset;
    @FXML
    private TextField idNum1, idNum2;
    @FXML
    private Label idLabelResult, idLabelError;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void reset() {
        idLabelError.setVisible(false);
        idLabelResult.setText("RESULTADO : ");
        idNum1.setText("");
        idNum2.setText("");
        idNum1.requestFocus();
    }
    
    @FXML
    private void suma() {
        String r;
        float n1, n2, result;
        try {
            idLabelError.setVisible(false);
            n1 = Float.parseFloat(idNum1.getText());
            try {
                n2 = Float.parseFloat(idNum2.getText());
                result = n1 + n2;
                r = idNum1.getText() + " + " + idNum2.getText();
                r += " = " + String.valueOf(result);
                idLabelResult.setText("RESULTADO : " + r);
            } catch (NumberFormatException e) {
                idLabelError.setText("ERROR: segundo operador incorrecto");
                idLabelError.setVisible(true);
                idNum2.requestFocus();
            }
        } catch (NumberFormatException e) {
            idLabelError.setText("ERROR: primer operador incorrecto");
            idLabelError.setVisible(true);
            idNum1.requestFocus();
        }
    }

    @FXML
    private void resta() {
        String r;
        float n1, n2, result;
        try {
            idLabelError.setVisible(false);
            n1 = Float.parseFloat(idNum1.getText());
            try {
                n2 = Float.parseFloat(idNum2.getText());
                result = n1 - n2;
                r = idNum1.getText() + " - " + idNum2.getText();
                r += " = " + String.valueOf(result);
                idLabelResult.setText("RESULTADO : " + r);
            } catch (NumberFormatException e) {
                idLabelError.setText("ERROR: segundo operador incorrecto");
                idLabelError.setVisible(true);
                idNum2.requestFocus();
            }
        } catch (NumberFormatException e) {
            idLabelError.setText("ERROR: primer operador incorrecto");
            idLabelError.setVisible(true);
            idNum1.requestFocus();
        }
    }
    @FXML
    private void producto() {
        String r;
        float n1, n2, result;
        try {
            idLabelError.setVisible(false);
            n1 = Float.parseFloat(idNum1.getText());
            try {
                n2 = Float.parseFloat(idNum2.getText());
                result = n1 * n2;
                r = idNum1.getText() + " * " + idNum2.getText();
                r += " = " + String.valueOf(result);
                idLabelResult.setText("RESULTADO : " + r);
            } catch (NumberFormatException e) {
                idLabelError.setText("ERROR: segundo operador incorrecto");
                idLabelError.setVisible(true);
                idNum2.requestFocus();
            }
        } catch (NumberFormatException e) {
            idLabelError.setText("ERROR: primer operador incorrecto");
            idLabelError.setVisible(true);
            idNum1.requestFocus();
        }
    }

    @FXML
    private void division() {
        String r;
        float n1, n2, result;
        try {
            idLabelError.setVisible(false);
            n1 = Float.parseFloat(idNum1.getText());
            try {
                n2 = Float.parseFloat(idNum2.getText());
                if (n2 != 0) {
                    result = n1 - n2;
                    r = idNum1.getText() + " - " + idNum2.getText();
                    r += " = " + String.valueOf(result);
                    idLabelResult.setText("RESULTADO : " + r);
                } else {
                    idLabelError.setText("ERROR: División por cero");
                    idLabelError.setVisible(true);
                    idNum2.requestFocus();
                }
            } catch (NumberFormatException e) {
                idLabelError.setText("ERROR: segundo operador incorrecto");
                idLabelError.setVisible(true);
                idNum2.requestFocus();
            }
        } catch (NumberFormatException e) {
            idLabelError.setText("ERROR: primer operador incorrecto");
            idLabelError.setVisible(true);
            idNum1.requestFocus();
        }
    }

}

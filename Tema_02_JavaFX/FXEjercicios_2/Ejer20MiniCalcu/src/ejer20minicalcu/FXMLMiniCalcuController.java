/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer20minicalcu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class FXMLMiniCalcuController implements Initializable {

    @FXML
    private RadioButton idR1, idR2, idR3;
    @FXML
    private ToggleGroup grupoOp;
    @FXML
    private TextField idNum1, idNum2;
    @FXML
    private Label idLabelResult, idLabelError;
    @FXML
    private Button idBCalcular, idBReset;
    @FXML
    private Slider idSlide1;
    @FXML
    private Slider idSlide2;

    @FXML
    private ProgressIndicator idIndicador;

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
    private void calcula() {
        if (idR1.isSelected()) {
            suma();
        } else if (idR2.isSelected()) {
            producto();
        } else {
            elevado();
        }
    }

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
                idSlide1.setValue(n1);
                idSlide2.setValue(n2);
                idIndicador.setProgress(n1+n2);
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

    private void elevado() {
        String r;
        float n1, n2, result;
        try {
            idLabelError.setVisible(false);
            n1 = Float.parseFloat(idNum1.getText());
            try {
                n2 = Float.parseFloat(idNum2.getText());
                result = (float) Math.pow(n1, n2);
                r = idNum1.getText() + " ^ " + idNum2.getText();
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


}

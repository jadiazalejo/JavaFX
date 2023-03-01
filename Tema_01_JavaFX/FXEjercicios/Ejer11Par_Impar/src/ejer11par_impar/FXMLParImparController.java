/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer11par_impar;

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
public class FXMLParImparController implements Initializable {

    @FXML
    private TextField idNum;
    @FXML
    private Label idResult;
    @FXML
    private Button idBotComprobar, idBotBorrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void escribeResult() {
        int num;
        if (idNum.getText().equals("")) {
            idResult.setText("");
        } else {
            num = Integer.parseInt(idNum.getText());
            if (num % 2 == 0) {
                idResult.setText("Es PAR");
            } else {
                idResult.setText("Es IMPAR");
            }

        }

    }
    @FXML
    private void borraNum() {
        idNum.setText("");
        idResult.setText("");
    }
}
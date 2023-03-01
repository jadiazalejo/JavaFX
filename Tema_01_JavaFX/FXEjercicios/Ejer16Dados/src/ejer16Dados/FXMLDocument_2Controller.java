/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer16Dados;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author adminroot
 */
public class FXMLDocument_2Controller implements Initializable {

    @FXML
    private Button btnLanzar;
    @FXML
    private Label idLabResult;
    @FXML
    private Button idBt6;
    @FXML
    private Button idBt8;
    @FXML
    private Button idBt10;
    @FXML
    private Button idBt12;
    @FXML
    private Button idBt20;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void selecciona(ActionEvent event) {
    }

    @FXML
    private void lanzaDados6() {
        int num;
        Random rand = new Random();
        num = rand.nextInt(6) + 1;
        idLabResult.setText(String.valueOf(num));
    }
    @FXML
    private void lanzaDados8() {
        int num;
        Random rand = new Random();
        num = rand.nextInt(8) + 1;
        idLabResult.setText(String.valueOf(num));
    }
    @FXML
    private void lanzaDados10() {
        int num;
        Random rand = new Random();
        num = rand.nextInt(10) + 1;
        idLabResult.setText(String.valueOf(num));
    }
    @FXML
    private void lanzaDados12() {
        int num;
        Random rand = new Random();
        num = rand.nextInt(12) + 1;
        idLabResult.setText(String.valueOf(num));
    }
    @FXML
    private void lanzaDados20() {
        int num;
        Random rand = new Random();
        num = rand.nextInt(20) + 1;
        idLabResult.setText(String.valueOf(num));

    }

}

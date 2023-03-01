/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer16Dados;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author adminroot
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btnLanzar;
    @FXML
    private Label idLabResult;
    @FXML
    private RadioButton idR6;
    @FXML
    private ToggleGroup dados;
    @FXML
    private RadioButton idR8;
    @FXML
    private RadioButton idR10;
    @FXML
    private RadioButton idR12;
    @FXML
    private RadioButton idR20;
    @FXML
    private ImageView idImage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void cambiaImage() {
        if (idR6.isSelected()) {
            idImage.setImage(new Image("Images/6dado.jpg"));
        } else if (idR8.isSelected()) {
            idImage.setImage(new Image("Images/8dado.jpg"));
        } else if (idR10.isSelected()) {
            idImage.setImage(new Image("Images/10dado.jpg"));
        } else if (idR12.isSelected()) {
            idImage.setImage(new Image("Images/12dado.jpg"));
        } else if (idR20.isSelected()) {
            idImage.setImage(new Image("Images/20dado.jpg"));
        }

    }

    @FXML
    private void lanzaDados() {
        int num;
        Random rand = new Random();
        if (idR6.isSelected()) {
            num = rand.nextInt(6) + 1;
            idLabResult.setText(String.valueOf(num));
        } else if (idR8.isSelected()) {
            num = rand.nextInt(8) + 1;
            idLabResult.setText(String.valueOf(num));
        } else if (idR10.isSelected()) {
            num = rand.nextInt(10) + 1;
            idLabResult.setText(String.valueOf(num));
        } else if (idR12.isSelected()) {
            num = rand.nextInt(12) + 1;
            idLabResult.setText(String.valueOf(num));
        } else if (idR20.isSelected()) {
            num = rand.nextInt(20) + 1;
            idLabResult.setText(String.valueOf(num));
        }
    }

}

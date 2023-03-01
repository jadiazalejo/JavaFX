/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer18burgermenu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author adminroot
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private RadioButton idH1;
    @FXML
    private ToggleGroup burguer, pan, patatas, bebidas, servicio;
    @FXML
    private RadioButton idH2, idH3, idH4;
    @FXML
    private RadioButton idP1, idP2, idP3;
    @FXML
    private RadioButton idPat1, idPat2, idPat3;
    @FXML
    private RadioButton idBeb1, idBeb2, idBeb3, idBeb4, idBeb5;
    @FXML
    private CheckBox idExtraDoble, idExtraQueso, idExtraPatatas;
    @FXML
    private CheckBox idExtras;
    @FXML
    private RadioButton idRecogida, idDomicilio;
    @FXML
    private CheckBox idCheckKepchup, idCheckBarbacoa, idCheckMostaza, idCheckThai;
    @FXML
    private TextField idCantK, idCantB, idCantM, idCantT;
    @FXML
    private VBox idBoxExtras, idSalsas;
    @FXML
    private Label idPrecioSin;
    @FXML
    private Label idPrecioFinal;
    @FXML
    private Label idIva;
    @FXML
    private Spinner idSpinner;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        calculPrecio();
    }

    @FXML
    private void muestraExtras() {
        if (idExtras.isSelected()) {
            idBoxExtras.setDisable(false);
            idSalsas.setDisable(false);
        } else {
            idBoxExtras.setDisable(true);
            idSalsas.setDisable(true);
        }
        calculPrecio();
    }

    @FXML
    private void calculPrecio() {
        float precio = 8, iva;
        if (idH3.isSelected() || idH4.isSelected()) {
            precio = precio + 1;
        }
        if (idPat3.isSelected()) {
            precio = precio + 1;
        }
        if (idExtras.isSelected()) {
                if (idExtraDoble.isSelected()) {
                    precio = precio + 2;
                }
                if (idExtraQueso.isSelected()) {
                    precio = precio + 0.5f;
                }
                if (idExtraPatatas.isSelected()) {
                    precio = precio + 1;
                }
                if (idCheckKepchup.isSelected()){
                    precio = precio +(Integer.parseInt(idCantK.getText())*0.5f);
                }
                if (idCheckBarbacoa.isSelected()){
                    precio = precio +(Integer.parseInt(idCantB.getText())*0.5f);
                }
                if (idCheckMostaza.isSelected()){
                    precio = precio +(Integer.parseInt(idCantM.getText())*0.5f);
                }
                if (idCheckThai.isSelected()){
                    precio = precio +(Integer.parseInt(idCantT.getText())*0.5f);
                }
        }
        iva = (precio * 21) / 100;
        idPrecioSin.setText(String.valueOf(precio));
        idIva.setText(String.valueOf(iva));
        idPrecioFinal.setText(String.valueOf(iva + precio));

    }

}

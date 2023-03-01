/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer15dnivalido;

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
    private Button btnValidar;
    @FXML
    private Label idLabelError;
    @FXML
    private Label idLabValido;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void validadDNI() {
        String dni;
        String valido = "INCORRECTO";

        dni = idNum.getText();
        if (comprobarFormato(dni)) {
            if (comprobarLetra(dni)) {
                idLabelError.setText("");
                idLabelError.setVisible(false);
                valido = "CORRECTO";
            } else {
                idLabelError.setText("Letra incorrecta");
                idLabelError.setVisible(true);
            }
        } else {
            idLabelError.setText("Formato incorrecto");
            idLabelError.setVisible(true);
        }

        idLabValido.setText(valido);

    }

    private static boolean comprobarFormato(String dni) {
        boolean valido = true;

        valido = (dni.length() == 9);

        if (valido) {
            char c = dni.charAt(dni.length() - 1);
            valido = Character.isLetter(c);
        }

        if (valido) {
            int i = 0;
            while (valido && i < dni.length() - 2) {
                char n = dni.charAt(i);
                valido = Character.isDigit(n);
                i++;
            }
        }

        return valido;
    }

    private static boolean comprobarLetra(String dni) {
        final String NIF_STRING_ASOCIATION = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = dni.charAt(dni.length() - 1);
        int num = Integer.valueOf(dni.substring(0, dni.length() - 1));

        return NIF_STRING_ASOCIATION.charAt(num % 23) == letra;
    }

}

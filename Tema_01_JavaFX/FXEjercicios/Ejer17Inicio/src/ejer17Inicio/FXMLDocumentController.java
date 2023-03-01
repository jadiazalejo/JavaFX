/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer17Inicio;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author adminroot
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label idLabResult;
    @FXML
    private Button idBtInicio;
    @FXML
    private TextField idUsuario;
    @FXML
    private PasswordField idPass;
    @FXML
    private Button idBtReset;
    @FXML
    private Button idBtRegistra;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void comprobar() {
        // lectura del fichero (de manera análoga a la escritura)
        FileOutputStream fs;
        FileInputStream fe;
        DataInputStream d;
        ObjectOutputStream oos;
        ObjectInputStream ois;
        File f;
        Usuario a;
        boolean acceso=false;
        try {
            f = null;
            fe = null;
            d = null;
            try {
                f = new File("usuarios.txt");
                if (f.exists()) {
                    // Asociamos el FileInputStream con el ObjectInputStream
                    fe = new FileInputStream(f);
                    ois = new ObjectInputStream(fe);
                    while (fe.available() > 0) {
                        a = null;
                        a = (Usuario) ois.readObject();
                        if (a.getPwd().equals(idPass.getText()) && a.getUsuario().equals(idUsuario.getText())){
                           idLabResult.setText("Acceso correcto");
                           acceso=true;
                        }
                    }
                    if(!acceso){
                        idLabResult.setText("Acceso INCORRECTO");
                    }
                }
            } catch (EOFException eof) {
                // Excepción de fin de fichero atrapada por el bloque catch
                System.out.println("Fin de Fichero encontrado ");
            } catch (FileNotFoundException fnf) {
                System.out.println("Fichero no encontrado " + fnf);
            } catch (IOException e) {
                System.out.println("Se ha producido una IOException");
            } catch (ClassNotFoundException e) {
                System.out.println("Error de programa" + e);
            } finally {
                if (d != null) {
                    d.close();
                    fe.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

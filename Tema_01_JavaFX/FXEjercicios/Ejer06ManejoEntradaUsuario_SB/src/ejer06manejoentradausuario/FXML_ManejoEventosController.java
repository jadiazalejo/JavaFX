/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer06manejoentradausuario;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author adminroot
 */
public class FXML_ManejoEventosController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    public void keyPressed(KeyEvent keyEvent) {
            // Insertar aquí el código a ejecutar cuando se pulse el ratón
            System.out.println("Evento");
            System.out.println("--->"+keyEvent.getText());
            switch (keyEvent.getCode().getName()) {
                case "Esc" ->  {
                    System.out.println("Tecla reconocida");
                    System.out.println(keyEvent.getCode().getName());
                }
                case "Enter" ->  {
                    System.out.println("Tecla reconocida");
                    System.out.println(keyEvent.getCode().getName());
                }
                default -> {
                    System.out.println("Tecla no reconocida");
                    System.out.println(keyEvent.getCode().getName());
                }
            }
    }
    
    @FXML
    public void ratonClicked(MouseEvent mouseEvent) {
            // Insertar aquí el código a ejecutar cuando se haga clic en el ratón
            System.out.println("Ratón clicado en (x, y): ("
                    + mouseEvent.getX() + ", " + mouseEvent.getY() + ")");
            // También se puede comprobar sobre qué botón se ha actuado,
            //  válido para cualquier acción (pressed, released, clicked, etc)
            if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                System.out.println("Botón principal");
            } else if (mouseEvent.getButton() == MouseButton.SECONDARY) {
                System.out.println("Botón secundario");
            }
    }
    
    @FXML
    public void ratonReleased(MouseEvent mouseEvent){
            // Insertar aquí el código a ejecutar cuando se suelte el ratón
            System.out.println("Ratón soltado en (x, y): ("
                    + mouseEvent.getX() + ", " + mouseEvent.getY() + ")");
    }
}

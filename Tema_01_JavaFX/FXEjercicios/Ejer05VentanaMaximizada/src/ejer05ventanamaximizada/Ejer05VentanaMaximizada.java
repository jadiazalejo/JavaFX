/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer05ventanamaximizada;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author adminroot
 */
public class Ejer05VentanaMaximizada extends Application {
    
    @Override
  public void start(Stage primaryStage) {
    
    // creamos control etiqueta
    Label label = new Label("¡Hola Mundo, JavaFX!");
    label.setFont(new Font("Arial", 50));
    label.setAlignment(Pos.CENTER);
    
    // creamos escena, añadimos control y cammiamos cursor del ratón
    Scene scene = new Scene(label);
    scene.setCursor(Cursor.OPEN_HAND);

    // colocamos escena en el escenario primario y maximizamos ventana
    primaryStage.setScene(scene);
    primaryStage.setMaximized(true);
    primaryStage.setTitle("Saludos");
    
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
    
}
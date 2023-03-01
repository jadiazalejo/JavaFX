/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer03ventanas;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ejer03Ventanas extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
   public void start(Stage primaryStage) {
    
    // creamos control etiqueta
    Label label = new Label("¡Hola Mundo, JavaFX!");
    label.setFont(new Font("Arial", 50));
    label.setAlignment(Pos.CENTER);
    
    // creamos escena con el control anterior
    Scene scene = new Scene(label);

    // colocamos escena en el escenario primario y ponemos pantalla completa
    primaryStage.setScene(scene);
    primaryStage.setFullScreen(true);
    primaryStage.setTitle("Saludos");
    
    primaryStage.show();
  }
    
}

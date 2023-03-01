/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer16Dados;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author adminroot
 */
public class Ejer16Dados extends Application {

    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument_2.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Ejer16_CSS.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        
        launch(args);
    }
    
}

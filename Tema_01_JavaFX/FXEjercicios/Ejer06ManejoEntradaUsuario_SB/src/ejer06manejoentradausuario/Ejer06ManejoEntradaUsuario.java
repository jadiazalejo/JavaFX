/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer06manejoentradausuario;


import java.util.concurrent.TimeUnit;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ejer06ManejoEntradaUsuario extends Application {

        public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML_ManejoEventos.fxml"));
        
        // Manejo de eventos emitidos por el escenario
        stage.setOnShowing(event -> messageAndWait5Seconds("Se va a mostrar la ventana (en 5 segundos)"));
        stage.setOnShown(event -> System.out.println("Ventana mostrada"));
        stage.setOnCloseRequest(event -> System.out.println("Recibida petición de cierre de ventana"));
        stage.setOnHiding(event -> messageAndWait5Seconds("Se va a cerrar la ventana (en 5 segundos)"));
        stage.setOnHidden(event -> System.out.println("Ventana cerrada"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        
        launch(args);
    }
    
    public void messageAndWait5Seconds(String msg) {
        System.out.println(msg);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
   

}
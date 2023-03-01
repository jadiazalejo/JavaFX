/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer06manejoentradausuario;

import java.util.concurrent.TimeUnit;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import javafx.stage.Stage;

public class Ejer06ManejoEntradaUsuario extends Application {
 @Override
    public void start(Stage primaryStage) {

        // Configuramos escenario y le añadimos una escena 
        primaryStage.setTitle("Ventanas con eventos");
        Scene scene = newScene();
        primaryStage.setScene(scene);

        // Manejo de eventos emitidos por el escenario
        primaryStage.setOnShowing(event -> messageAndWait5Seconds("Se va a mostrar la ventana (en 5 segundos)"));
        primaryStage.setOnShown(event -> System.out.println("Ventana mostrada"));
        primaryStage.setOnCloseRequest(event -> System.out.println("Recibida petición de cierre de ventana"));
        primaryStage.setOnHiding(event -> messageAndWait5Seconds("Se va a cerrar la ventana (en 5 segundos)"));
        primaryStage.setOnHidden(event -> System.out.println("Ventana cerrada"));
        primaryStage.show();
    }

    private Scene newScene() {
        Label label = new Label("¡Hola Mundo, JavaFX!");
        label.setFont(new Font("Arial", 25));
        label.setAlignment(Pos.CENTER);
        Scene scene = new Scene(label, 300, 200);
        return scene;
    }

    private void messageAndWait5Seconds(String msg) {
        System.out.println(msg);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    

}
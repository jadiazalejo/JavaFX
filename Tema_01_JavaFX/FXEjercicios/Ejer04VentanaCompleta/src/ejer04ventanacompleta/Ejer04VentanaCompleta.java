/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer04ventanacompleta;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Ejer04VentanaCompleta extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX App");

        Stage stage1 = new Stage();
        stage1.setTitle("Soy una ventana secundaria");
        stage1.setScene(new Scene(new Button("Soy un humilde Button")));

        Stage stage2 = new Stage();
        stage2.setX(300);
        stage2.setY(300);
        stage2.initOwner(primaryStage);
        // bloquea la ventana principal (dueña de este escenario)
        stage2.initModality(Modality.WINDOW_MODAL); 
        //stage2.initModality(Modality.APPLICATION_MODAL); // bloquea todas las ventanas
        //stage2.initModality(Modality.NONE);
        stage2.setTitle("Modo ventana: " + stage2.getModality());

        primaryStage.show();
        System.out.println("Hemos lanzado el 'Stage' primario.");

        stage1.show();
        System.out.println("Hemos lanzado el 'Stage' secundario.");

        stage2.showAndWait();
        System.out.println("Hemos cerrado el 'Stage' " + stage2.getTitle());

    }
    
}

package ejer02ventanalabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Ejer02VentanaLabel extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mi primera aplicación JavaFX");

        // para visualizar contenido en la ventana de la aplicación
        // hay que añadir un componente a un objeto Scene, y este al
        // objeto Stage
        
        Label label = new Label("¡Hola Mundo, JavaFX!");
        Scene scene = new Scene(label, 400, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

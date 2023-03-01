/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer17Inicio;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class Ejer17Inicio extends Application {

    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Ejer17_CSS.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        String[] amigos = {"Usuario1", "Usuario2", "Usuario3", "Usuario4"};
        String[] telefonos = {"1234", "4321", "123456", "654321"};
        boolean guardado;
        FileOutputStream fs;
        FileInputStream fe;
        DataInputStream d;
        ObjectOutputStream oos;
        ObjectInputStream ois;
        File f;

        Usuario usu;
        //escritura del fichero
        try {
            /* instanciamos un ObjectOutputStream asociado a un FileOutputStream 
           para escribir objetos en un flujo de salida y al conectarlos al 
           fichero se escriben en el. */
            fs = new FileOutputStream("usuarios.txt");
            oos = new ObjectOutputStream(fs);
            for (int i = 0; i < amigos.length; i++) {
                // construimos un objeto con los datos deseados y lo escribimos
                // en el flujo de salida ObjectOutputStream con el método writeObject
                usu = new Usuario(amigos[i], telefonos[i]);
                oos.writeObject(usu); //escribe el objeto en el flujo salida
            }
            // Cerramos los flujos abiertos una vez utilizados
            oos.close();
            fs.close();
            guardado = true;
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
            guardado = false;
        }

        launch(args);
    }

}

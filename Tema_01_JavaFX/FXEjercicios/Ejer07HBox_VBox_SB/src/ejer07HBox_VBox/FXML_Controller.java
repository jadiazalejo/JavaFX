package ejer07HBox_VBox;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


public class FXML_Controller implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    @FXML
    public void onClickBoton(ActionEvent actionEvent){
        // código asociado al evento click sobre el botón
        System.out.println("Se ha propucido el evento");
    }
}

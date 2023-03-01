/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer22ListasyCajas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;

public class FXMLListasController implements Initializable {

    @FXML
    private ComboBox idComboBox1, idComboBox2;
    @FXML
    private TextField idText;
    @FXML
    private Button idBotonAceptar, idBotonBorrar;
    @FXML
    private ListView idMiLista;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        idComboBox1.getItems().add("Item 1");
        idComboBox1.getItems().add("Item 2");
        idComboBox1.getItems().add("Item 3");
        idComboBox1.getSelectionModel().selectFirst();

        idComboBox2.getItems().add("Opción 1");
        idComboBox2.getItems().add("Opción 2");
        idComboBox2.getItems().add("Opción 3");
        idComboBox2.getItems().add("Opción 4");
        idComboBox2.getSelectionModel().selectFirst();

        idMiLista.getItems().add("Elemento 1");
        idMiLista.getItems().add("Elemento 2");
        idMiLista.getItems().add("Elemento 3");

        idMiLista.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    }

    @FXML
    public void alertComboBox1() {
        // creamos la alerta
        Alert a = new Alert(AlertType.NONE);
        // creamos la alerta y la respuesta
        // set alert type
        a.setAlertType(AlertType.INFORMATION);
        // set header
        a.setHeaderText(null);
        // set content text
        a.setContentText("Has seleccionado :" + idComboBox1.getValue().toString());

        // mostramos la alerta
        a.show();

    }

    @FXML
    public void alertComboBox2() {
        // creamos la alerta
        Alert a = new Alert(AlertType.NONE);
        // creamos la alerta y la respuesta
        // set alert type
        a.setAlertType(AlertType.INFORMATION);
        // set header
        a.setHeaderText(null);
        // set content text
        a.setContentText("Has seleccionado :" + idComboBox2.getValue().toString());

        // mostramos la alerta
        a.show();

    }

    @FXML
    public void alertListView() {
        // creamos la alerta
        Alert a = new Alert(AlertType.NONE);
        ObservableList selectedItems = idMiLista.getSelectionModel().getSelectedItems();
        String items = "";
        // creamos la alerta y la respuesta
        // set alert type
        a.setAlertType(AlertType.INFORMATION);
        // set header
        a.setHeaderText(null);
        // set content text
        for (Object o : selectedItems) {
            items += o.toString() + " ";
        }
        a.setContentText("Has seleccionado :" + items);
        a.show();
    }

    @FXML
    public void insertaItem() {
        String item = idText.getText();
        // creamos la alerta
        Alert a = new Alert(AlertType.NONE);
        // creamos la alerta y la respuesta
        // set alert type
        a.setAlertType(AlertType.INFORMATION);
        // set header
        a.setHeaderText(null);
        if ( item!= null && !item.equalsIgnoreCase("")) {
            idComboBox2.getItems().add(idText.getText());
            a.setContentText("Has añadido :"+idText.getText());
        }
        else
         a.setContentText("Campo en blanco");
        a.show();
    }

    @FXML
    public void borraItem() {
        // creamos la alerta
        Alert a = new Alert(AlertType.NONE);
        // creamos la alerta y la respuesta
        // set alert type
        a.setAlertType(AlertType.INFORMATION);
        // set header
        a.setHeaderText(null);
        String item;
        int i = -1;
        if (idText.getText() != null) {
            item = idText.getText();
            i = idComboBox2.getItems().indexOf(item);
            if (i != -1) {
                idComboBox2.getItems().remove(i);
                a.setContentText("Item borrado :" + item);
            } else {
                a.setContentText("Item No encontrado");
            }
            a.show();
        }

    }
}

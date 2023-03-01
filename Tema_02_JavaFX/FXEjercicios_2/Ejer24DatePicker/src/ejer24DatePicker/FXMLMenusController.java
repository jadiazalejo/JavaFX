/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejer24DatePicker;

import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

public class FXMLMenusController implements Initializable {

    @FXML
    private MenuItem idAnyadir, idListar, idItem, idClose;
    @FXML
    private DatePicker idDatePicker, idDatePicker2;
    @FXML
    private Label idLabelMes, idLabelDia, idLabelAnyo, idLabelDate;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void extraerFecha() {
        LocalDate value = idDatePicker.getValue();
        idLabelDia.setText("Día: " + value.getDayOfMonth());
        idLabelMes.setText("Mes : " + value.getMonthValue());
        idLabelAnyo.setText("Año :" + value.getYear());

    }

    @FXML
    public void extraerFecha_Date() {
        LocalDate value = idDatePicker.getValue();
        Date fecha;
        // Getting system timezone
        ZoneId systemTimeZone = ZoneId.systemDefault();
        // converting LocalDateTime to ZonedDateTime with the system timezone
        ZonedDateTime zonedDateTime = value.atStartOfDay(systemTimeZone);
        fecha = Date.from(zonedDateTime.toInstant());
        idLabelDate.setText(fecha.toString());

    }
    
    @FXML
    public void convertirFecha_Date() {
        LocalDate value = idDatePicker.getValue();
        Date fecha;
        // Getting system timezone
        ZoneId systemTimeZone = ZoneId.systemDefault();
        // converting LocalDateTime to ZonedDateTime with the system timezone
        ZonedDateTime zonedDateTime = value.atStartOfDay(systemTimeZone);
        fecha = Date.from(zonedDateTime.toInstant());      
        
        ZonedDateTime f = fecha.toInstant().atZone(ZoneId.systemDefault());
        idDatePicker2.setValue(f.toLocalDate());

    }

    @FXML
    public void anyadir() {
        // creamos la alerta
        Alert a = new Alert(Alert.AlertType.NONE);
        // creamos la alerta y la respuesta
        // set alert type
        a.setAlertType(Alert.AlertType.INFORMATION);
        // set header
        a.setHeaderText(null);
        // set content text
        a.setContentText("Has seleccionado AÑADIR");
        // mostramos la alerta
        a.show();
    }

    @FXML
    public void listar() {
        // creamos la alerta
        Alert a = new Alert(Alert.AlertType.NONE);
        // creamos la alerta y la respuesta
        // set alert type
        a.setAlertType(Alert.AlertType.INFORMATION);
        // set header
        a.setHeaderText(null);
        // set content text
        a.setContentText("Has seleccionado LISTAR");
        // mostramos la alerta
        a.show();
    }

    @FXML
    public void item() {
        // creamos la alerta
        Alert a = new Alert(Alert.AlertType.NONE);
        // creamos la alerta y la respuesta
        // set alert type
        a.setAlertType(Alert.AlertType.INFORMATION);
        // set header
        a.setHeaderText(null);
        // set content text
        a.setContentText("Has seleccionado ITEM");
        // mostramos la alerta
        a.show();
    }

    @FXML
    private void cerrarVentana() {
        System.exit(0);
    }

}

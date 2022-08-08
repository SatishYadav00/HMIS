package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class AppointmentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private ComboBox select;
    @FXML
    private Button button;
    @FXML
    private Label label2;


    @FXML
    void selectonaction(ActionEvent event) {
      String s=select.getSelectionModel().getSelectedItem().toString();
      label.setText(s);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> list= FXCollections.observableArrayList("Anesthetics","Cardiology","ENT","Gastroenterology","Neurology","Oncology","Orthopedics","Urology");
        select.setItems(list);
    }


    public void oncck(ActionEvent actionEvent) {
       label2.setText("Your appointment has been booked");
    }
}


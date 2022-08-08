package sample.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class login3controller implements Initializable {
    @FXML
    private ImageView photothree;
    @FXML
    private ImageView logothree;
    @FXML
    private Button profilethree;
    @FXML
    private Button logoutthree;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File photothreefile = new File("image/2048px-User_icon_2.svg.png");
        Image photothreeimage = new Image(photothreefile.toURI().toString());
        photothree.setImage(photothreeimage);
        File logothreefile = new File("image/IMG_20220110_193308.jpg");
        Image logothreeimage = new Image(logothreefile.toURI().toString());
        logothree.setImage(logothreeimage);

    }
    public void logoutthreeonaction(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage window = (Stage) logoutthree.getScene().getWindow();
        window.setScene(new Scene(root, 450, 300));
    }
    public void profilethreeonaction(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("profile3.fxml"));
        Stage window = (Stage) profilethree.getScene().getWindow();
        window.setScene(new Scene(root, 450, 300));
        window.setTitle("profile information page");



    }
}

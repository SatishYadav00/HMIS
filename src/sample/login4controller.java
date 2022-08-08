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

public class login4controller implements Initializable {
    @FXML
    private ImageView photofour;
    @FXML
    private ImageView logofour;
    @FXML
    private Button profilefour;
    @FXML
    private Button logoutfour;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File photofourfile = new File("image/2048px-User_icon_2.svg.png");
        Image photofourimage = new Image(photofourfile.toURI().toString());
        photofour.setImage(photofourimage);
        File logothreefile = new File("image/IMG_20220110_193308.jpg");
        Image logothreeimage = new Image(logothreefile.toURI().toString());
        logofour.setImage(logothreeimage);

    }
    public void logoutfouronaction(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage window = (Stage) logoutfour.getScene().getWindow();
        window.setScene(new Scene(root, 450, 300));

    }
    public void profilefouronaction(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("profile4.fxml"));
        Stage window = (Stage) profilefour.getScene().getWindow();
        window.setScene(new Scene(root, 450, 300));
        window.setTitle("profile information page");

    }
}

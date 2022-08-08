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

public class login1controller implements Initializable {
    @FXML
    private ImageView photoone;
    @FXML
    private ImageView logoone;
    @FXML
    private Button logoutone;
    @FXML
    private Button profileone;
    public login1controller(){
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File photoonefile = new File("image/2048px-User_icon_2.svg.png");
        Image photooneimage = new Image(photoonefile.toURI().toString());
        photoone.setImage(photooneimage);

        File logoonefile = new File("image/IMG_20220110_193308.jpg");
        Image logooneimage = new Image(logoonefile.toURI().toString());
        logoone.setImage(logooneimage);


    }

    public void logoutoneonaction(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage window =(Stage) logoutone.getScene().getWindow();
        window.setScene(new Scene(root ,450,300));
    }
    public void profileoneonaction(ActionEvent event) throws  Exception{
        Parent root = FXMLLoader.load(getClass().getResource("profile1.fxml"));
        Stage window =(Stage) profileone.getScene().getWindow();
        window.setScene(new Scene(root,450,300));
        window.setTitle("profile information page");
    }
}

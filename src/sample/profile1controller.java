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



public class profile1controller implements Initializable {
    @FXML
    private ImageView profile1photo;
    @FXML
    private Button profile1button;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File profile1photofile = new File("image/2048px-User_icon_2.svg.png");
        Image profile1photoimage = new Image(profile1photofile.toURI().toString());
        profile1photo.setImage(profile1photoimage);
    }
    public void profile1buttononaction(ActionEvent event) throws  Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login1.fxml"));
        Stage window =(Stage) profile1button.getScene().getWindow();
        window.setScene(new Scene(root,450,300));
}}

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

public class profile4controller implements Initializable {
    @FXML
    private ImageView profile4photo;
    @FXML
    private Button profile4button;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File profile3photofile = new File("image/2048px-User_icon_2.svg.png");
        Image profile3photoimage = new Image(profile3photofile.toURI().toString());
        profile4photo.setImage(profile3photoimage);
    }
    public void profile4buttononaction(ActionEvent event) throws  Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login4.fxml"));
        Stage window =(Stage) profile4button.getScene().getWindow();
        window.setScene(new Scene(root,450,300));


    }


}

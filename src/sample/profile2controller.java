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

public class profile2controller implements Initializable {
    @FXML
    private ImageView profile2photo;
    @FXML
    private Button profile2button;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File profile2photofile = new File("image/2048px-User_icon_2.svg.png");
        Image profile2photoimage = new Image(profile2photofile.toURI().toString());
        profile2photo.setImage(profile2photoimage);
    }
    public void profile2buttononaction(ActionEvent event) throws  Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login2.fxml"));
        Stage window =(Stage) profile2button.getScene().getWindow();
        window.setScene(new Scene(root,450,300));

    }
}

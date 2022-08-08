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

public class login2controller implements Initializable {

    @FXML
    private ImageView phototwo;
    @FXML
    private ImageView logotwo;
    @FXML
    private Button logouttwo;
    @FXML
    private Button profiletwo;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File phototwofile = new File("image/2048px-User_icon_2.svg.png");
        Image phototwoimage = new Image(phototwofile.toURI().toString());
        phototwo.setImage(phototwoimage);
        File logotwofile = new File("image/IMG_20220110_193308.jpg");
        Image logotwoimage = new Image(logotwofile.toURI().toString());
        logotwo.setImage(logotwoimage);

    }
    public void logouttwoonaction(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage window = (Stage) logouttwo.getScene().getWindow();
        window.setScene(new Scene(root, 450, 300));
    }
    public void profiletwoonaction(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("profile2.fxml"));
        Stage window = (Stage) profiletwo.getScene().getWindow();
        window.setScene(new Scene(root, 450, 300));
        window.setTitle("profile information page");
    }

}

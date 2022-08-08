package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class PateintProfileController implements Initializable {

    @FXML
    private ImageView pateintimage;
    private File PdFile;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        File PFile=new File("C:\\Users\\ASUS\\Desktop\\HMIS\\image\\27705-200.png");
        Image PImage=new Image(PdFile.toURI().toString());
        pateintimage.setImage(PImage);
    }

    public void fixonaction(ActionEvent actionEvent) {
        fixappointment();
    }

    private void fixappointment() {
        try{


            Stage primaryStage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(RegisterController.class.getResource("appointment.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),600,600);
            primaryStage.setTitle("Appointment");
            primaryStage.setScene(scene);
            primaryStage.show();

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();

        }

    }
}

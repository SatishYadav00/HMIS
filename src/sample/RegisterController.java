package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;



public class RegisterController implements Initializable{
    @FXML
    private ImageView shieldImageView;
    @FXML
    private Button closeButton;
    @FXML
    private Button sumbit;
    @FXML
    private Label registrationmessagelabel;


    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        File shieldFile=new File("C:\\Users\\ASUS\\Desktop\\HMIS\\image\\WhatsApp Image 2022-01-12 at 3.56.24 PM.jpeg");
        Image shieldImage=new Image(shieldFile.toURI().toString());
        shieldImageView.setImage(shieldImage);
    }




    public void closeonaction(javafx.event.ActionEvent actionEvent) {
        Stage stage =(Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    public void submitonaction(ActionEvent actionEvent) {
        registrationmessagelabel.setText("You registered successfully!");
         pateintprofile();
    }

    public void pateintprofile() {
        try{

            Stage primaryStage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(RegisterController.class.getResource("pateintProfile.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),600,600);
            primaryStage.setTitle("Patient Profile");
            primaryStage.setScene(scene);
            primaryStage.show();

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();

        }

    }



}

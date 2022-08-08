package sample.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

//import static javafx.fxml.FXMLLoader.load;

public class HelloController implements Initializable {
    @FXML
    private Button loginButton;
    @FXML
    private Button cancelButton;
    @FXML
    private Label loginLabel;
    @FXML
    private ImageView bigimageview;
    @FXML
    private ImageView smallimageview;
    @FXML
    private TextField usernameText;
    @FXML
    private TextField passwordText;
    @FXML
    private Button forgot;



    public HelloController() {
    }

    @Override
    public void initialize(URL url , ResourceBundle resourceBundle){
        File bigfile = new File("image/61s3uG2iFkL._SL1016_.jpg");
        Image bigimage = new Image(bigfile.toURI().toString());
        bigimageview.setImage(bigimage);

        File smallfile = new File("image/safety-password-lock-security-symbol-protection-privacy-icon-business-sign-web-internet-concept-secure-padlock-access-computer-159851851.jpg");
        Image smallimage = new Image(smallfile.toURI().toString());
        smallimageview.setImage(smallimage);
    }

    public void loginButtonAction(ActionEvent event) {
        if(usernameText.getText().isBlank() || passwordText.getText().isBlank()){
            loginLabel.setText("Please enter username and password !");
        }
        else if(usernameText.getText().equals("satish1") && passwordText.getText().equals("1111")){
            createone();

        }
        else if(usernameText.getText().equals("sudip2") && passwordText.getText().equals("2222")){
            createtwo();

        }else if(usernameText.getText().equals("sayuj3") && passwordText.getText().equals("3333")) {
            createthree();

        }
        else if(usernameText.getText().equals("rahul4") && passwordText.getText().equals("4444")){
            createfour();
        }
        else{
            loginLabel.setText("Please enter correct username and password !");
        }



}
    public void cancelButtonAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();


    }
    public void forgotonaction(ActionEvent event) throws  Exception{
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Pannel");
        alert.setContentText("Press 'OK' to go back to the login page.");
        alert.setHeaderText("Please contact to the administrator.");
        alert.showAndWait();
    }
    public void createone(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("login1.fxml"));
            Stage window =(Stage) loginButton.getScene().getWindow();
            window.setScene(new Scene(root,450,300));
            window.setTitle("home page");

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();

        }
    }

    public void createtwo(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("login2.fxml"));
            Stage window =(Stage) loginButton.getScene().getWindow();
            window.setScene(new Scene(root,450,300));
            window.setTitle("home page");

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();

        }

    }
    public void createthree(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("login3.fxml"));
            Stage window =(Stage) loginButton.getScene().getWindow();
            window.setScene(new Scene(root,450,300));
            window.setTitle("home page");

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();

        }

    }
    public void createfour(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("login4.fxml"));
            Stage window =(Stage) loginButton.getScene().getWindow();
            window.setScene(new Scene(root,450,300));
            window.setTitle("home page");

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();

        }

    }



    }




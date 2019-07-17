package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML public TextField username;
    @FXML public PasswordField password;
    @FXML public Button login;
    @FXML public Label loginmessage;

   

    public void connecter(ActionEvent event) throws IOException
    {
        String u="admin";
        String p="admin123";
        if (!p.equals(password.getText()) || !u.equals(username.getText())){ loginmessage.setText("Nom d'utilisateur ou mot de passe éronnés.");}
        else {loginmessage.setText("");
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("AcceuilFormateur.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();}
    }


    public void initialize(URL url, ResourceBundle rb) {

        username.setText("");
        password.setText("");
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.project;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


/**
 *
 * @author ok
 */
public class loginController implements Initializable {
    @FXML
    Label r;
    @FXML
    private ImageView loading;

    @FXML
    private TextField t1;
    @FXML
    private PasswordField t2;
    private java.sql.Statement stat;

    @FXML
    public void reg(ActionEvent event){
        try {
            Node p=(Node) event.getSource();
            Stage p1=(Stage) p.getScene().getWindow();
            p1.close();
            Stage st=new Stage();
            Parent pr = FXMLLoader.load(getClass().getResource("Register.fxml"));
            Scene scene = new Scene(pr);
            st.setScene(scene);
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(loginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void Login(ActionEvent event) throws IOException, SQLException {

        String username=t1.getText();
        String pass1=t2.getText();
        DataBase o=new DataBase();
        if(o.Login(username, pass1)){
            Node p=(Node) event.getSource();
           Stage p1=(Stage) p.getScene().getWindow();
           p1.close();
        Stage st=new Stage();
        Parent pr = FXMLLoader.load(getClass().getResource("HomeFXML.fxml"));
        Scene scene = new Scene(pr);
        st.setScene(scene);
        st.show();
        }else
        {
             JOptionPane.showMessageDialog(null, "UserName Or Passworrd Is InCorrect");
             t1.setText("");             t2.setText("");
             t1.requestFocus();

        }
    }
   @FXML
private void handleButtonAction(ActionEvent event) {
    try {
        // close current
        Node p=(Node) event.getSource();
        Stage p1=(Stage) p.getScene().getWindow();
        p1.close();
        // open new
        Stage st=new Stage();
        Parent pr = FXMLLoader.load(getClass().getResource("forgotpassword.fxml"));
        Scene scene = new Scene(pr);
        st.setScene(scene);
        st.setTitle("forgot password Page");
        st.show();
    } catch (IOException ex) {
        Logger.getLogger(HomeFXMLController.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    @FXML
    public void handleButton1Action(ActionEvent ev){
        t1.setText(""); t2.setText("");   t1.requestFocus();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}

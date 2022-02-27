/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.project;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class RegisterController implements Initializable {

    @FXML
    TextField ur, pr,p;
    Connection con;
    ConDataBase oC = new ConDataBase();

    @FXML
    public void insert(ActionEvent event) {
        String name = ur.getText();
        String password = pr.getText();
        String phone=p.getText();
        String sql ="insert  into userdata values (" + " '"+name + "', '" +password +"', '" +phone+"')";
        try {
            con = oC.open();
            Statement stat = con.createStatement();
            stat.executeUpdate(sql);

            con.close();
            JOptionPane.showMessageDialog(null, "User Added");
            try {
                // close current
                Node p = (Node) event.getSource();
                Stage p1 = (Stage) p.getScene().getWindow();
                p1.close();
                // open new
                Stage st = new Stage();
                Parent pr = FXMLLoader.load(getClass().getResource("FXMLDocument_login.fxml"));
                Scene scene = new Scene(pr);
                st.setScene(scene);
                st.setTitle("Login Page");
                st.show();
            } catch (IOException ex) {
                Logger.getLogger(HomeFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ");
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

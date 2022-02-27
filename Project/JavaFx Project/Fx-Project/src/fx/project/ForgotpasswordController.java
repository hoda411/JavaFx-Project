/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.project;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
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

public class ForgotpasswordController implements Initializable {

    @FXML
    TextField ui,ne,pl;
      Connection con;
 ConDataBase oC = new ConDataBase();
public void check(){
 String un = ui.getText();
 String pn =pl.getText();
        //String sql ="select * from userdate where username = '"+un+"' "+"and phone = '"+pn+"' ";
    String sql="select * from userdata where  username = '"+un+"'"+"and phone = '"+pn+"'";
        ResultSet obj ;
        String pass="";

        try {
            con = oC.open();
            Statement stat = con.createStatement();
            obj=stat.executeQuery(sql);

            obj.toString();

            while(obj.next()){
               pass=obj.getString(2);

            }
            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ");

        }



        if(pass=="")   {
            JOptionPane.showMessageDialog(null, "User Is Not Found");
            ne.setDisable(true);
            ui.setText("");pl.setText("");
        }
        else{


            ne.setDisable(false);  ne.setText(pass);
        }
      // ne.setDisable(false);

}

@FXML
private void handleButton2Action(ActionEvent event) {
    try {
        // close current
        Node p=(Node) event.getSource();
        Stage p1=(Stage) p.getScene().getWindow();
        p1.close();
        // open new
        Stage st=new Stage();
        Parent pr = FXMLLoader.load(getClass().getResource("FXMLDocument_login.fxml"));
        Scene scene = new Scene(pr);
        st.setScene(scene);
        st.setTitle("Home Page");
        st.show();
    } catch (IOException ex) {
        Logger.getLogger(HomeFXMLController.class.getName()).log(Level.SEVERE, null, ex);
    }
}


    @Override
    public void initialize(URL url, ResourceBundle rb) {
      ne.setDisable(true);
    }

}

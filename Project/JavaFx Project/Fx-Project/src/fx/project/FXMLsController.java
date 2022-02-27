/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.project;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author ok
 */
public class FXMLsController implements Initializable {
@FXML

    TextField s1,s2,s3,s4,s5,s6;

  Connection con;
 ConDataBase oC = new ConDataBase();

 @FXML
 public void insert() throws SQLException {
     String sub1=s1.getText();
           String sub2=s2.getText();
     String sub3=s3.getText();
     String sub4=s4.getText();
     String sub5=s5.getText();
     String sub6=s6.getText();
String sql ="insert into stu_score values ("+" '"+sub1 +"', '"+sub2+"', '"+sub3+"', '"+sub4+"', '"+sub5+"', '"+sub6+"')";

        try{
        con=oC.open();
        Statement stat=con.createStatement();
        stat.executeUpdate(sql);

        con.close();
            JOptionPane.showMessageDialog(null,"These Data Inserted successfully");
        }
         catch(SQLException ex){
              JOptionPane.showMessageDialog(null,"Error");
         }
     s1.setText(""); s2.setText(""); s3.setText(""); s4.setText(""); s5.setText("");s6.setText("");
 }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

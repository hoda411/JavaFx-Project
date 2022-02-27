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
public class SuscoreFXMLController implements Initializable {
  @FXML

    TextField s1,s2,s3,s4,s5,s6,g1,g2,g3,g4,g5,g6;
    Connection con;
 ConDataBase oC = new ConDataBase();


     String su1=s1.getText();
         String su2=s2.getText();
           String su3=s3.getText();
         String su4=s4.getText();
         String su5=s5.getText();
         String su6=s6.getText();

         int gr1=Integer.parseInt(g1.getText());
         String gr2=g2.getText();
         String gr3=g3.getText();
         String gr4=g4.getText();
         String gr5=g5.getText();
         String gr6=g6.getText();

    @FXML
 public void insert() throws SQLException {


        String sql ="insert into stu_score values ("+" '"+su1 +"', '"+su2+"', '"+su3+"', '"+su4+"', '"+su5+"', '"+su6+"')";

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


    }

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

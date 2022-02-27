/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.project;

/**
 *
 * @author LEGION
 */
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
public class DataBase {
    private Statement stat;
    ConDataBase con=new ConDataBase();
    private String admin;
    
    public boolean Login(String username, String pass1) throws IOException, SQLException {
        con.open();
        stat=con.open().createStatement();
        String sc = "select * from userdata where " + "username='" + username + "' and " + "password='" + pass1 + "'";
        ResultSet res = stat.executeQuery(sc);
        if(res.next()) {
            con.close();
            return true;
        }else{
            con.close();
            return false;
        }
    }
    public String getType() throws SQLException{
        con.open();
        stat=con.open().createStatement();
        String sc = "select * from userdate";
        ResultSet res = stat.executeQuery(sc);
        if(res.next()) {
           
            String s = res.getString(5);
            System.out.println(s);
            con.close();
            return s;
        }else{
            con.close();
           return null;
        }
     
    }
    
}

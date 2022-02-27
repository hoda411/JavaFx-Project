/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConDataBase {
  Connection con;
 String url="jdbc:mysql://localhost:3306/fxproject";
    private String user = "root";
    private String pass = "";
    private Connection connection;

    public Connection open(){
     try{
     Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
       return con;
     } catch (Exception ex) {
            ex.printStackTrace();
        return con;
        }
}
 public void close() throws SQLException{
 con.close();
 }

    public Connection getConnection() throws SQLException {
        connection = DriverManager.getConnection(url,user,pass);
        return connection;
    }
}


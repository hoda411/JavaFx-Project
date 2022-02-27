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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


/**
 *
 * @author ShetAwy
 */
public class GpaController implements Initializable {
@FXML
TextField n,idd,id1,dp,l1,gp,st;

 @FXML
    private TableView<gpatable> TableviewGpa;
    @FXML
    private TableColumn<gpatable, String> GPA;
    @FXML
    private TableColumn<gpatable, String> IDgap;


  ObservableList<gpatable> data;

    private ConDataBase database = new ConDataBase();
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    private ObservableList getDataFromSqlAndAddToObservableList(String query){
        ObservableList< gpatable > tableDataData = FXCollections.observableArrayList();
        try {

            connection = database.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                tableDataData.add(new gpatable(resultSet.getString( "gpa" ), resultSet.getString( "id" )));
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableDataData;

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        n.setDisable(true); id1.setDisable(true); l1.setDisable(true);
        dp.setDisable(true);gp.setDisable(true); st.setDisable(true);
        bt1.setDisable(true);

        GPA.setCellValueFactory(new PropertyValueFactory< gpatable, String>("studentGpa"));
        IDgap.setCellValueFactory(new PropertyValueFactory< gpatable, String>("studentId"));



        TableviewGpa.setItems(getDataFromSqlAndAddToObservableList("SELECT * FROM gpa;"));


    }


    @FXML
Button bt1;
@FXML
private void handleButton2Action(ActionEvent event) {
    try {
        // close current
        Node p=(Node) event.getSource();
        Stage p1=(Stage) p.getScene().getWindow();
        p1.close();
        // open new
        Stage st=new Stage();
        Parent pr = FXMLLoader.load(getClass().getResource("HomeFXML.fxml"));
        Scene scene = new Scene(pr);
        st.setScene(scene);
        st.setTitle("Home Page");
        st.show();
    } catch (IOException ex) {
        Logger.getLogger(HomeFXMLController.class.getName()).log(Level.SEVERE, null, ex);
    }
}
   Connection con;
 ConDataBase oC = new ConDataBase();

 @FXML
public void ac (ActionEvent event) throws SQLException, IOException {
     int idx = Integer.parseInt(idd.getText());


     String sqlgp ="select * from gpa where id = "+idx;
     ResultSet obj2 ;

     String gpa="";

     try {
         con = oC.open();
         Statement stat2 = con.createStatement();
         obj2=stat2.executeQuery(sqlgp);

         obj2.toString();

         while(obj2.next()){

             gpa=obj2.getString(2);

         }
         gp.setDisable(false); st.setDisable(false);
           gp.setText(gpa);


            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Student Is Not Found");

        }
     if(Double.parseDouble(gp.getText())>=3.7)st.setText("A");
     else if(Double.parseDouble(gp.getText())>=3.0&&Double.parseDouble(gp.getText())<3.7)
         st.setText("B");
     else if(Double.parseDouble(gp.getText())>=2.4&&Double.parseDouble(gp.getText())<3.0)
         st.setText("C");
     else
         st.setText("D");


}

@FXML
private void okAction(ActionEvent event) {
    n.setText("");idd.setText("");id1.setText("");l1.setText("");
    dp.setText(""); gp.setText(""); st.setText("");
      n.setDisable(true); id1.setDisable(true); l1.setDisable(true);
        dp.setDisable(true);gp.setDisable(true); st.setDisable(true);bt1.setDisable(true);
}
@FXML
public void calc (ActionEvent event) throws SQLException, IOException {

  int idx = Integer.parseInt(idd.getText());

        String sql ="select * from student where id = "+idx;
        ResultSet obj ;
        String idg="";
        String nm="";
        String lev="";
        String dept="";
        String levl="";
        try {
            con = oC.open();
            Statement stat = con.createStatement();
            obj=stat.executeQuery(sql);

            obj.toString();

            while(obj.next()){
                idg=obj.getString(1);
                nm=obj.getString(2);
              dept=obj.getString(6);
               levl= obj.getString(7);
            }
             n.setDisable(false); id1.setDisable(false); l1.setDisable(false);
        dp.setDisable(false); bt1.setDisable(false);
            id1.setText(idg);
            n.setText(nm);
            dp.setText(dept);
         l1.setText(levl);
            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Student Is Not Found");

        }
 if(nm=="") {
     JOptionPane.showMessageDialog(null, "Error Student Is Not Found");
     idd.setText("");
         n.setDisable(true); id1.setDisable(true); l1.setDisable(true);
        dp.setDisable(true);gp.setDisable(true); st.setDisable(true);
        bt1.setDisable(true);
 }
}
}
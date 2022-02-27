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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.swing.*;


/**
 *
 * @author ok
 */
public class ReportController implements Initializable {


    @FXML
    private TableColumn<ReportShow, String> ReportGrades;

    @FXML
    private TableColumn<ReportShow, String> ReportLevel;

    @FXML
    private TableColumn<ReportShow, String> ReportSub;
    @FXML
    private TableColumn<ReportShow, String> ReportstuName;
    @FXML
    private TableColumn<ReportShow, String> Reportid;
    @FXML
    private TableColumn<ReportShow, String> ReportDepartment;

    @FXML
    private TableView<ReportShow> ReportTable;


    @FXML
    Connection con;
    ConDataBase oC = new ConDataBase();

    private ConDataBase database = new ConDataBase();
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    @FXML
    public void delete() throws SQLException {
        String sql="DELETE FROM `testmax` WHERE s IN('soft1','os1','DataBase1','Ai1','math2','physics')";

        try {
            con = oC.open();
            Statement stat = con.createStatement();
            stat.executeUpdate(sql);

            con.close();
           // JOptionPane.showMessageDialog(null, "These Data deleted successfully");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Duplicated Id");
        }
    }


    @FXML
    private void setRefreshAutoClick(){

        ReportTable.setItems(getDataFromSqlAndAddToObservableList("SELECT s.id,s.name,s.level,s.dpartment, t.m, t.s FROM student s INNER JOIN testmax t ON s.id=t.i;"));//sql Query
      //  adminTFSearch.clear();
    }

    private ObservableList getDataFromSqlAndAddToObservableList(String query){
        ObservableList< ReportShow > tableDataData = FXCollections.observableArrayList();
        try {

            connection = database.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                tableDataData.add(new ReportShow(resultSet.getString( "id" ), resultSet.getString( "name" ),resultSet.getString( "level" ),resultSet.getString( "dpartment" ),

                        resultSet.getString( "s" ) ,

                        resultSet.getString( "m" )) );
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch ( SQLException e) {
            e.printStackTrace();
        }
        return tableDataData;

    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ReportSub.setCellValueFactory(new PropertyValueFactory< ReportShow, String>("ReportSubName"));
        ReportLevel.setCellValueFactory(new PropertyValueFactory< ReportShow, String>("ReportLevels"));
        ReportGrades.setCellValueFactory(new PropertyValueFactory< ReportShow, String>("ReporGrades"));
        ReportstuName.setCellValueFactory(new PropertyValueFactory< ReportShow, String>("ReportstudentName"));
        Reportid.setCellValueFactory(new PropertyValueFactory< ReportShow, String>("StudentID"));
        ReportDepartment.setCellValueFactory(new PropertyValueFactory< ReportShow, String>("Studentdepartment"));



        ReportTable.setItems(getDataFromSqlAndAddToObservableList("SELECT s.id,s.name,s.level,s.dpartment, t.m, t.s FROM student s INNER JOIN testmax t ON s.id=t.i;"));

    }

@FXML
public void testmaxG() throws SQLException {
        delete();

    String su1="math2",su2="Ai1",su3="DataBase1",su4="physics",su5="os1",su6="soft1";

    String sql1="select max(grade) from grade where subject= 'math2'";

    ResultSet obj1;
    String s1="";
    try {
        con = oC.open();
        Statement stat = con.createStatement();
        obj1 = stat.executeQuery(sql1);

        obj1.toString();

        while (obj1.next()) {
            s1 = obj1.getString(1);

        }

        con.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error Student Is Not Found");

    }

    //2
   // String su1="math2",sub2="Ai1",su3="math2",sub4="Ai1",su5="math2",sub6="Ai1";

    String sql2="select max(grade) from grade where subject= 'Ai1'";

    ResultSet obj2;
    String s2="";
    try {
        con = oC.open();
        Statement stat = con.createStatement();
        obj2 = stat.executeQuery(sql2);

        obj2.toString();

        while (obj2.next()) {
            s2 = obj2.getString(1);

        }

        con.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error Student Is Not Found");

    }
    //3
   // String su1="math2",sub2="Ai1",su3="math2",sub4="Ai1",su5="math2",sub6="Ai1";

    String sql3="select max(grade) from grade where subject= 'DataBase1'";

    ResultSet obj3;
    String s3="";
    try {
        con = oC.open();
        Statement stat = con.createStatement();
        obj3 = stat.executeQuery(sql3);

        obj3.toString();

        while (obj3.next()) {
            s3 = obj3.getString(1);

        }

        con.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error Student Is Not Found");

    }
    //4
  //  String su1="math2",sub2="Ai1",su3="math2",sub4="Ai1",su5="math2",sub6="Ai1";
    String sql4="select max(grade) from grade where subject= 'physics'";

    ResultSet obj4;
    String s4="";
    try {
        con = oC.open();
        Statement stat = con.createStatement();
        obj4 = stat.executeQuery(sql4);

        obj4.toString();

        while (obj4.next()) {
            s4 = obj4.getString(1);

        }

        con.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error Student Is Not Found");

    }
    //5
    //String su1="math2",sub2="Ai1",su3="math2",sub4="Ai1",su5="math2",sub6="Ai1";
    String sql5="select max(grade) from grade where subject= 'os1'";

    ResultSet obj5;
    String s5="";
    try {
        con = oC.open();
        Statement stat = con.createStatement();
        obj5 = stat.executeQuery(sql5);

        obj5.toString();

        while (obj5.next()) {
            s5 = obj5.getString(1);

        }

        con.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error Student Is Not Found");

    }
    //6
   // String su1="math2",sub2="Ai1",su3="math2",sub4="Ai1",su5="math2",sub6="Ai1";
    String sq6="select max(grade) from grade where subject= 'soft1'";

    ResultSet obj6;
    String s6="";
    try {
        con = oC.open();
        Statement stat = con.createStatement();
        obj6 = stat.executeQuery(sq6);

        obj6.toString();

        while (obj6.next()) {
            s6 = obj6.getString(1);

        }

        con.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error Student Is Not Found");

    }




        /* 8888888999999999999999999999999999999999999999999999999999999999999*/



    String i1="",i2="",i3="",i4="",i5="",i6="";

    String sqli1 ="select * from grade where grade = '"+s1+"'";
    ResultSet obji1 ;
    try {
        con = oC.open();
        Statement stat2 = con.createStatement();
        obji1=stat2.executeQuery(sqli1);

        obji1.toString();

        while(obji1.next()){

            i1=obji1.getString(1);

        }

        con.close();
       // JOptionPane.showMessageDialog(null, i1);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error Student Is Not Found");

    }
  //  String i1="",i2="",i3="",i4="",i5="",i6="";

    String sqli2 ="select * from grade where grade = '"+s2+"'";
    ResultSet obji2 ;
    try {
        con = oC.open();
        Statement stat2 = con.createStatement();
        obji2=stat2.executeQuery(sqli2);

        obji2.toString();

        while(obji2.next()){

            i2=obji2.getString(1);

        }

        con.close();
       // JOptionPane.showMessageDialog(null, i1);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error Student Is Not Found");

    }
    //String i1="",i2="",i3="",i4="",i5="",i6="";

    String sqli3 ="select * from grade where grade = '"+s3+"'";
    ResultSet obji3;
    try {
        con = oC.open();
        Statement stat2 = con.createStatement();
        obji3=stat2.executeQuery(sqli3);

        obji3.toString();

        while(obji3.next()){

            i3=obji3.getString(1);

        }

        con.close();
       // JOptionPane.showMessageDialog(null, i1);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error Student Is Not Found");

    }
   // String i1="",i2="",i3="",i4="",i5="",i6="";

    String sqli4 ="select * from grade where grade = '"+s4+"'";
    ResultSet obji4 ;
    try {
        con = oC.open();
        Statement stat2 = con.createStatement();
        obji4=stat2.executeQuery(sqli4);

        obji4.toString();

        while(obji4.next()){

            i4=obji4.getString(1);

        }

        con.close();
       // JOptionPane.showMessageDialog(null, i1);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog( null , "Error Student Is Not Found" );

    }
   // String i1="",i2="",i3="",i4="",i5="",i6="";

    String sqli5 ="select * from grade where grade = '"+s5+"'";
    ResultSet obji5 ;
    try {
        con = oC.open();
        Statement stat2 = con.createStatement();
        obji5=stat2.executeQuery(sqli5);

        obji5.toString();

        while(obji5.next()){

            i5=obji5.getString(1);

        }

        con.close();
      //  JOptionPane.showMessageDialog(null, i1);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error Student Is Not Found");

    }
   // String i1="",i2="",i3="",i4="",i5="",i6="";

    String sqli6 ="select * from grade where grade = '"+s6+"'";
    ResultSet obji6 ;
    try {
        con = oC.open();
        Statement stat2 = con.createStatement();
        obji6=stat2.executeQuery(sqli6);

        obji6.toString();

        while(obji6.next()){

            i6=obji6.getString(1);

        }

        con.close();
       // JOptionPane.showMessageDialog(null, i1);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error Student Is Not Found");

    }




    /*fghjhgfASDFGHJKHFDSASGLJHGFDSDFGH*/
    String sqlm ="insert into testmax values ("+" '"+s1 +"', '"+su1+"', '"+i1+"')";

    try{
        con=oC.open();
        Statement stat=con.createStatement();
        stat.executeUpdate(sqlm);

        con.close();


    }
    catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"Error Student Not Found Can't inserted");
    }
//
    String sqlm2 ="insert into testmax values ("+" '"+s2 +"', '"+su2+"', '"+i2+"')";

    try{
        con=oC.open();
        Statement stat=con.createStatement();
        stat.executeUpdate(sqlm2);

        con.close();


    }
    catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"Error Student Not Found Can't inserted");
    }
//
    String sqlm3 ="insert into testmax values ("+" '"+s3 +"', '"+su3+"', '"+i3+"')";

    try{
        con=oC.open();
        Statement stat=con.createStatement();
        stat.executeUpdate(sqlm3);

        con.close();


    }
    catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"Error Student Not Found Can't inserted");
    }


    String sqlm4 ="insert into testmax values ("+" '"+s4 +"', '"+su4+"', '"+i4+"')";

    try{
        con=oC.open();
        Statement stat=con.createStatement();
        stat.executeUpdate(sqlm4);

        con.close();


    }
    catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"Error Student Not Found Can't inserted");
    }
    String sqlm5 ="insert into testmax values ("+" '"+s5 +"', '"+su5+"', '"+i5+"')";

    try{
        con=oC.open();
        Statement stat=con.createStatement();
        stat.executeUpdate(sqlm5);

        con.close();


    }
    catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"Error Student Not Found Can't inserted");
    }

    String sqlm6 ="insert into testmax values ("+" '"+s6 +"', '"+su6+"', '"+i6+"')";

    try{
        con=oC.open();
        Statement stat=con.createStatement();
        stat.executeUpdate(sqlm6);

        con.close();


    }
    catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"Error Student Not Found sheto't inserted");
    }
    setRefreshAutoClick();
    }
    @FXML
private void handleButtonAction3(ActionEvent event) {
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



}

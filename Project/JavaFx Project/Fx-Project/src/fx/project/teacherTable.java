package fx.project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class teacherTable implements Initializable {

    @FXML
    private javafx.scene.control.TableView < teacherData > TableView;
    @FXML
    private TableColumn < teacherData, String> StudentEmail;

    @FXML
    private TableColumn< teacherData, String> StudentName;
    @FXML
    private TableColumn< teacherData, String>  StudentDepartment;

    @FXML
    private TableColumn< teacherData, String> StudentAddress;

    @FXML
    private TableColumn< teacherData, String> StudentID;

    @FXML
    private TableColumn< teacherData, String> StudentPhone;

    @FXML
    private TableColumn< teacherData, String> Studentlevel;

    @FXML
    private TextField adminTFSearch;

    @FXML
    TextField id, Phone, Email, FullAddress, FullName,numLevel ,DepartChe;
    @FXML
    Connection con;
    ConDataBase oC = new ConDataBase();


    /* ****************
     * SearchButtonClick
     * *****************/
    @FXML
    private void setSearchButtonClick(){
        String sqlQuery = "select * FROM teacher where ID  = '"+adminTFSearch.getText()+"';";
        TableView.setItems(getDataFromSqlAndAddToObservableList(sqlQuery));

    }

    /* ****************
     * RefreshButtonClick
     * *****************/
    @FXML
    private void setRefreshAutoClick(){
        TableView.setItems(getDataFromSqlAndAddToObservableList("SELECT * FROM teacher;"));//sql Query
        adminTFSearch.clear();
    }

    //*****************************************************************************************************************************************************//
    //END //
    //*****************************************************************************************************************************************************//


    /* ****************
     * insert Dataview
     * *****************/


    private ConDataBase database = new ConDataBase();
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;



    private ObservableList getDataFromSqlAndAddToObservableList( String query){
        ObservableList< teacherData > tableDataData = FXCollections.observableArrayList();
        try {

            connection = database.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                tableDataData.add(new teacherData(resultSet.getString( "id" ), resultSet.getString( "name" ),

                        resultSet.getString( "email" ),resultSet.getString( "level" ),
                        resultSet.getString( "phone" ),resultSet.getString( "address" ),resultSet.getString( "dpartment" ) ) );
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
    public void initialize( URL location, ResourceBundle resources) {

        StudentName.setCellValueFactory(new PropertyValueFactory < teacherData, String>("StudentName"));
        StudentID.setCellValueFactory(new PropertyValueFactory< teacherData, String>("StudentID"));
        Studentlevel.setCellValueFactory(new PropertyValueFactory< teacherData, String>("StudentLevel"));
        StudentEmail.setCellValueFactory(new PropertyValueFactory< teacherData, String>("StudentEmail"));
        StudentPhone.setCellValueFactory(new PropertyValueFactory< teacherData, String>("StudentPhone"));
        StudentAddress.setCellValueFactory(new PropertyValueFactory< teacherData, String>("StudentAddress"));
        StudentDepartment.setCellValueFactory(new PropertyValueFactory< teacherData, String>("Studentdepartment"));


        TableView.setItems(getDataFromSqlAndAddToObservableList("SELECT * FROM teacher;"));

    }


    //*****************************************************************************************************************************************************//
    //*********************************************************************** END data view   *************************************************************//
    //*****************************************************************************************************************************************************//


    /* ****************
     * insert new data
     * *****************/
    @FXML
    public void insert() throws SQLException {
       String idx = id.getText() ;
        String name = FullName.getText();
        String phone = Phone.getText();
        String email = Email.getText();
        String address = FullAddress.getText();
        String year = numLevel.getText();
        String depart = DepartChe.getText( );

        String sql = "insert into teacher values (" +"'"+ idx + "', '" + name + "', '" + phone + "', '" + address+ "', '" + email + "', '" + depart + "', '"+year +"')";

        try {
            con = oC.open();
            Statement stat = con.createStatement();
            stat.executeUpdate(sql);

            con.close();
            JOptionPane.showMessageDialog(null, "These Data Inserted successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Duplicated Id");
        }
        //Phone,year,FullName,e,address
        id.setText("");
        Phone.setText("");
        numLevel.setText("");
        FullName.setText("");
        Email.setText("");
        FullAddress.setText("");
        DepartChe.setText( "" );
        setRefreshAutoClick();
    }

    //*****************************************************************************************************************************************************//
    //*********************************************************************** END insert   *************************************************************//
    //*****************************************************************************************************************************************************//



    /* ****************
     * clear All data
     * *****************/
    @FXML
    public void clear() {
        id.setText("");
        Phone.setText("");
        numLevel.setText("");
        FullName.setText("");
        Email.setText("");
        FullAddress.setText("");
        DepartChe.setText( "" );
    }


    //*****************************************************************************************************************************************************//
    //*********************************************************************** end clear   *************************************************************//
    //*****************************************************************************************************************************************************//


    @FXML
    private void show( Event event){
        teacherData getSlectRow = TableView.getSelectionModel().getSelectedItem();
        String sqlQuery = "select * FROM teacher where ID = '"+getSlectRow.getStudentID()+"';";
        try {
            connection = database.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQuery);
            while ( resultSet.next() ){
                FullName.setText( resultSet.getString( "name" ) );
                id.setText( resultSet.getString( "id" ) );
                Email.setText( resultSet.getString( "email" ) );
                FullAddress.setText( resultSet.getString( "address" ) );
                Phone.setText( resultSet.getString( "phone" ) );
                numLevel.setText( resultSet.getString( "level" ) );
                DepartChe.setText( resultSet.getString( "dpartment" ) );

            }
        } catch ( SQLException e ) {
            e.printStackTrace( );
        }

    }

    @FXML
    public void updata() throws SQLException {
        int idx = Integer.parseInt( id.getText() );
        String name = FullName.getText();
        String phone = Phone.getText();
        String mail = Email.getText();
        String address = FullAddress.getText();
        String dept = DepartChe.getText();
        String lv = numLevel.getText();

        String sql = "update teacher set "
                + "name='" + name + "', "
                + "phone='" + phone + "', "
                + "address='" + address + "', "
                + "email='" + mail + "', "
                + "dpartment='" + dept + "', "
                + "level='" + lv + "'"+

                " where id=" + idx;
        try {
            con = oC.open();
            Statement stat = con.createStatement();
            stat.executeUpdate(sql);

            con.close();
            JOptionPane.showMessageDialog(null, "These Data updated successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Data Not updated");
        }
        id.setText("");
        Phone.setText("");
        numLevel.setText("");
        FullName.setText("");
        Email.setText("");
        FullAddress.setText("");
        DepartChe.setText( "" );
        setRefreshAutoClick();

    }

    //*****************************************************************************************************************************************************//
    //*********************************************************************** END update data   *************************************************************//
    //*****************************************************************************************************************************************************//





    /* ***************
     * delete data
     *****************/
    @FXML
    public void delete() throws SQLException {
        String idx = adminTFSearch.getText();
        String sql="delete from teacher where id = "+idx;

        try {
            con = oC.open();
            Statement stat = con.createStatement();
            stat.executeUpdate(sql);

            con.close();
            JOptionPane.showMessageDialog(null, "These Data deleted successfully");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Duplicated Id");
        }
        //Phone,year,FullName,e,address
        id.setText("");
        Phone.setText("");
        numLevel.setText("");
        FullName.setText("");
        Email.setText("");
        FullAddress.setText("");
        DepartChe.setText( "" );
        setRefreshAutoClick();
    }
    //*****************************************************************************************************************************************************//
    //*********************************************************************** end delete   *************************************************************//
    //*****************************************************************************************************************************************************//


    @FXML
    private void handleButton2Action( ActionEvent event) {
        try {
            // close current
            Node Phone = (Node) event.getSource();
            Stage p1 = (Stage) Phone.getScene().getWindow();
            p1.close();
            // open new
            Stage st = new Stage();
            Parent pr = FXMLLoader.load(getClass().getResource("HomeFXML.fxml"));
            Scene scene = new Scene(pr);
            st.setScene(scene);
            st.setTitle("Home Page");
            st.show();
        } catch ( IOException ex) {
            Logger.getLogger(HomeFXMLController.class.getName()).log( Level.SEVERE, null, ex);
        }
    }


}

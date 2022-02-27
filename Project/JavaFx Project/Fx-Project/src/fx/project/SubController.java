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
import static java.time.temporal.TemporalAdjusters.previous;
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

/**
 * FXML Controller class
 *
 * @author LEGION
 */public class SubController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    TextField prev1, subject1;

    @FXML
    Connection con;
    ConDataBase oC = new ConDataBase();

    @FXML
    public void show() throws SQLException {
        String name = subject1.getText();
        String previous = "";

        String sql = "select previous from subject where subject ='" + name + "'"; //previous

        ResultSet obj;

        try {
            con = oC.open();
            Statement stat = con.createStatement();

//            previous
            obj = stat.executeQuery(sql);
            obj.toString();

            while (obj.next()) {
                previous = obj.getString(1);
            }

            prev1.setText(previous);

            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");

        }
    }

    //subject2
    @FXML
    TextField prev2, subject2;

    @FXML
    public void show2() throws SQLException {
        String name = subject2.getText();
        String previous = "";

        String sql = "select previous from subject where subject ='" + name + "'"; //previous

        ResultSet obj;

        try {
            con = oC.open();
            Statement stat = con.createStatement();

//            previous
            obj = stat.executeQuery(sql);
            obj.toString();

            while (obj.next()) {
                previous = obj.getString(1);
            }

            prev2.setText(previous);

            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");

        }
    }

    //subject3
    @FXML
    TextField prev3, subject3;

    @FXML
    public void show3() throws SQLException {
        String name = subject3.getText();
        String previous = "";

        String sql = "select previous from subject where subject ='" + name + "'"; //previous

        ResultSet obj;

        try {
            con = oC.open();
            Statement stat = con.createStatement();

//            previous
            obj = stat.executeQuery(sql);
            obj.toString();

            while (obj.next()) {
                previous = obj.getString(1);
            }

            prev3.setText(previous);

            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");

        }
    }

    //subject4
    @FXML
    TextField prev4, subject4;

    @FXML
    public void show4() throws SQLException {
        String name = subject4.getText();
        String previous = "";

        String sql = "select previous from subject where subject ='" + name + "'"; //previous

        ResultSet obj;

        try {
            con = oC.open();
            Statement stat = con.createStatement();

//            previous
            obj = stat.executeQuery(sql);
            obj.toString();

            while (obj.next()) {
                previous = obj.getString(1);
            }

            prev4.setText(previous);

            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");

        }
    }
    //subject2
    @FXML
    TextField prev5, subject5;

    @FXML
    public void show5() throws SQLException {
        String name = subject5.getText();
        String previous = "";

        String sql = "select previous from subject where subject ='" + name + "'"; //previous

        ResultSet obj;

        try {
            con = oC.open();
            Statement stat = con.createStatement();

//            previous
            obj = stat.executeQuery(sql);
            obj.toString();

            while (obj.next()) {
                previous = obj.getString(1);
            }

            prev5.setText(previous);

            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");

        }
    }

    //subject6
    @FXML
    TextField prev6, subject6;

    @FXML
    public void show6() throws SQLException {
        String name = subject6.getText();
        String previous = "";

        String sql = "select previous from subject where subject ='" + name + "'"; //previous

        ResultSet obj;

        try {
            con = oC.open();
            Statement stat = con.createStatement();

//            previous
            obj = stat.executeQuery(sql);
            obj.toString();

            while (obj.next()) {
                previous = obj.getString(1);
            }

            prev6.setText(previous);

            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");

        }
    }

    //grade1
    @FXML
    TextField grade1, id;

    @FXML
    public void show_grade() throws SQLException {
        String name = prev1.getText();
        String id_grade = id.getText();
        String grade = "";

        String sql = "select grade from grade where subject ='" + name + "' AND id='" + id_grade + "'"; //previous

        ResultSet obj;

        try {
            con = oC.open();
            Statement stat = con.createStatement();

//            previous
            obj = stat.executeQuery(sql);

            obj.toString();

            while (obj.next()) {
                grade = obj.getString(1);
            }

            grade1.setText(grade);

            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");

        }
    }

    //grade2
    @FXML
    TextField grade2;

    @FXML
    public void show_grade2() throws SQLException {
        String name = prev2.getText();
        String id_grade = id.getText();
        String grade = "";

        String sql = "select grade from grade where subject ='" + name + "' AND id='" + id_grade + "'"; //previous

        ResultSet obj;

        try {
            con = oC.open();
            Statement stat = con.createStatement();

//            previous
            obj = stat.executeQuery(sql);

            obj.toString();

            while (obj.next()) {
                grade = obj.getString(1);
            }

            grade2.setText(grade);

            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");

        }
    }

    //grade3
    @FXML
    TextField grade3;

    @FXML
    public void show_grade3() throws SQLException {
        String name = prev3.getText();
        String id_grade = id.getText();
        String grade = "";

        String sql = "select grade from grade where subject ='" + name + "' AND id='" + id_grade + "'"; //previous

        ResultSet obj;

        try {
            con = oC.open();
            Statement stat = con.createStatement();

//            previous
            obj = stat.executeQuery(sql);

            obj.toString();

            while (obj.next()) {
                grade = obj.getString(1);
            }

            grade3.setText(grade);

            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");

        }
    }

    //grade4
    @FXML
    TextField grade4;

    @FXML
    public void show_grade4() throws SQLException {
        String name = prev4.getText();
        String id_grade = id.getText();
        String grade = "";

        String sql = "select grade from grade where subject ='" + name + "' AND id='" + id_grade + "'"; //previous

        ResultSet obj;

        try {
            con = oC.open();
            Statement stat = con.createStatement();

//            previous
            obj = stat.executeQuery(sql);

            obj.toString();

            while (obj.next()) {
                grade = obj.getString(1);
            }

            grade4.setText(grade);

            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");

        }
    }

    //grade3
    @FXML
    TextField grade5;

    @FXML
    public void show_grade5() throws SQLException {
        String name = prev5.getText();
        String id_grade = id.getText();
        String grade = "";

        String sql = "select grade from grade where subject ='" + name + "' AND id='" + id_grade + "'"; //previous

        ResultSet obj;

        try {
            con = oC.open();
            Statement stat = con.createStatement();

//            previous
            obj = stat.executeQuery(sql);

            obj.toString();

            while (obj.next()) {
                grade = obj.getString(1);
            }

            grade5.setText(grade);

            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");

        }
    }

    //grade3
    @FXML
    TextField grade6;

    @FXML
    public void show_grade6() throws SQLException {
        String name = prev6.getText();
        String id_grade = id.getText();
        String grade = "";

        String sql = "select grade from grade where subject ='" + name + "' AND id='" + id_grade + "'"; //previous

        ResultSet obj;

        try {
            con = oC.open();
            Statement stat = con.createStatement();

//            previous
            obj = stat.executeQuery(sql);

            obj.toString();

            while (obj.next()) {
                grade = obj.getString(1);
            }

            grade6.setText(grade);

            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");

        }
    }

    //add


    @FXML
    private void handleButton2Action(ActionEvent event) {
        try {
            // close current
            Node p = (Node) event.getSource();
            Stage p1 = (Stage) p.getScene().getWindow();
            p1.close();
            // open new
            Stage st = new Stage();
            Parent pr = FXMLLoader.load(getClass().getResource("HomeFXML.fxml"));
            Scene scene = new Scene(pr);
            st.setScene(scene);
            st.setTitle("Home Page");
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(HomeFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    double x;

    @FXML
    TextField dp,lv,gp,mn;

    @FXML
    public void calc (ActionEvent event) throws SQLException, IOException {

        int idx = Integer.parseInt(id.getText());

        String sql1 ="select id from student where id = "+idx;
        int id=0; ResultSet obj1 ;
        try {
            con = oC.open();
            Statement stat = con.createStatement();
            obj1=stat.executeQuery(sql1);

            obj1.toString();

            while(obj1.next()){

                id=obj1.getInt(1);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Student Is Not Found");

        }
        if(id==idx){


            lv.setDisable(false);dp.setDisable(false);gp.setDisable(false);mn.setDisable(false);


            String sql ="select * from student where id = "+idx;
            ResultSet obj ;

            String dept="";
            String levl="";

            try {
                con = oC.open();
                Statement stat = con.createStatement();
                obj=stat.executeQuery(sql);

                obj.toString();

                while(obj.next()){

                    dept=obj.getString(6);
                    levl= obj.getString(7);

                }

                dp.setText(dept);
                lv.setText(levl);

                con.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error Student Is Not Found");

            }




            String sqlgp ="select * from gpa where id = "+idx;
            ResultSet obj2 ;

            String gpa="";

            try {
                con = oC.open();
                Statement stat2 = con.createStatement();
                obj=stat2.executeQuery(sqlgp);

                obj.toString();

                while(obj.next()){

                    gpa=obj.getString(2);

                }
                gp.setText(gpa);
                x=Double.parseDouble(gpa);
                if(x<=2)mn.setText("3");
                else
                    mn.setText("6");

                con.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error Student Is Not Found");

            }
            if(Double.parseDouble(gpa)<=2){
                subject4.setDisable( true );            subject5.setDisable( true );
                subject6.setDisable( true );      prev4.setDisable( true );  prev5.setDisable( true );
                prev6.setDisable( true );  grade4.setDisable( true );   grade5.setDisable( true );
                grade6.setDisable( true );

            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error Student Is Not Found");


        }



    }

    @FXML
    public void add() throws SQLException {
        String id_sub = id.getText();//
        int max=  Integer.parseInt(mn.getText());
        if(max==6){



            int grad1 = Integer.parseInt(grade1.getText().substring(0, grade1.getText().indexOf("%")));//
            int grad2 = Integer.parseInt(grade2.getText().substring(0, grade2.getText().indexOf("%")));//
            int grad3 = Integer.parseInt(grade3.getText().substring(0, grade3.getText().indexOf("%")));//
            int grad4 = Integer.parseInt(grade4.getText().substring(0, grade4.getText().indexOf("%")));//
            int grad5 = Integer.parseInt(grade5.getText().substring(0, grade5.getText().indexOf("%")));//
            int grad6 = Integer.parseInt(grade6.getText().substring(0, grade6.getText().indexOf("%")));//

            String sub1 = subject1.getText();//
            String sub2 = subject2.getText();//
            String sub3 = subject3.getText();//
            String sub4 = subject4.getText();//
            String sub5 = subject5.getText();//
            String sub6 = subject6.getText();//



            if (grad1 >= 50) {
                if (grad2 >= 50) {
                    if (grad3 >= 50) {
                        if (grad4 >= 50) {
                            if (grad5 >= 50) {
                                if (grad6 >= 50) {
                                    String sql = "insert into cemester2 values (" + id_sub + ", '" + sub1 + "', '" + sub2 + "', '" + sub3 + "', '" + sub4 + "', '" + sub5 + "', '" + sub6 + "')";
                                    try {
                                        con = oC.open();
                                        Statement stat = con.createStatement();
                                        stat.executeUpdate(sql);

                                        con.close();
                                        id.setText("");
                                        subject1.setText("");
                                        subject2.setText("");
                                        subject3.setText("");
                                        subject4.setText("");
                                        subject5.setText("");
                                        subject6.setText("");

                                        prev1.setText("");
                                        prev2.setText("");
                                        prev3.setText("");
                                        prev4.setText("");
                                        prev5.setText("");
                                        prev6.setText("");

                                        grade1.setText("");
                                        grade2.setText("");
                                        grade3.setText("");
                                        grade4.setText("");
                                        grade5.setText("");
                                        grade6.setText("");
                                        JOptionPane.showMessageDialog(null, "These Data Inserted successfully");
                                    } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null, "Error ");
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "you can't add this student , he falid in " + sub6);
                                    sub6 = "";

                                    String sql = "insert into cemester2 values (" + id_sub + ", '" + sub1 + "', '" + sub2 + "', '" + sub3 + "', '" + sub4 + "', '" + sub5 + "', '" + sub6 + "')";
                                    try {
                                        con = oC.open();
                                        Statement stat = con.createStatement();
                                        stat.executeUpdate(sql);

                                        con.close();
                                        id.setText("");
                                        subject1.setText("");
                                        subject2.setText("");
                                        subject3.setText("");
                                        subject4.setText("");
                                        subject5.setText("");
                                        subject6.setText("");

                                        prev1.setText("");
                                        prev2.setText("");
                                        prev3.setText("");
                                        prev4.setText("");
                                        prev5.setText("");
                                        prev6.setText("");

                                        grade1.setText("");
                                        grade2.setText("");
                                        grade3.setText("");
                                        grade4.setText("");
                                        grade5.setText("");
                                        grade6.setText("");
                                        JOptionPane.showMessageDialog(null, "These Data Inserted successfully");
                                    } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null, "Error ");
                                    }

                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "you can't add this student , he falid in " + sub5);
                                sub5 = "";
                                String sql = "insert into cemester2 values (" + id_sub + ", '" + sub1 + "', '" + sub2 + "', '" + sub3 + "', '" + sub4 + "', '" + sub5 + "', '" + sub6 + "')";
                                try {
                                    con = oC.open();
                                    Statement stat = con.createStatement();
                                    stat.executeUpdate(sql);

                                    con.close();
                                    id.setText("");
                                    subject1.setText("");
                                    subject2.setText("");
                                    subject3.setText("");
                                    subject4.setText("");
                                    subject5.setText("");
                                    subject6.setText("");

                                    prev1.setText("");
                                    prev2.setText("");
                                    prev3.setText("");
                                    prev4.setText("");
                                    prev5.setText("");
                                    prev6.setText("");

                                    grade1.setText("");
                                    grade2.setText("");
                                    grade3.setText("");
                                    grade4.setText("");
                                    grade5.setText("");
                                    grade6.setText("");
                                    JOptionPane.showMessageDialog(null, "These Data Inserted successfully");
                                } catch (SQLException ex) {
                                    JOptionPane.showMessageDialog(null, "Error ");
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "you can't add this student , he falid in " + sub4);
                            sub4 = "";
                            String sql = "insert into cemester2 values (" + id_sub + ", '" + sub1 + "', '" + sub2 + "', '" + sub3 + "', '" + sub4 + "', '" + sub5 + "', '" + sub6 + "')";
                            try {
                                con = oC.open();
                                Statement stat = con.createStatement();
                                stat.executeUpdate(sql);

                                con.close();
                                id.setText("");
                                subject1.setText("");
                                subject2.setText("");
                                subject3.setText("");
                                subject4.setText("");
                                subject5.setText("");
                                subject6.setText("");

                                prev1.setText("");
                                prev2.setText("");
                                prev3.setText("");
                                prev4.setText("");
                                prev5.setText("");
                                prev6.setText("");

                                grade1.setText("");
                                grade2.setText("");
                                grade3.setText("");
                                grade4.setText("");
                                grade5.setText("");
                                grade6.setText("");
                                JOptionPane.showMessageDialog(null, "These Data Inserted successfully");
                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(null, "Error ");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "you can't add this student , he falid in " + sub3);
                        sub3 = "";
                        String sql = "insert into cemester2 values (" + id_sub + ", '" + sub1 + "', '" + sub2 + "', '" + sub3 + "', '" + sub4 + "', '" + sub5 + "', '" + sub6 + "')";
                        try {
                            con = oC.open();
                            Statement stat = con.createStatement();
                            stat.executeUpdate(sql);

                            con.close();
                            id.setText("");
                            subject1.setText("");
                            subject2.setText("");
                            subject3.setText("");
                            subject4.setText("");
                            subject5.setText("");
                            subject6.setText("");

                            prev1.setText("");
                            prev2.setText("");
                            prev3.setText("");
                            prev4.setText("");
                            prev5.setText("");
                            prev6.setText("");

                            grade1.setText("");
                            grade2.setText("");
                            grade3.setText("");
                            grade4.setText("");
                            grade5.setText("");
                            grade6.setText("");
                            JOptionPane.showMessageDialog(null, "These Data Inserted successfully");
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "Error ");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "you can't add this student , he falid in " + sub2);
                    sub2 = "";
                    String sql = "insert into cemester2 values (" + id_sub + ", '" + sub1 + "', '" + sub2 + "', '" + sub3 + "', '" + sub4 + "', '" + sub5 + "', '" + sub6 + "')";
                    try {
                        con = oC.open();
                        Statement stat = con.createStatement();
                        stat.executeUpdate(sql);

                        con.close();
                        id.setText("");
                        subject1.setText("");
                        subject2.setText("");
                        subject3.setText("");
                        subject4.setText("");
                        subject5.setText("");
                        subject6.setText("");

                        prev1.setText("");
                        prev2.setText("");
                        prev3.setText("");
                        prev4.setText("");
                        prev5.setText("");
                        prev6.setText("");

                        grade1.setText("");
                        grade2.setText("");
                        grade3.setText("");
                        grade4.setText("");
                        grade5.setText("");
                        grade6.setText("");
                        JOptionPane.showMessageDialog(null, "These Data Inserted successfully");
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error ");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "you can't add this student , he falid in " + sub1);
                sub1 = "";
                String sql = "insert into cemester2 values (" + id_sub + ", '" + sub1 + "', '" + sub2 + "', '" + sub3 + "', '" + sub4 + "', '" + sub5 + "', '" + sub6 + "')";
                try {
                    con = oC.open();
                    Statement stat = con.createStatement();
                    stat.executeUpdate(sql);

                    con.close();
                    id.setText("");
                    subject1.setText("");
                    subject2.setText("");
                    subject3.setText("");
                    subject4.setText("");
                    subject5.setText("");
                    subject6.setText("");

                    prev1.setText("");
                    prev2.setText("");
                    prev3.setText("");
                    prev4.setText("");
                    prev5.setText("");
                    prev6.setText("");

                    grade1.setText("");
                    grade2.setText("");
                    grade3.setText("");
                    grade4.setText("");
                    grade5.setText("");
                    grade6.setText("");
                    JOptionPane.showMessageDialog(null, "These Data Inserted successfully");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error ");
                }
            }}
        else{




            int grad1 = Integer.parseInt(grade1.getText().substring(0, grade1.getText().indexOf("%")));//
            int grad2 = Integer.parseInt(grade2.getText().substring(0, grade2.getText().indexOf("%")));//
            int grad3 = Integer.parseInt(grade3.getText().substring(0, grade3.getText().indexOf("%")));//
            int grad4 = 0;
            int grad5 = 0;
            int grad6 = 0;

            String sub1 = subject1.getText();//
            String sub2 = subject2.getText();//
            String sub3 = subject3.getText();//
            String sub4 = "no";//
            String sub5 ="no";//
            String sub6 = "no";//



            if (grad1 >= 50) {
                if (grad2 >= 50) {
                    if (grad3 >= 50) {
                        if (grad4 ==0) {
                            if (grad5 ==0) {
                                if (grad6 ==0) {
                                    String sql = "insert into cemester2 values (" + id_sub + ", '" + sub1 + "', '" + sub2 + "', '" + sub3 + "', '" + sub4 + "', '" + sub5 + "', '" + sub6 + "')";
                                    try {
                                        con = oC.open();
                                        Statement stat = con.createStatement();
                                        stat.executeUpdate(sql);

                                        con.close();
                                        id.setText("");
                                        subject1.setText("");
                                        subject2.setText("");
                                        subject3.setText("");
                                        subject4.setText("");
                                        subject5.setText("");
                                        subject6.setText("");

                                        prev1.setText("");
                                        prev2.setText("");
                                        prev3.setText("");
                                        prev4.setText("");
                                        prev5.setText("");
                                        prev6.setText("");

                                        grade1.setText("");
                                        grade2.setText("");
                                        grade3.setText("");
                                        grade4.setText("");
                                        grade5.setText("");
                                        grade6.setText("");
                                        JOptionPane.showMessageDialog(null, "These Data Inserted successfully");
                                    } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null, "Error ");
                                    }

                                }
                            } }
                    } else {
                        JOptionPane.showMessageDialog(null, "you can't add this student , he falid in " + sub3);
                        sub3 = "";
                        String sql = "insert into cemester2 values (" + id_sub + ", '" + sub1 + "', '" + sub2 + "', '" + sub3 + "', '" + sub4 + "', '" + sub5 + "', '" + sub6 + "')";
                        try {
                            con = oC.open();
                            Statement stat = con.createStatement();
                            stat.executeUpdate(sql);

                            con.close();
                            id.setText("");
                            subject1.setText("");
                            subject2.setText("");
                            subject3.setText("");
                            subject4.setText("");
                            subject5.setText("");
                            subject6.setText("");

                            prev1.setText("");
                            prev2.setText("");
                            prev3.setText("");
                            prev4.setText("");
                            prev5.setText("");
                            prev6.setText("");

                            grade1.setText("");
                            grade2.setText("");
                            grade3.setText("");
                            grade4.setText("");
                            grade5.setText("");
                            grade6.setText("");
                            JOptionPane.showMessageDialog(null, "These Data Inserted successfully");
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "Error ");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "you can't add this student , he falid in " + sub2);
                    sub2 = "";
                    String sql = "insert into cemester2 values (" + id_sub + ", '" + sub1 + "', '" + sub2 + "', '" + sub3 + "', '" + sub4 + "', '" + sub5 + "', '" + sub6 + "')";
                    try {
                        con = oC.open();
                        Statement stat = con.createStatement();
                        stat.executeUpdate(sql);

                        con.close();
                        id.setText("");
                        subject1.setText("");
                        subject2.setText("");
                        subject3.setText("");
                        subject4.setText("");
                        subject5.setText("");
                        subject6.setText("");

                        prev1.setText("");
                        prev2.setText("");
                        prev3.setText("");
                        prev4.setText("");
                        prev5.setText("");
                        prev6.setText("");

                        grade1.setText("");
                        grade2.setText("");
                        grade3.setText("");
                        grade4.setText("");
                        grade5.setText("");
                        grade6.setText("");
                        JOptionPane.showMessageDialog(null, "These Data Inserted successfully");
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error ");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "you can't add this student , he falid in " + sub1);
                sub1 = "";
                String sql = "insert into cemester2 values (" + id_sub + ", '" + sub1 + "', '" + sub2 + "', '" + sub3 + "', '" + sub4 + "', '" + sub5 + "', '" + sub6 + "')";
                try {
                    con = oC.open();
                    Statement stat = con.createStatement();
                    stat.executeUpdate(sql);

                    con.close();
                    id.setText("");
                    subject1.setText("");
                    subject2.setText("");
                    subject3.setText("");
                    subject4.setText("");
                    subject5.setText("");
                    subject6.setText("");

                    prev1.setText("");
                    prev2.setText("");
                    prev3.setText("");
                    prev4.setText("");
                    prev5.setText("");
                    prev6.setText("");

                    grade1.setText("");
                    grade2.setText("");
                    grade3.setText("");
                    grade4.setText("");
                    grade5.setText("");
                    grade6.setText("");
                    JOptionPane.showMessageDialog(null, "These Data Inserted successfully");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error ");
                }
            }}
    }





    @Override
    public void initialize(URL url, ResourceBundle rb) {









    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.project;

import java.io.IOException;
import java.net.URL;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ok
 */
public class HomeFXMLController implements Initializable {
@FXML
private void handleButtonAction(ActionEvent event) {
    try {
        // close current
        Node p=(Node) event.getSource();
        Stage p1=(Stage) p.getScene().getWindow();
        p1.close();
        // open new
        Stage st=new Stage();
        Parent pr = FXMLLoader.load(getClass().getResource("GpaFXML.fxml"));
        Scene scene = new Scene(pr);
        st.setScene(scene);
        st.setTitle("GPA Page");
        st.show();
    } catch (IOException ex) {
        Logger.getLogger(HomeFXMLController.class.getName()).log(Level.SEVERE, null, ex);
    }
}

@FXML
private void handleButtonAction2(ActionEvent event) {
    try {
        // close current
        Node p=(Node) event.getSource();
        Stage p1=(Stage) p.getScene().getWindow();
        p1.close();
        // open new
        Stage st=new Stage();
        Parent pr = FXMLLoader.load(getClass().getResource("subjectFXML.fxml"));
        Scene scene = new Scene(pr);
        st.setScene(scene);
        st.setTitle("Subject Page");
        st.show();
    } catch (IOException ex) {
        Logger.getLogger(HomeFXMLController.class.getName()).log(Level.SEVERE, null, ex);
    }
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
        Parent pr = FXMLLoader.load(getClass().getResource("StudentFXML.fxml"));
        Scene scene = new Scene(pr);
        st.setScene(scene);
        st.setTitle("Subject Page");
        st.show();
    } catch (IOException ex) {
        Logger.getLogger(HomeFXMLController.class.getName()).log(Level.SEVERE, null, ex);
    }
}

@FXML
private void handleButtonAction4(ActionEvent event) {
    try {
        // close current
        Node p=(Node) event.getSource();
        Stage p1=(Stage) p.getScene().getWindow();
        p1.close();
        // open new
        Stage st=new Stage();
        Parent pr = FXMLLoader.load(getClass().getResource("ReportFXML.fxml"));
        Scene scene = new Scene(pr);
        st.setScene(scene);
        st.setTitle("Report Page");
        st.show();
    } catch (IOException ex) {
        Logger.getLogger(HomeFXMLController.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    @FXML
    private void handleButtonAction44(ActionEvent event) {
        try {
            // close current
            Node p=(Node) event.getSource();
            Stage p1=(Stage) p.getScene().getWindow();
            p1.close();
            // open new
            Stage st=new Stage();
            Parent pr = FXMLLoader.load(getClass().getResource("teacherFXML.fxml"));
            Scene scene = new Scene(pr);
            st.setScene(scene);
            st.setTitle("Report Page");
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(HomeFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

@FXML
private void handleButtonAction6(ActionEvent event) {
    try {
        // close current
        Node p=(Node) event.getSource();
        Stage p1=(Stage) p.getScene().getWindow();
        p1.close();
        // open new
        Stage st=new Stage();
        Parent pr = FXMLLoader.load(getClass().getResource("ScoreFXML.fxml"));
        Scene scene = new Scene(pr);
        st.setScene(scene);
        st.setTitle("Score Page");
        st.show();
    } catch (IOException ex) {
        Logger.getLogger(HomeFXMLController.class.getName()).log(Level.SEVERE, null, ex);
    }
}
@FXML
private void handleButtonAction5(ActionEvent event) {

        // close current
        Node p=(Node) event.getSource();
        Stage p1=(Stage) p.getScene().getWindow();
        p1.close();



}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

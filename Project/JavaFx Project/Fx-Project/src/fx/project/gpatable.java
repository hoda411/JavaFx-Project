/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.project;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author ok
 */
public class gpatable {
    private final SimpleStringProperty StudentGpa;
    private final SimpleStringProperty StudentId;

    public gpatable( String studentGpa , String studentId ) {
        this.StudentGpa = new SimpleStringProperty(studentGpa);
        this.StudentId = new SimpleStringProperty(studentId);
    }

    public String getStudentGpa() {
        return StudentGpa.get( );
    }

    public SimpleStringProperty studentGpaProperty() {
        return StudentGpa;
    }

    public void setStudentGpa( String studentGpa ) {
        this.StudentGpa.set( studentGpa );
    }

    public String getStudentId() {
        return StudentId.get( );
    }

    public SimpleStringProperty studentIdProperty() {
        return StudentId;
    }

    public void setStudentId( String studentId ) {
        this.StudentId.set( studentId );
    }
}
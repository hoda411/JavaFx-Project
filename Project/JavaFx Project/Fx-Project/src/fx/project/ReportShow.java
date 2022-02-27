package fx.project;

import javafx.beans.property.SimpleStringProperty;

public class ReportShow {

    private final SimpleStringProperty ReporGrades;
    private final SimpleStringProperty ReportSubName;
    private final SimpleStringProperty ReportLevels;
    private final SimpleStringProperty ReportstudentName;
    private final SimpleStringProperty StudentID;
    private final SimpleStringProperty Studentdepartment;

    public ReportShow( String StudentID , String reportstudentName , String ReportLevels , String  Studentdepartment, String reportSubName , String ReporGrades ) {
        this.ReporGrades = new SimpleStringProperty( ReporGrades );
        this.ReportSubName = new SimpleStringProperty( reportSubName );
        this.ReportLevels = new SimpleStringProperty( ReportLevels );
        this.ReportstudentName = new SimpleStringProperty( reportstudentName );
        this.Studentdepartment = new SimpleStringProperty( Studentdepartment );
        this.StudentID = new SimpleStringProperty( StudentID );
    }

    public String getReporGrades() {
        return ReporGrades.get( );
    }

    public SimpleStringProperty reporGradesProperty() {
        return ReporGrades;
    }

    public void setReporGrades( String reporGrades ) {
        this.ReporGrades.set( reporGrades );
    }

    public String getReportSubName() {
        return ReportSubName.get( );
    }

    public SimpleStringProperty reportSubNameProperty() {
        return ReportSubName;
    }

    public void setReportSubName( String reportSubName ) {
        this.ReportSubName.set( reportSubName );
    }

    public String getReportLevels() {
        return ReportLevels.get( );
    }

    public SimpleStringProperty reportLevelsProperty() {
        return ReportLevels;
    }

    public void setReportLevels( String reportLevels ) {
        this.ReportLevels.set( reportLevels );
    }

    public String getReportstudentName() {
        return ReportstudentName.get( );
    }

    public SimpleStringProperty reportstudentNameProperty() {
        return ReportstudentName;
    }

    public void setReportstudentName( String reportstudentName ) {
        this.ReportstudentName.set( reportstudentName );
    }

    public String getStudentID() {
        return StudentID.get( );
    }

    public SimpleStringProperty StudentIDProperty() {
        return StudentID;
    }

    public void setStudentID( String StudentID ) {
        this.StudentID.set( StudentID );
    }

    public String getStudentdepartment() {
        return Studentdepartment.get( );
    }

    public SimpleStringProperty studentdepartmentProperty() {
        return Studentdepartment;
    }

    public void setStudentdepartment( String studentdepartment ) {
        this.Studentdepartment.set( studentdepartment );
    }
}
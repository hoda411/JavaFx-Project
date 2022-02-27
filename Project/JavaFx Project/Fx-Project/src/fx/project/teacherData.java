package fx.project;

import javafx.beans.property.SimpleStringProperty;

public class teacherData {

    private final SimpleStringProperty StudentName;
    private final SimpleStringProperty StudentID;

    private final SimpleStringProperty StudentLevel;
    private final SimpleStringProperty Studentdepartment;
    private final SimpleStringProperty StudentEmail;
    private final SimpleStringProperty StudentPhone;
    private final SimpleStringProperty StudentAddress;

    public teacherData( String StudentID, String StudentName, String StudentEmail, String StudentLevel, String StudentPhone, String StudentAddress ,String Studentdepartment) {

        this.StudentID = new SimpleStringProperty(StudentID);
        this.StudentName = new SimpleStringProperty(StudentName);
        this.Studentdepartment = new SimpleStringProperty(Studentdepartment);
        this.StudentLevel = new SimpleStringProperty(StudentLevel);

        this.StudentEmail = new SimpleStringProperty(StudentEmail);
        this.StudentPhone = new SimpleStringProperty(StudentPhone);
        this.StudentAddress = new SimpleStringProperty(StudentAddress);
    }

    public String getStudentName() {
        return StudentName.get( );
    }

    public SimpleStringProperty studentNameProperty() {
        return StudentName;
    }

    public void setStudentName( String studentName ) {
        this.StudentName.set( studentName );
    }

    public String getStudentID() {
        return StudentID.get( );
    }

    public SimpleStringProperty studentIDProperty() {
        return StudentID;
    }

    public void setStudentID( String studentID ) {
        this.StudentID.set( studentID );
    }

    public String getStudentLevel() {
        return StudentLevel.get( );
    }

    public SimpleStringProperty studentLevelProperty() {
        return StudentLevel;
    }

    public void setStudentLevel( String studentLevel ) {
        this.StudentLevel.set( studentLevel );
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

    public String getStudentEmail() {
        return StudentEmail.get( );
    }

    public SimpleStringProperty studentEmailProperty() {
        return StudentEmail;
    }

    public void setStudentEmail( String studentEmail ) {
        this.StudentEmail.set( studentEmail );
    }

    public String getStudentPhone() {
        return StudentPhone.get( );
    }

    public SimpleStringProperty studentPhoneProperty() {
        return StudentPhone;
    }

    public void setStudentPhone( String studentPhone ) {
        this.StudentPhone.set( studentPhone );
    }

    public String getStudentAddress() {
        return StudentAddress.get( );
    }

    public SimpleStringProperty studentAddressProperty() {
        return StudentAddress;
    }

    public void setStudentAddress( String studentAddress ) {
        this.StudentAddress.set( studentAddress );
    }
}

package student_Info;

public class Student {
	
    private String studentName;
    private int studentID;
    private String studentDept;
    private int studentAge;
    private float studentCGPA;
    
    // all setter methods;
    public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
    
    public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
    
    public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}
    
    public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
    
    public void setStudentCGPA(float studentCGPA) {
		this.studentCGPA = studentCGPA;
	}
    
    
    // all getter methods;
    public String getStudentName() {
		return studentName;
	}
    
    public int getStudentID() {
		return studentID;
	}
    
    public String getStudentDept() {
		return studentDept;
	}
    
    public int getStudentAge() {
		return studentAge;
	}
    
    public float getStudentCGPA() {
		return studentCGPA;
	}
    
	//constructor
	public Student (String studentName, int studentID, String studentDept, int studentAge, float studentCGPA){
		
		this.studentName = studentName;
		this.studentID = studentID;
		this.studentDept = studentDept;
		this.studentAge = studentAge;
		this.studentCGPA = studentCGPA;
	}

}

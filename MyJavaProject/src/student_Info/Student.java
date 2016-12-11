package student_Info;

import database.DatabaseObject;

import java.util.ArrayList;

public class Student extends DatabaseObject {

	private String studentName;
	private int studentID;
	private String studentDept;
	private int studentAge;
	private float studentCGPA;
	private int studentBatch;
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

	public void studentBatch(int studentBatch) {
		this.studentBatch = studentBatch;
	}


public void setStuden(float studentCGPA) {
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
	
	public int getstudentBatch() {
		return studentBatch;
	}

	// Regular constructor
	public Student(String studentName, int studentID, String studentDept, int studentAge, float studentCGPA, int studentBatch) {

		this.studentName = studentName;
		this.studentID = studentID;
		this.studentDept = studentDept;
		this.studentAge = studentAge;
		this.studentCGPA = studentCGPA;
		this.studentBatch = studentBatch;
	}

	// Loading from database
	public Student() {
	}

	// For store data super is called later because super stores data that is pushed into data array list
	public void storeData(ArrayList<Object> data)
	{
		data.add(studentName);
		data.add(studentID);
		data.add(studentDept);
		data.add(studentAge);
		data.add(studentCGPA);
		data.add(studentBatch);

		super.storeData(data);
	}

	// For load data super is called first, because super reads the file itself
	public void loadData(String[] data)
	{
		studentName = data[0].toString(); // String
		studentID = Integer.parseInt(data[1].toString()); // Int
		studentDept = data[2].toString(); // String
		studentAge = Integer.parseInt(data[3].toString()); // Int
		studentCGPA = Integer.parseInt(data[4].toString()); // Int
		studentBatch = Integer.parseInt(data[5].toString()); // Int
	}
}

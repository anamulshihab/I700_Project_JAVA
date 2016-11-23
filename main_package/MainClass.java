package main_package;

import java.util.ArrayList;
import java.util.Scanner;

import student_Info.Student;

public class MainClass {
	
	static ArrayList<Student> studentArrayList;
	
	 public static void main(String[] args) {
	        
		 studentArrayList = new ArrayList<Student>();
		 
		 MainClass mainClass = new MainClass();
		 
		 System.out.println("Developed By Anamul Hoque Shihab ...\n");
		 
		 Scanner a = new Scanner(System.in);
		 
		 System.out.println("Press 1 to add a Students Info");
		 System.out.println("Press 2 to show Students Info");

		
		int key = a.nextInt();
		 
		// while(1<2)
		 {
		 switch(key)
		 {
		 case 1:
			 mainClass.addStudent();
			 break;
			 
		 case 2:	 
			 mainClass.showStudentInfo();
			 break;
			 
		default:
			System.out.println("PLEASE CHOOSE THE RIGHT KEY ! ");
			break;
		 }
		 
		 }
		 
		
		 
		 
		 
		 
	 }
	 
	 public void addStudent(){
		 
		 Student student;
		 
		 Scanner input=new Scanner(System.in);
		 
		 
		 System.out.println("Enter Student Name: ");
         String studentName =input.nextLine();
         
         
         System.out.println("Enter Student ID: ");
         int studentID =input.nextInt();
         
         
         input.nextLine();
         
         System.out.println("Enter Student Dept: ");
         String studentDept =input.nextLine();
         
         
         System.out.println("Enter Student Age: ");
         int studentAge =input.nextInt();
         
        
         input.nextLine();
         
         System.out.println("Enter Student CGPA: ");
         float studentCGPA =input.nextFloat();
         
         student = new Student(studentName, studentID, studentDept, studentAge, studentCGPA);
		 
         studentArrayList.add(student);
         
	 }

	 public void showStudentInfo(){
		 
		 System.out.println("Studetn Info : ");
		 for(int i=0; i<studentArrayList.size(); i++){
			 
			 System.out.println(""+studentArrayList.get(i).getStudentName()+"\n"+studentArrayList.get(i).getStudentID()
					 +"\n"+studentArrayList.get(i).getStudentDept()+"\n"+studentArrayList.get(i).getStudentAge()+"\n"
					 +studentArrayList.get(i).getStudentCGPA());
			 
		 }
	 }
}

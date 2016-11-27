package main_package;

import java.util.ArrayList;
import java.util.Scanner;

import interfaces.OptionChoser_Interface;
import student_Info.Student;

public class MainClass implements OptionChoser_Interface{
	
	static ArrayList<Student> studentArrayList;
	
	 public static void main(String[] args) {
	        
		 MainClass mainClass = new MainClass();
		 showMyInfo(); // to show my info;
		 
		 studentArrayList = new ArrayList<Student>();
		 
		 
		 int option = mainClass.choseOption();

		 while(option <=4)
		 {
			 switch(option)
			 {
				 case 1:
					 mainClass.addStudent();
					 option = mainClass.choseOption();
					 break;
					 
				 case 2:
					 mainClass.deleteSingleStudent();
					 option = mainClass.choseOption();
					 break;
					 
				 case 3:
					 mainClass.showStudentInfo();
					 option = mainClass.choseOption();
					 break;
					 
				 case 4:
					 mainClass.deleteAllStudentInfo();
					 option = mainClass.choseOption();
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
	 
	 private void deleteSingleStudent(){
		 System.out.print("Enter Student ID: ");
		 Scanner input = new Scanner(System.in);
         int studentID = input.nextInt();
         
	     for(int i=0; i<studentArrayList.size(); i++){
			if(studentArrayList.get(i).getStudentID() == studentID){
				System.out.println("Student ID = "+studentArrayList.get(i).getStudentID()+" Has Successfully Deleted!\n");
				studentArrayList.remove(i);
				
			}
	     }
	     
	 }

	 private void deleteAllStudentInfo(){
		 System.out.print("Do you want to delete all student info: y/n ");
		 
		 Scanner input = new Scanner(System.in);
		 String answer =input.nextLine();
		 
		 if(answer.equals("y")){
			 if(studentArrayList.size() > 0){
				 studentArrayList.clear();
				 System.out.println("Successfully Deleted All Student Info \n");
			 }
		 }
		 else if(answer.equals("n")){
			 //do nothing;
		 }
		 else{
			 System.out.print("Wrong Input!");
		 }
	 }
	 
	 
	 private void showStudentInfo(){
		 
		if(studentArrayList.size() == 0){
			System.out.println("No Studetn Info Available! \n");
		}else{
			 System.out.println("\nAll Student Info : \n");
			 for(int i=0; i<studentArrayList.size(); i++){
				 
				 System.out.println("ID: "+studentArrayList.get(i).getStudentID()+"\t"+"Student Name: "+studentArrayList.get(i).getStudentName()+"\t"
						 +"Dept: "+studentArrayList.get(i).getStudentDept()+"\t"+studentArrayList.get(i).getStudentAge()+"\t"
						 +studentArrayList.get(i).getStudentCGPA());
				 
			 }
		}
	 }
	 
	 
	 
	 
	 
     private static void showMyInfo(){
		 
		 System.out.println("Developed By Anamul Hoque Shihab ...");
	 }

	@Override
	public int choseOption() {
		// TODO Auto-generated method stub
		Scanner makeChooice = new Scanner(System.in);
		 
		 System.out.println("\nPress 1 To Add A New Student");
		 System.out.println("Press 2 To Delete A Student Info");
		 System.out.println("Press 3 To Show Exixting Student Info");
		 System.out.println("Press 4 To Delete All Student Info");
		 
		 System.out.print("Enter Your Option: ");
		 int option = makeChooice.nextInt();
		 
		 return option;
	}
	 

}

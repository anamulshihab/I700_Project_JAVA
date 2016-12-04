package main_package;


/*
 * Student Information System;
 * Created by Anamul Hoque Shihab
 * Cyber Security Student
 * Estonian IT College
 * Email:ashihab@itcollege.ee
 */

import java.util.ArrayList;
import java.util.Scanner;

import interfaces.OptionChoser_Interface; //Importing Interface from Package called interfaces

import student_Info.Student; //Importing Student class from Package called student_info

public class MainClass implements OptionChoser_Interface{
	
	static ArrayList<Student> studentArrayList;
	
	 public static void main(String[] args) {
	        
		 MainClass mainClass = new MainClass();
		 
		 showMyInfo(); // to show my info;
		 
		 studentArrayList = new ArrayList<Student>();
		 
		 
		 
		 int option = mainClass.choseOption(); //Calling choseoption method to Show menu

		 
		 /* A loop and switch to call different functions upon users request */ 
		 do
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
					 
			 } // switch ends
							
		 
		 }while(option!= 0); //do While loop ends
		 
	} // Main Class ends
	 
	 
	 /* This method add a new Student info to the arraylist
	  *
	  */
	 
	 public void addStudent(){
		 
		 Student student;
		 
		 Scanner input = new Scanner(System.in);
		 
		 
		 System.out.println("Enter Student Name: ");
         String studentName = input.nextLine();
         
         
         System.out.println("Enter Student ID: ");
         int studentID = input.nextInt();
         
         
         input.nextLine();
         
         System.out.println("Enter Student Dept: ");
         String studentDept = input.nextLine();
         
         
         System.out.println("Enter Student Age: ");
         int studentAge = input.nextInt();
         
        
         input.nextLine();
         
         System.out.println("Enter Student CGPA: ");
         float studentCGPA = input.nextFloat();
         
         student = new Student(studentName, studentID, studentDept, studentAge, studentCGPA);
		 
         studentArrayList.add(student); //adding values to the ArrayList 
         
  
        
	 } // AddStudent method ends;
	 
	 
	 /* This method Delete a Student info from  the arraylist
	  *
	  */
	 
	 private void deleteSingleStudent(){
		 
		 System.out.print("Enter Student ID: ");
		 
		 Scanner input = new Scanner(System.in);
         int studentID = input.nextInt();
         
	     for(int i=0; i<studentArrayList.size(); i++){
			if(studentArrayList.get(i).getStudentID() == studentID){
				System.out.println("Student ID = "+studentArrayList.get(i).getStudentID()+" Has Successfully Deleted!\n");
				studentArrayList.remove(i);
				
			}//if statement ends;
 
	     } /*For loop to find out the specific student from ArrayList
		  *to delete using Student ID;
		  */
	     
	 }//delete function ends;
	 
	 
	 /* This method Delete all existing Student info from  the arraylist
	  *
	  */
	 
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
		 else if(answer.equals("No data Found to delete!!!")){
			 //do nothing;
		 }
		 else{
			 System.out.print("Wrong Input!");
		 }
		 
	 } //delete all students end;
	 
	 
	 /* This method Show a Student info from  the arraylist;
	  *
	  */
	 
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
	 }//showStudentInfo end;
	 
	 
	 
	 
	//displaying my info ;
	 
     private static void showMyInfo(){
		 
		 System.out.println("Anamul Hoque Shihab \n Batch - C11");
	 }
     
     
     /* This method Display the Menu for the User;
	  * Implementing the methods for the interface called OptionChoser_interface
	  
	  */
	@Override
	public int choseOption() {
		// TODO Auto-generated method stub
		Scanner makeChoice = new Scanner(System.in);
		 
		 System.out.println("\nPress 1 To Add A New Student");
		 System.out.println("Press 2 To Delete A Student Info");
		 System.out.println("Press 3 To Show Exixting Student Info");
		 System.out.println("Press 4 To Delete All Student Info");
		 System.out.println("Press 0 to Exit:  ");
		 
	         
		 System.out.print("Enter Your Option: ");
		 int option = makeChoice.nextInt();
		 
		 return option; 
	}
	
	
	
	 

}

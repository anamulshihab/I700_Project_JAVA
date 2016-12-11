package main_package;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * Student Information System;
 * @Author  Anamul Hoque Shihab
 * @Version 1.0
 * @Date 03/12/2016
 * @Email:ashihab@itcollege.ee
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import interfaces.OptionChoser_Interface; //Importing Interface from Package called interfaces
import student_Info.*; //Importing Student class from Package called student_info

public class MainClass implements OptionChoser_Interface {

	public static ArrayList<Student> studentArrayList;

	public static void main(String[] args) {

		MainClass mainClass = new MainClass();

		showMyInfo(); // to show my info;

		studentArrayList = new ArrayList<Student>();
		
		 
		
		int option = mainClass
				.choseOption(); /*
								 * Calling choseoption method to Show menu;
								 * 
								 * A loop and switch to call different
								 * functions upon users request
								 */
		do {

			switch (option) {
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
				
			case 5:
				SubjectTaken.Enrol();
				break;
			
			case 6:	
				SubjectTaken.Subject();
				break;

			} // switch ends

		} while (option != 0); // do While loop ends

	} // Main Class ends

	/*
	 * This method add a new Student info to the arraylist
	 *
	 */

	public void addStudent() {

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
		
		System.out.println("Enter Student batch: ");
		int studentbatch = input.nextInt();
		

		student = new Student(studentName, studentID, studentDept, studentAge, studentCGPA,studentbatch);

		studentArrayList.add(student); // adding values to the ArrayList

	} // AddStudent method ends;

	/*
	 * This method Delete a Student info from the arraylist
	 *
	 */

	private void deleteSingleStudent() {
		showMyInfo();
		System.out.print("Enter Student ID: ");

		Scanner input = new Scanner(System.in);
		int studentID = input.nextInt();

		for (int i = 0; i < studentArrayList.size(); i++) {
			if (studentArrayList.get(i).getStudentID() == studentID) {
				System.out.println(
						"Student ID = " + studentArrayList.get(i).getStudentID() + " Has Successfully Deleted!\n");
				studentArrayList.remove(i);

			} // if statement ends;

		} /*
			 * For loop to find out the specific student from ArrayList to
			 * delete using Student ID;
			 */

	}// delete function ends;

	/*
	 * This method Delete all existing Student info from the arraylist
	 *
	 */

	private void deleteAllStudentInfo() {
		showMyInfo();
		System.out.print("Do you want to delete all student info: y/n ");

		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();

		if (answer.equals("y")) {
			if (studentArrayList.size() > 0) {
				studentArrayList.clear();
				System.out.println("Successfully Deleted All Student Info \n");
			}
		} else if (answer.equals("No data Found to delete!!!")) {
			// do nothing;
		} else {
			System.out.print("Wrong Input!");
		}

	} // delete all students end;

	/*
	 * This method Show a Student info from the arraylist;
	 *
	 */

	private void showStudentInfo() {
		showMyInfo();
		if (studentArrayList.size() == 0) {
			System.out.println("No Studetn Info Available! \n");
		} else {
			System.out.println("\nAll Student Info : \n");
			for (int i = 0; i < studentArrayList.size(); i++) {

				System.out.println("ID: " + studentArrayList.get(i).getStudentID() + "\t ||" + "Student Name: "
						+ studentArrayList.get(i).getStudentName() + "\t||" + "Dept: "
						+ studentArrayList.get(i).getStudentDept() + "\t||" + studentArrayList.get(i).getStudentAge()
						+ "\t" + studentArrayList.get(i).getStudentCGPA() + "\t" + studentArrayList.get(i).getstudentBatch());

			}
		}
	}// showStudentInfo end;

	// displaying my info ;

	private static void showMyInfo() {

		System.out.println("<==Anamul Hoque Shihab \t Batch - C11==>");
	}

	/*
	 * This method Display the Menu for the User; Implementing the methods for
	 * the interface called OptionChoser_interface
	 * 
	 */
	@Override
	public int choseOption() {
		// TODO Auto-generated method stub
		Scanner makeChoice = new Scanner(System.in);
		System.out.print("\n=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=\n");
		System.out.print("\n \t\t<=Student Management System==>");
		System.out.print("\n=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=•=\n");
		
		System.out.print("\n************************************************************************\n");
		System.out.printf("\nNumber of Students Data Stored Already:  ");
		totalSize();
		System.out.print("\n************************************************************************\n");
		System.out.println("\n\t ==> Press 1 To Add A New Student   ");
		System.out.println("\t ==> Press 2 To Delete A Student Info ");
		System.out.println("\t ==> Press 3 To Show Exixting Student Info");
		System.out.println("\t ==> Press 4 To Delete All Student Info ");
		System.out.println("\t ==> Press 5 to Enrol a Student To a New Subject:  ");
		System.out.println("\t ==> Press 6 To Show the Number Of Students Enrolled in diiferent Subjects ");
		System.out.println("\t ==> Press 0 to Exit:  ");
		System.out.print("=======================================================================\n");
		System.out.print("\t  Enter Your Option: ");
		
		int option = makeChoice.nextInt();

		return option;
	}
	
	public void totalSize(){
		
		int size = studentArrayList.size();
		 System.out.println(size);
		 
	}//Function to count the total number of students data recorded in arraylist;

}

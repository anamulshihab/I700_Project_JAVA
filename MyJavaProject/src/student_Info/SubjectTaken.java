package student_Info;

import java.util.ArrayList;
import java.util.Scanner;
import main_package.MainClass;

public class SubjectTaken {
	
	private String sub1 = "Math";
	private String sub2 = "Networking";
	private String sub3 = "Java";
	private String sub4 = "Informatics";
	private String sub5 = "Presessional";
	private String sub6 = "Oral";
	private String sub7 = "Ethics";
	
	
	
	public static void Subject()
	{
		//write code to see the total number of students enrolled in each subjects.
		
	}
	
	
	public static void Enrol()
	{
		//Write code to enroll a student to any of this subjects from above . user should be able to enroll in multiple subjects upon his wish.
		
		System.out.println("Enter Student ID:   ");
		
		@SuppressWarnings("resource")
		Scanner choice = new Scanner(System.in);
		int id = choice.nextInt();

		for (int i = 0; i < MainClass.studentArrayList.size(); i++) {
			if (MainClass.studentArrayList.get(i).getStudentID() == id) {
				System.out.println("Student ID = " + MainClass.studentArrayList.get(i).getStudentID() + " Student found!\n");
				

			} // if statement ends;
			
			else
				System.out.println("This Student Doesnt Exist !! ");
				

		} /*
			 * For loop to find out the specific student from ArrayList to
			 * delete using Student ID;
			 */

	}

}

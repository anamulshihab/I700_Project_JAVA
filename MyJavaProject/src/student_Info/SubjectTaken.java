package student_Info;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import main_package.MainClass;

public class SubjectTaken implements Subjects_Interface {
	
	private static String sub1 = "Math";
	private String sub2 = "Networking";
	private String sub3 = "Java";
	private String sub4 = "Informatics";
	private String sub5 = "Presessional";
	private String sub6 = "Oral";
	private String sub7 = "Ethics";

	private static String[] subjects = { "Math", "Networking", "Java", "Informatics", "Presessional", "Oral", "Ethics" };
	
	
	public static void Subject()
	{
		for(Student student : MainClass.studentArrayList)
		{
			System.out.println(student.getStudentName() + " Subjects:");
			for(int subject : student.getStudentSubjects())
			{
				System.out.println(subjects[subject]);
			}
		}
	}
	
	
	public static void enrol()
	{
		//Write code to enroll a student to any of this subjects from above . user should be able to enroll in multiple subjects upon his wish.
        System.out.println("Enter Student ID:   ");
		
		Scanner choice = new Scanner(System.in);
		
		int id = choice.nextInt();

		for(int i = 0; i < MainClass.studentArrayList.size(); i++)
		{
			Student student = MainClass.studentArrayList.get(i);
			if(student.getStudentID() == id)
			{
				System.out.println("Found student: " + student.getStudentName());
				System.out.println("Write id of subject that you wish to enroll student at:");
				listSubjects();
				choice.nextLine();

				int subjectId = choice.nextInt();
				if(subjectId > subjects.length - 1)
				{
					System.out.println("That subject doesn't exist.");
				}
				else
				{
					System.out.println(student.getStudentName() + " enrolled in this subject.");
					student.enrol(subjectId);
				}

				return;
			}
		}

		System.out.println("Student with id: " + id + " doesn't exist.");
	}

	public static void derol()
	{
		
		System.out.println("Enter Student ID:   ");

		Scanner choice = new Scanner(System.in);

		int id = choice.nextInt();

		for(int i = 0; i < MainClass.studentArrayList.size(); i++)
		{
			Student student = MainClass.studentArrayList.get(i);
			if(student.getStudentID() == id)
			{
				System.out.println("Found student: " + student.getStudentName());
				System.out.println("Student is enrolled in following subjects:");
				for(Integer subject : student.getStudentSubjects())
				{
					System.out.println(subject + ": " + subjects[subject]);
				}

				System.out.println("Write id of subject that you wish to remove the student from.");
				choice.nextLine();
				int removeFromId = choice.nextInt();

				if(student.getStudentSubjects().contains(removeFromId))
				{
					int index = student.getStudentSubjects().indexOf(removeFromId);
					student.getStudentSubjects().remove(index);
					System.out.println("Student removed from: " + subjects[removeFromId]);
					return;
				}
				else
				{
					System.out.println("Student isn't enrolled in such subject.");
					return;
				}
			}
		}

		System.out.println("Student with id: " + id + " doesn't exist.");
	}

	private static void listSubjects()
	{
		for(int i = 0; i < subjects.length; i++)
		{
			System.out.println(i + ": " + subjects[i]);
		}
	}
		 /*
			 * For loop to find out the specific student from ArrayList to
			 * Enroll him/her in a Subject using Student ID;
			 */

	




	private static void Subjects() {
		// TODO Auto-generated method stub
		
		System.out.println("SUbjects Available: ");
		System.out.println("Discrete Mathmetics ");
		System.out.println("Basic Programming ");
		System.out.println("Basic Networking ");
		System.out.println("Informatics ");
		System.out.println("Social & Ethical aspects in IT ");
		System.out.println("Oral and written Communication ");
		System.out.println("Presessional ");
		
	}
	
	




}

package database;

import student_Info.Student;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shihab on 09.12.2016.
 */

/*
 * Database class uses these to map data from raw file data to class properties.
 */
public class Database {
    public static ArrayList<Student> loadStudents()
    {
        ArrayList<Student> students = new ArrayList<>();

        try
        {
            List<String> studentsData = Files.readAllLines(Paths.get("students.db"));
            for(String studentData : studentsData)
            {
                Student student = new Student();
                student.loadData(studentData.split("|"));
            }
        }
        catch (Exception e)
        {
            System.out.println("Unable to load students.db database file.");
            System.out.println(e.toString());
        }

        return students;
    }

    public static void createDatabaseFiles()
    {
        if(!Files.exists(Paths.get("students.db")))
        {
            try
            {
                System.out.println("Created empty students.db database files.");
                Files.createFile(Paths.get("students.db"));
            }
            catch (Exception e)
            {
                System.out.println("Unable to create students.db database file.");
                System.out.println(e.toString());
            }
        }
    }
}

package database;

import student_Info.Student;

import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ardivaba on 12.12.2016.
 */
public class Database {
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

    public static void updateStudents(ArrayList<Student> students)
    {
        System.out.println("Storing students to database.");
        List<String> studentsData = new ArrayList<String>();
        for(Student student : students)
        {
            String dataLine = "";
            ArrayList<Object> dataList = student.storeData(new ArrayList<Object>());
            for(Object data : dataList )
            {
                dataLine += data.toString();
                if(dataList.get(dataList.size() - 1) != data)
                    dataLine += "|";
            }
            studentsData.add(dataLine);
        }

        try
        {
            Files.write(Paths.get("students.db"),studentsData,Charset.defaultCharset());

            //System.out.println("Stored students to database.");
        }
        catch (Exception e)
        {
            System.out.println("Failed to store students data to database");
            System.out.println(e.toString());
        }
    }

    public static ArrayList<Student> loadStudents()
    {
        ArrayList<Student> students = new ArrayList<>();

        try
        {
            List<String> studentsData = Files.readAllLines(Paths.get("students.db"));
            for(String studentData : studentsData)
            {
                Student student = new Student();
                student.loadData(studentData.split("\\|"));

                students.add(student);
            }
        }
        catch (Exception e)
        {
            System.out.println("Unable to load students.db database file deleteing corrupted database.");
            System.out.println(e.toString());

            try
            {
                Files.delete(Paths.get("students.db"));
            }
            catch (Exception a)
            {
            }
        }

        System.out.println("Loaded " + students.size() + " students from database");
        return students;
    }
}

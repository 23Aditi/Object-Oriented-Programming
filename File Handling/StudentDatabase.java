
import java.io.*;
import java.util.*;

class Student implements Serializable {

    int studentId;
    String name;
    int rollNo;
    String studentClass;
    double marks;
    String address;

    public Student(int studentId, String name, int rollNo, String studentClass, double marks, String address) {
        this.studentId = studentId;
        this.name = name;
        this.rollNo = rollNo;
        this.studentClass = studentClass;
        this.marks = marks;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + "\nName: " + name + "\nRoll No: " + rollNo + "\nClass: " + studentClass
                + "\nMarks: " + marks + "\nAddress: " + address + "\n";
    }
}

public class StudentDatabase {

    private static final String FILE_NAME = "students.txt";

    // Create Database (Add Students)
    public static void createDatabase(List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
            System.out.println("Database created successfully.");
        } catch (IOException e) {
            System.err.println("Error while creating database: " + e.getMessage());
        }
    }

    public static void displayDatabase() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            @SuppressWarnings("unchecked")
            List<Student> students = (List<Student>) ois.readObject();
            System.out.println("Student Records:");
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error while reading database: " + e.getMessage());
        }
    }

    public static void modifyRecord(int studentId, Student updatedStudent) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME)); ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            @SuppressWarnings("unchecked")
            List<Student> students = (List<Student>) ois.readObject();
            boolean found = false;

            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).studentId == studentId) {
                    students.set(i, updatedStudent);
                    found = true;
                    break;
                }
            }

            if (found) {
                oos.writeObject(students);
                System.out.println("Record modified successfully.");
            } else {
                System.out.println("Student ID not found.");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error while modifying record: " + e.getMessage());
        }
    }

    public static void searchRecord(int studentId) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            @SuppressWarnings("unchecked")
            List<Student> students = (List<Student>) ois.readObject();
            boolean found = false;

            for (Student student : students) {
                if (student.studentId == studentId) {
                    System.out.println("Record Found:\n" + student);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student ID not found.");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error while searching record: " + e.getMessage());
        }
    }

    // Clear all records from the database
    public static void clearRecords() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(new ArrayList<Student>()); // Write an empty list
            System.out.println("All records cleared successfully.");
        } catch (IOException e) {
            System.err.println("Error while clearing records: " + e.getMessage());
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Database Management");
            System.out.println("1. Create Database");
            System.out.println("2. Display Database");
            System.out.println("3. Clear Records");
            System.out.println("4. Modify Record");
            System.out.println("5. Search Record");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    List<Student> students = new ArrayList<>();
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Enter Student ID: ");
                        int studentId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Roll No: ");
                        int rollNo = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Class: ");
                        String studentClass = scanner.nextLine();
                        System.out.print("Enter Marks: ");
                        double marks = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Address: ");
                        String address = scanner.nextLine();

                        students.add(new Student(studentId, name, rollNo, studentClass, marks, address));
                    }
                    StudentDatabase.createDatabase(students);
                    break;

                case 2:
                    StudentDatabase.displayDatabase();
                    break;

                case 3:
                    StudentDatabase.clearRecords();
                    break;

                case 4:
                    System.out.print("Enter Student ID to modify: ");
                    int modifyId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Updated Name: ");
                    String updatedName = scanner.nextLine();
                    System.out.print("Enter Updated Roll No: ");
                    int updatedRollNo = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Updated Class: ");
                    String updatedClass = scanner.nextLine();
                    System.out.print("Enter Updated Marks: ");
                    double updatedMarks = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Updated Address: ");
                    String updatedAddress = scanner.nextLine();

                    StudentDatabase.modifyRecord(modifyId, new Student(modifyId, updatedName, updatedRollNo, updatedClass, updatedMarks, updatedAddress));
                    break;

                case 5:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();
                    StudentDatabase.searchRecord(searchId);
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

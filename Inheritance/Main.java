import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter: \n1 : For Programmer \n2 : For Team Lead \n3 : For Project Manager \n4 : For Assistant Project Manager \n5 : Exit");
            int op = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character
            
            if (op == 5) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            // Common inputs for all employees
            System.out.print("Enter Employee ID: ");
            String empId = scanner.nextLine();
            System.out.print("Enter Employee Name: ");
            String empName = scanner.nextLine();
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            System.out.print("Enter Mail ID: ");
            String mailId = scanner.nextLine();
            System.out.print("Enter Mobile Number: ");
            String mobileNo = scanner.nextLine();
            System.out.print("Enter Basic Pay: ");
            float basicPay = scanner.nextFloat();

            switch (op) {
                case 1: // Programmer
                    Programmer programmer = new Programmer(empId, empName, address, mailId, mobileNo, basicPay);
                    programmer.generatePaySlip();
                    break;

                case 2: // Team Lead
                    TeamLead teamLead = new TeamLead(empId, empName, address, mailId, mobileNo, basicPay);
                    teamLead.generatePaySlip();
                    break;

                case 3: // Project Manager
                    ProjectManager projectManager = new ProjectManager(empId, empName, address, mailId, mobileNo, basicPay);
                    projectManager.generatePaySlip();
                    break;

                case 4: // Assistant Project Manager
                    AssistantProjectManager assistantPM = new AssistantProjectManager(empId, empName, address, mailId, mobileNo, basicPay);
                    assistantPM.generatePaySlip();
                    break;

                default:
                    System.out.println("Invalid option! Please select a valid option.");
            }
        }
        scanner.close();
    }
}

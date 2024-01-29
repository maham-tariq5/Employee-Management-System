
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Manager manager = new Manager();
    int choice;

    do {
        System.out.println("\n1. Add a new employee");
        System.out.println("2. Print data of all employees");
        System.out.println("3. Print data of the nth employee");
        System.out.println("4. Search for employee based on empId");
        System.out.println("5. Search for employee based on full name");
        System.out.println("6. Count the total number of employees");
        System.out.println("7. Remove the nth employee");
        System.out.println("8. Remove all employees");
        System.out.println("9.. Add a dependent to an employee");
        System.out.println("10. Exit");
        System.out.print("Enter your choice: ");

        choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter Employee ID: ");
                String empId = scanner.nextLine();
                System.out.print("Enter Full Name: ");
                String fullName = scanner.nextLine();
                manager.addEmployee(empId, fullName);
                break;
            case 2:
                manager.printAllEmployees();
                break;
            case 3:
                System.out.print("Enter the employee index: ");
                int index = scanner.nextInt();
                manager.printNthEmployee(index);
                break;
            case 4:
                System.out.print("Enter Employee ID to search: ");
                empId = scanner.nextLine();
                manager.searchByEmpId(empId);
                break;
            case 5:
                System.out.print("Enter Full Name to search: ");
                fullName = scanner.nextLine();
                manager.searchByFullName(fullName);
                break;
            case 6:
                System.out.println("Total number of employees: " + manager.countEmployees());
                break;
            case 7:
                System.out.print("Enter the employee index to remove: ");
                index = scanner.nextInt();
                manager.removeNthEmployee(index);
                break;
            case 8:
                manager.removeAllEmployees();
                break;
            
            case 9: 
                System.out.print("Enter Employee ID for adding dependent: ");
                String empId = scanner.nextLine();
                System.out.print("Enter Dependent's Name: ");
                String depName = scanner.nextLine();
                System.out.print("Enter Dependent's Relationship: ");
                String relationship = scanner.nextLine();
                manager.addDependentToEmployee(empId, depName, relationship);
            break;
            
            case 10:
                System.out.println("Exiting program.");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 9.");
        }
    } while (choice != 9);

    scanner.close();
}
}

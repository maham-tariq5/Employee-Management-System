import java.util.ArrayList;
import java.util.List;




public class Manager {

        private List<Employee> employees;
    
        public Manager() {
            employees = new ArrayList<>();
        }
    
        public void addEmployee(String empId, String fullName) {
            Employee newEmployee = new Employee(empId, fullName);
            employees.add(newEmployee);
            System.out.println("Employee added successfully.");
        }
    
        public void printAllEmployees() {
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    
        public void printNthEmployee(int n) {
            if (n >= 0 && n < employees.size()) {
                System.out.println(employees.get(n));
            } else {
                System.out.println("Invalid index.");
            }
        }
    
        public void searchByEmpId(String empId) {
            for (Employee emp : employees) {
                if (emp.getEmpId().equals(empId)) {
                    System.out.println(emp);
                    return;
                }
            }
            System.out.println("Employee not found.");
        }
    
        public void searchByFullName(String fullName) {
            for (Employee emp : employees) {
                if (emp.getFullName().equalsIgnoreCase(fullName)) {
                    System.out.println(emp);
                    return;
                }
            }
            System.out.println("Employee not found.");
        }
    
        public int countEmployees() {
            return employees.size();
        }
    
        public void removeNthEmployee(int n) {
            if (n >= 0 && n < employees.size()) {
                employees.remove(n);
                System.out.println("Employee removed successfully.");
            } else {
                System.out.println("Invalid index.");
            }
        }

        public void addDependentToEmployee(String empId, String depName, String relationship) {
            for (Employee emp : employees) {
                if (emp.getEmpId().equals(empId)) {
                    emp.addDependent(new Dependents(depName, relationship));
                    return;
                }
            }
            System.out.println("Employee not found.");
        }
    
        public void removeAllEmployees() {
            employees.clear();
            System.out.println("All employees have been removed.");
        }

    }



public class Employee {
    
    private String empId;
    private String fullName;
    private List<Dependent> dependents;

    public Employee(String empId, String fullName) {
        this.empId = empId;
        this.fullName = fullName;
        this.dependents = new ArrayList<>();
    }
    public void addDependent(Dependent dependent) {
        dependents.add(dependent);
    }
    public List<Dependent> getDependents() {
        return new ArrayList<>(dependents); // Returns a copy of the dependents list
    }

    // Optionally, a setter for dependents if needed
    public void setDependents(List<Dependent> dependents) {
        this.dependents = new ArrayList<>(dependents); // Sets a copy of the dependents list
    }


    public String getEmpId() {
        return empId;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Full Name: " + fullName;
    }
}




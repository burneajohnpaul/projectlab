
package Main;

class Employee extends Person {
    private final String employeeID;

    public Employee(String name, String category, String employeeID) {
        super(name, category);
        this.employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }
}
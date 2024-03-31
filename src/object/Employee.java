package object;

public class Employee {

    private String employeeName;
    private String employeePosition;
    private double employeeSalary;

    public Employee(String employeeName, String employeePosition, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }
    public void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Position: " + employeePosition);
        System.out.println("Salary: " + employeeSalary);
    }
    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}

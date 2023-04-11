package design;

import static design.EmployeeInfo.calculateEmployeeBonus;
import static design.EmployeeInfo.calculateEmployeePension;

public class FortuneEmployee extends EmployeeImplementation {

    private int performanceRating;
    private String startDate;

    public FortuneEmployee(int employeeId, String employeeName, int salary, int performanceRating, String startDate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.performanceRating = performanceRating;
        this.startDate = startDate;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int calculateTotalSalary() {
        return calculateSalary() + calculatebonuses(calculateEmployeeBonus(salary, performanceRating)) + calculateEmployeePension(salary);
    }

    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: $" + salary);
        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Start Date: " + startDate);
        System.out.println("Total Salary: $" + calculateTotalSalary());
    }

    public static void main(String[] args) {
        FortuneEmployee employee = new FortuneEmployee(1001, "Taseen", 4521, 100, "Jan,2013");
        employee.setAddress("123 Main St");
        employee.setPhoneNumber(5551234);
        employee.setEmployeeEmailAddress("johndoe@example.com");
        employee.setEmployeeJobTitle("Software Developer");
        employee.setJobDescription("Develop and maintain software applications.");
        employee.setAge(21);
        employee.getEmployeeDetails();
    }
}

package design;
public class EmployeeImplementation implements Employee {

    //private instance variables
     int employeeId;
     String employeeName;
    private String department;
     int salary;
    private String address;
    private int phoneNumber;
    private String emailAddress;
    private String jobTitle;
    private String jobDescription;
    private int age;
    private int bonuses;

    //getter and setter methods for instance variables
    public int employeeId() {
        return employeeId;
    }

    public String employeeName() {
        return employeeName;
    }

    public void assignDepartment() {
        //implementation for assigning employee to departments goes here
    }

    public int calculateSalary() {
        //implementation for calculating employee salary goes here
        return salary;
    }

    public void benefitLayout() {
        //implementation for employee benefits goes here
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int employeePhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String employeeEmailAddress() {
        return emailAddress;
    }

    public void setEmployeeEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String employeeJobTitle() {
        return jobTitle;
    }

    public void setEmployeeJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String jobDescription() {
        return jobDescription;
    }

    @Override
    public int age() {
        return age;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int calculatebonuses(int bonuses) {
        this.bonuses = bonuses;
        return bonuses;
    }
}
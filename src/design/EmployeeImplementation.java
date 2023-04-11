package design;

public class Methods implements Employee {
    private int employeeId;
    private String employeeName;
    private String department;
    private int salary;
    private String address;
    private int phoneNumber;
    private String emailAddress;
    private String jobTitle;
    private String jobDescription;
    private int age;
    private int bonuses;

    public int employeeId() {
        return employeeId;
    }

    public String employeeName() {
        return employeeName;
    }

    public void assignDepartment() {
        // implementation for assigning department
    }

    public int calculateSalary() {
        // implementation for calculating salary
        return salary;
    }

    public void benefitLayout() {
        // implementation for employee benefits
    }

    public void setAddress(String address) {

        this.address = address;

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

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int calculatebonuses() {
        return bonuses;
    }
}

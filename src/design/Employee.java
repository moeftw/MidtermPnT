package design;

//Employee is an Interface which contains multiple unimplemented methods.
//Implement these methods in EmployeeImplementation class.
public interface Employee {

	//employeeId() will return employee id.
	public int employeeId();

	//employeeName() will return employee name
	public String employeeName();

	//assignDepartment() will assign employee to departments
	public void assignDepartment();

	//calculate employee salary
	public int calculateSalary();

	//employee benefit
	public void benefitLayout();

	//set employee address
	public void setAddress(String address);

	//set employee phone number
	public int employeePhoneNumber();

	//set employee emailAddress
	public String employeeEmailAddress();

	// employee job title
	public String employeeJobTitle();

	//employee job description
	public String jobDescription();

	//employee age
	public int age();

	//calculate bonuses
	public int calculatebonuses(int bonuses);

}
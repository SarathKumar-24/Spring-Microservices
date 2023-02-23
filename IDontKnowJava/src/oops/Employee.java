package oops;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee>{

	// attributes/fields/member variables/instance variable
	private int employeeId;
	private String employeeName;
	private LocalDate dateOfJoining;
	private String designation;
	private double salary;
	
	private final static String companyName;
	
	public static String getCompanyName() {
		return companyName;
	}
	
	
	//constructor
	
	//no-args constructor
	public Employee() {
		// employeeId=0101;
		System.out.println("Superclass no-args constructor");
		
	}
	// static initializer block
	static{
		System.out.println("Static initialzer  called.");
		companyName="Deloitte USI";
	}
	
	//instance initializer block
	{
		System.out.println("Instance initializer block1...");
	}
	public Employee(int employeeId, String employeeName, LocalDate dateOfJoining) {
		System.out.println("Superclass 3 parameter constructor");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfJoining = dateOfJoining;
		//companyName="ABC Compnay";
	}
	
	public Employee(int employeeId, String employeeName, LocalDate dateOfJoining, String designation, double salary) {
		System.out.println("COnstructor with 5 parameters");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfJoining = dateOfJoining;
		this.designation = designation;
		this.salary = salary;
	}
	
	{
		System.out.println("Instance initializer block2...");
	}

	//getters and setters
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {   // employee1.getSalary()
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	//behavior/methods/member methods
		public void viewEmployeeDetails() {
			System.out.print(employeeId+" "+employeeName+" "+
					dateOfJoining+" "+designation+" "+salary+" "+companyName);
		}

		
		@Override 
		public String toString() {
			return employeeId+" "+employeeName+" "+designation+" "+salary+" "+dateOfJoining;
		}


		@Override
		public int hashCode() {
			//return Objects.hash(dateOfJoining, designation, employeeId, employeeName, salary);
			return Objects.hash(employeeId);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return Objects.equals(dateOfJoining, other.dateOfJoining) && Objects.equals(designation, other.designation)
					&& employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName)
					&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
		}


		@Override
		public int compareTo(Employee emp) {    //emp1.compareTo(emp2);
			if(this.employeeId>emp.employeeId) {
				return -1;
			}
			else if(this.employeeId<emp.employeeId) {
				return 1;
			}
				
			return 0;
		}
		
		
}








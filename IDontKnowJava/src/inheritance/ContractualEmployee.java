package inheritance;

import java.time.LocalDate;

import oops.Employee;

public class ContractualEmployee extends Employee {
	
	LocalDate expiryDate;
	int duration;

	public ContractualEmployee() {
		System.out.println("Child class no-args constructor");
	}
//	public ContractualEmployee(int employeeId, String employeeName, 
//			                                               LocalDate dateOfJoining){
//		//System.out.println("Child class 3 parameter constructor");
//		super(employeeId,employeeName, dateOfJoining);
//	}  

	public ContractualEmployee(int employeeId, String employeeName, LocalDate dateOfJoining, String designation,
			double salary,LocalDate expiryDate,int duration) {
		super(employeeId, employeeName, dateOfJoining, designation, salary);
		this.expiryDate=expiryDate;
		this.duration=duration;
	}

	public ContractualEmployee(int employeeId, String employeeName, LocalDate dateOfJoining,LocalDate expiryDate,
			 int duration) {
		super(employeeId, employeeName, dateOfJoining);
		this.expiryDate=expiryDate;
		this.duration=duration;
	}
	
	
	public void viewContractualEmployee() {
		 super.viewEmployeeDetails();
		 System.out.println(" "+expiryDate+" "+duration);
	}


}

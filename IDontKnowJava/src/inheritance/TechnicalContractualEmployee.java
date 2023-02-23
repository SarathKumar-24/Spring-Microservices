package inheritance;

import java.time.LocalDate;

public class TechnicalContractualEmployee extends ContractualEmployee {

	private String technology;

	public TechnicalContractualEmployee() {
		super();
	}

	public TechnicalContractualEmployee(int employeeId, String employeeName, LocalDate dateOfJoining,
			LocalDate expiryDate, int duration,String technology) {
		super(employeeId, employeeName, dateOfJoining, expiryDate, duration);
		this.technology=technology;
	}

	public TechnicalContractualEmployee(int employeeId, String employeeName, LocalDate dateOfJoining,
			String designation, double salary, LocalDate expiryDate, int duration,String technology) {
		super(employeeId, employeeName, dateOfJoining, designation, salary, expiryDate, duration);
		this.technology=technology;
	}
	
	public void viewTechnicalContractualEmployeeDetails() {
		super.viewContractualEmployee();
		System.out.println(technology);
	}
	
}

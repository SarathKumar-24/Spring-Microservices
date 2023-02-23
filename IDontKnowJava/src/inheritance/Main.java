package inheritance;

import java.time.LocalDate;

import oops.Employee;

public class Main {

	public static void main(String[] args) {
	//ContractualEmployee e=new ContractualEmployee();
//		ContractualEmployee e=new ContractualEmployee(100,"Mark",LocalDate.now(),"Manager",45000,LocalDate.now(),2);
//		e.viewContractualEmployee();
//		
//		Employee emp=new Employee();
		
		
		TechnicalContractualEmployee technicalContractualEmployee=new 
				TechnicalContractualEmployee(1010, "James", LocalDate.now(), "Manager", 4500, LocalDate.now(), 3, "Java");
		
		technicalContractualEmployee.viewTechnicalContractualEmployeeDetails();
	}

}

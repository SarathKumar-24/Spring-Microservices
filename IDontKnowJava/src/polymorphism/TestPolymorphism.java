package polymorphism;

import java.time.LocalDate;

import inheritance.ContractualEmployee;
import inheritance.TechnicalContractualEmployee;
import oops.Employee;

public class TestPolymorphism {

	public static void main(String[] args) {
		Employee employee=new Employee(101, "Jane", LocalDate.now());
		ContractualEmployee contractualEmployee=new 
				ContractualEmployee(102, "Kane", LocalDate.now(), LocalDate.now(), 2);
		TechnicalContractualEmployee technicalContractualEmployee=
				new TechnicalContractualEmployee(103, "Kevin", LocalDate.now(), LocalDate.now(), 2, "Python");
		
		Employee emp;
		
		emp=new ContractualEmployee(104, "Marsh", LocalDate.now(), LocalDate.now(), 2);
		
		System.out.println(emp.getClass().getName());

		//Down casting
		
		((ContractualEmployee)emp).viewContractualEmployee();
		
//		ContractualEmployee ce=(ContractualEmployee)emp;
//		ce.viewContractualEmployee();
		
		emp=new TechnicalContractualEmployee(105, "Mark", LocalDate.now(), LocalDate.now(), 3, "Angular");
		
		System.out.println(emp.getClass().getName());
		
		ContractualEmployee contractualEmployee2=new ContractualEmployee();
		
		//Employee employee2=contractualEmployee;
		
		TechnicalContractualEmployee tce=new TechnicalContractualEmployee();
		
		//Upcasting
		Employee employee2=tce;
		
		//downcasting
		((TechnicalContractualEmployee)employee2).viewTechnicalContractualEmployeeDetails();

	}

}

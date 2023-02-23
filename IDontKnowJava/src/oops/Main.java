package oops;

import java.time.LocalDate;

import inheritance.ContractualEmployee;

public class Main {

	public static void main(String[] args) {
		//Employee employee=new Employee();
		//employee.employeeId=1001;
		
		//Employee.companyName="Deloitte";
		
		System.out.println(Employee.getCompanyName());
		
		
		Employee employee=new Employee(1001, "John", LocalDate.of(2023, 01, 23),
				"Analyst", 5000);
		
		//System.out.println(employee.companyName);
		
		
		employee.viewEmployeeDetails();
		
		Employee employee1=new Employee(1002, "Mark", LocalDate.of(2020, 10, 12));
		
		employee1.viewEmployeeDetails();
		
		employee1.setDesignation("Manager");
		employee1.setSalary(10000);
		
		employee1.viewEmployeeDetails();
		
		//increment the first employee salary by 10%.
		
		// code here....
		
		//employee.setSalary(employee.getSalary()+employee.getSalary()*0.1);
		
		employee.viewEmployeeDetails();
		
		System.out.println(employee.getSalary());
		System.out.println(employee1.getSalary());

		//System.out.println(employee.hashCode());
		System.out.println(employee);  //toString() is called
		System.out.println(employee1);
		
		Employee employee2=employee;  
		
		System.out.println(employee.getEmployeeName());
		System.out.println(employee2.getEmployeeName());
		System.out.println(employee.equals(employee2));
		
		Employee employee3=new Employee(1001, "John", LocalDate.of(2023, 01, 23),
				"Analyst", 5000);
		System.out.println(employee.equals(employee3));
		
		Employee employee4=null;
		
		employee.equals(employee4);
		//employee4.equals(employee);
		
		System.out.println(employee.hashCode());
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee3.hashCode());
		
		System.out.println(employee.hashCode()==employee2.hashCode());
		
		
		
	}

}

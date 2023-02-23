package collections;

import java.util.Comparator;

import oops.Employee;

public class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return emp1.getEmployeeName().compareTo(emp2.getEmployeeName());
	}

}

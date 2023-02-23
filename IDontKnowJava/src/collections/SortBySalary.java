package collections;

import java.util.Comparator;

import oops.Employee;

public class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.getSalary()>emp2.getSalary()) {
			return 1;
		}
		if(emp1.getSalary()<emp2.getSalary()) {
			return -1;
		}
		return 0;
	}

}

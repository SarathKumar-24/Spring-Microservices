package collections;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import oops.Employee;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> numSet=new HashSet<>();
		//Set<Integer> numSet=new TreeSet<>();
		
		numSet.add(10);
		numSet.add(50);
		numSet.add(10);
		numSet.add(20);
		numSet.add(60);
		numSet.add(null);
		numSet.add(null);
		numSet.add(40);
		
		System.out.println(numSet);

		//Set<Employee> employeeSet=new HashSet<>();
		//Set<Employee> employeeSet=new TreeSet<>();
		
		
		//Set<Employee> employeeSet=new TreeSet<>(new SortByName());
		Set<Employee> employeeSet=new TreeSet<>(new SortBySalary());
		
		Employee employee=new Employee(101, "Sam", LocalDate.of(1998, 10, 25), "Manager",4500);
		
		employeeSet.add(employee);
		employeeSet.add(new Employee(104, "John", LocalDate.of(2001, 12, 12), "Analyst", 6000));
		employeeSet.add(new Employee(102, "Mark", LocalDate.of(2021, 9, 30), "Developer", 5000));
		employeeSet.add(new Employee(103, "Albie", LocalDate.of(2004, 7, 15), "Analyst", 2000));
		employeeSet.add(new Employee(105, "Jane", LocalDate.of(2011, 5, 19), "Manager", 7000));
		
		
		System.out.println(employeeSet);
		
		
		
		
		
	}

}






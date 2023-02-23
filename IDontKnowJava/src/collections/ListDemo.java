package collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import oops.Employee;

public class ListDemo {

	public static void main(String[] args) {
		//List<Integer> nums=new ArrayList<>();
		List<Integer> nums=new LinkedList();
		
		//internally, array list uses array data structure
		
		nums.add(10);
		nums.add(50);
		nums.add(100);
		nums.add(20);
		nums.add(40);
		
		//an array list can contain duplicate items.
		nums.add(50);
		nums.add(20);
		
		//An arraylist follows the insertion order.
		System.out.println(nums);
		
		List<String> names=new ArrayList<>();
		names.add("James");
		names.add("Mark");
		names.add("Stacy");
		names.add("Kevin");
		names.add("George");
		names.add(null);
		
		System.out.println(names.contains("Stacy"));
		System.out.println(names.get(1));
		System.out.println(names.indexOf("Simant"));
		
		System.out.println(names);
		
	
//		for(int i=0;i<names.size();i++) {
//			System.out.println(names.get(i));
//		}

		// for-enhanced
//		
//		for(String nm:names) {
//			System.out.println(nm);
//		}
//		
//		for(int i:nums) {
//			System.out.println(i);
//		}
		
//		Iterator<String> items= names.iterator();
//		
//		while(items.hasNext()) {
//			System.out.println(items.next());
//		}
		
		
		ListIterator<String> nameList= names.listIterator();
		
		System.out.println("traversing forward");
		
		while(nameList.hasNext()) {
			System.out.println(nameList.next());
		}
		
		System.out.println("traversing backward...");
		while(nameList.hasPrevious()) {
			System.out.println(nameList.previous());
		}
		
		
		nums.sort(null);
		
		System.out.println("After nums list is sorted.");
		for(int n:nums) {
			System.out.println(n);
		}
		
		names.sort(null);
		System.out.println("Afer names list is sorted.");
		for(String nm:names) {
			System.out.println(nm);
		}
		
		// creating user-defined objects list
		
		List<Employee> employees=new ArrayList<>();
		
		Employee employee=new Employee(101, "Sam", LocalDate.of(1998, 10, 25), "Manager",4500);
		
		employees.add(employee);
		employees.add(new Employee(104, "John", LocalDate.of(2001, 12, 12), "Analyst", 6000));
		employees.add(new Employee(102, "Mark", LocalDate.of(2021, 9, 30), "Developer", 5000));
		employees.add(new Employee(103, "Albie", LocalDate.of(2004, 7, 15), "Analyst", 2000));
		employees.add(new Employee(105, "Jane", LocalDate.of(2011, 5, 19), "Manager", 7000));
		
		for(Employee emp:employees) {
			System.out.println(emp);
		}
		
		boolean isPresent=employees.contains(new Employee(103, "Albie", LocalDate.of(2004, 7, 15), "Analyst", 2000));
		System.out.println(isPresent);
		
		
//		Employee employee1=new Employee(101, "Sam", LocalDate.of(1998, 10, 25), "Manager",4500);
//		Employee employee2=new Employee(101, "Mike", LocalDate.of(1998, 10, 25), "Manager",4500);
//		
//		
//		System.out.println(employee1==employee2); //check reference
//		System.out.println(employee1.equals(employee2));
		
		Employee emp= employees.get(3);
		
		System.out.println(emp);
		
		int index=employees.indexOf(new Employee(107, "Albie", LocalDate.of(2004, 7, 15), "Analyst", 2000));
		System.out.println(index);
		
		
				
		//employees.sort(null);   //Comparable's comapreTo()
		
		//employees.sort(new SortByName());  //Comparator
		//employees.sort(new SortBySalary());
		
		System.out.println("Employees List after sorting.");
		
		Iterator<Employee> allEmployees= employees.iterator();
		
		while(allEmployees.hasNext()) {
			Employee e= allEmployees.next();
			//System.out.println(e.getEmployeeId()+" "+e.getEmployeeName());
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}

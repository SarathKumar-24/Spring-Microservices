package constructs;

import oops.Employee;

public class IfElse {
	public static void main(String[] args) {
		int a = 20, b = 20;

		if (a != b) {
			if (a > b) {
				System.out.println(a + " is greater");
			} else {
				System.out.println(b + " is greater");
			}
		}
		else {
			System.out.println("Both are equal");
		}

		// ternary operator return the values or statement
		// (condition)?<exp1>:<exp2>
		// int greater=(a>b)?a:b;
		// System.out.println(greater+" is greater");
		
		String res=(a != b)?(a > b)?a+" is greater":b+" is greater":"Both are equal";
		System.out.println(res);
		
//		Employee employee=new Employee();
//		employee.viewEmployeeDetails();
	}
}

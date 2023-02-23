package exceptions;

import java.util.Scanner;

import oops.Employee;

public class UnCheckedExceptions {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two numbers for division:");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int res=0;
		
		try {
		res=a/b;  //ArithmeticException
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("Cannot divide by zero");
		}
		System.out.println(res);
		
		Employee employee=null;
		
		//code to fetch employee data from web server
		
		try {
		System.out.println(employee.getEmployeeName());
		}
		catch(NullPointerException ne) {
			System.out.println("API returned null, Employee not found");
		}
		
		int[] arr=new int[5];
		
		try {
		arr[6]=10;
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Index not found.");
		}
		
		
		System.out.println("End of file.");
		
		//local variable initialization code snippets
//		int num;
//		boolean bool=true;
//		if(bool) {
//		//if(true) {
//			num=10;
//		}
//		else {
//			num=5;
//		}
//		System.out.println(num);
	}

}

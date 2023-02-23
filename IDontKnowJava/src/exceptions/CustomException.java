package exceptions;

import java.util.Scanner;

import oops.Employee;

public class CustomException {

	public static void main(String[] args) {
		
		//explicitly throw exception
		
		//throw new NullPointerException();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age=scanner.nextInt();
		
		if(age>100) {
			try {
				throw new AgeException("Age is beyond the limit");
			}
			catch(AgeException ae) {
				System.out.println(ae.getMessage());
				//ae.printStackTrace();
			}
		}
		else {
			System.out.println("Your age is accepted.");
		}
		
		
	}

}

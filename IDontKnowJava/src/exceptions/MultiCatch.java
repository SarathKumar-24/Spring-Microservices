package exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, res, sum;
		int index, value;
		
		InputStream is=null;
		
		
		//BufferedReader reader=new BufferedReader(reader);
		
		
		try {
			is=new FileInputStream("c:\\simant\\data\\myFile.txt");
			
			System.out.println("Enter two numbers:");

			a = scanner.nextInt();
			// b=scanner.nextInt();
			b = Integer.parseInt(scanner.next());

			sum = a + b;

			res = a / b;

			System.out.println("Sum= " + sum);

			System.out.println("Result= " + res);

			int[] arr = new int[5];

			System.out.println("Enter position and value to store.");
			index = scanner.nextInt();
			value = scanner.nextInt();

			arr[index] = value;

			System.out.println("Array value: " + arr[index]);
			is.close();
		}catch (InputMismatchException e) {
			System.out.println("Input is not a number.");
		}
		catch (NumberFormatException e) {
			System.out.println("Your input is not in desired format.");
		}
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero.");
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally block.");
			try {
				is.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Resource closed.");
		}
		
//		catch (IndexOutOfBoundsException e) {
//			System.out.println("Position you have specified is not available.");
//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		} catch (Throwable te) {
//			System.out.println(te.getMessage());
//		}

		
	}

}

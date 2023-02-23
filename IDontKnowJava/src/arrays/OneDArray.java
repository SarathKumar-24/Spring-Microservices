package arrays;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// read and store data in 1D array

		System.out.println("Enter number of students");
		int size = scanner.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter total marks of " + size + " students");

		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}

		System.out.println("All marks of "+size+"students.");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		// Print the highest and lowest mark
		// Highest mark: XXX, lowest mark: YYY
		
		// Print percentage obtained by each student, while Full Mark is 600
		
		
	}

}

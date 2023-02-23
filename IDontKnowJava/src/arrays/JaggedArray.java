package arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
//		int[][]seats=new int[3][];
//		
//		seats[0]=new int[5];
//		seats[1]=new int[3];
//		seats[2]=new int[4];
		
//		int[][]seats= {
//				{10,20,30,40,50},
//				{80,30,50},
//				{20,30,70,80}
//			};
//		
//		for(int i=0;i<seats.length;i++) {
//			int sum=0;
//			for(int j=0;j<seats[i].length;j++) {
//				sum=sum+seats[i][j];
//				System.out.print(seats[i][j]+" ");
//			}
//			System.out.println(sum);
//		}
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of rows:");
		int r=sc.nextInt(); //3
				
		int[][]seats=new int[r][];
		
//		seats[0]=new int[5];
//		seats[1]=new int[3];
//		seats[2]=new int[4];
		
		//allocating array and taking input
		for(int i=0;i<seats.length;i++) {
			System.out.println("Enter number of columns for row "+i);
			int c=sc.nextInt(); //5,3,4
			seats[i]=new int[c];
			
			System.out.println("Enter "+c+" values for row "+i);
			for(int j=0;j<c;j++) {
				seats[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Jagged Array:");
		for(int i=0;i<seats.length;i++) {
			for(int j=0;j<seats[i].length;j++) {
				System.out.print(seats[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

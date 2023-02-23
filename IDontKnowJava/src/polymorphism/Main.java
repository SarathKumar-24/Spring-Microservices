package polymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Amazon amazon=null;
		
		System.out.println("1. Seller1 \n 2. Seller2");
		int ch=new Scanner(System.in).nextInt();
		
		if(ch==1) {
			amazon=new AmazonSeller1(0.01);
		}
		else if(ch==2) {
			amazon=new AmazonSeller2(0.02,0.03);
		}
		amazon.sellProduct(5000);
	}

}

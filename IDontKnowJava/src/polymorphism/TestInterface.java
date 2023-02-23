package polymorphism;

import java.util.Scanner;

public class TestInterface {

	public static void main(String[] args) {
		Atm atm=null;
		
		System.out.println("1. SBI\n2. ICICI\n3. HDFC");
		int ch=new Scanner(System.in).nextInt();
		
		switch(ch) {
			case 1:
				atm=new SbiAtm();
				break;
			case 2:
				atm=new IciciAtm();
				break;
			case 3:
				atm=new HdfcAtm();
				break;
		}
		
		atm.checkBalance(1223);
		atm.withdraw(10, 2332, 533342);
	}

}

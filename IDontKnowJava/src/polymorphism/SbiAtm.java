package polymorphism;

public class SbiAtm implements Atm {

	@Override
	public void withdraw(int cardNo, int cardPin, double amount) {
		System.out.println("Amount"+amount+" withrawn from Sbi card");
	}

	@Override
	public void deposit(int accountNo, double amount) {
		System.out.println("Amount"+amount+" deposited in Sbi Bank");
		
	}

	@Override
	public void changePin(int currentPin, int newPin) {
		System.out.println("Pin successfully changed from SBI card");
		
	}

	@Override
	public void checkBalance(int cardNo) {
		System.out.println("Balance checked for SBI card");
		
	}

	

}

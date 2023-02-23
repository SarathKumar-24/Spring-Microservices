package polymorphism;

public class HdfcAtm implements Atm {

	@Override
	public void withdraw(int cardNo, int cardPin, double amount) {
		System.out.println("Amount"+amount+" withrawn from Hdfc card");
	}

	@Override
	public void deposit(int accountNo, double amount) {
		System.out.println("Amount"+amount+" deposited in Hdfc Bank");
		
	}

	@Override
	public void changePin(int currentPin, int newPin) {
		System.out.println("Pin successfully changed from Hdfc card");
		
	}

	@Override
	public void checkBalance(int cardNo) {
		System.out.println("Balance checked for Hdfc card");
		
	}

	

}

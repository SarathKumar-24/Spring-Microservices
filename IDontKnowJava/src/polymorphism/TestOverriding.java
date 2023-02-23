package polymorphism;

public class TestOverriding {

	public static void main(String[] args) {
		Account account=new SavingsAccount();
		account.viewAccount();
	}

}

class Account{
	
	public void viewAccount() {
		System.out.println("Parent method");
	}
}

class SavingsAccount extends Account{
	
	@Override
	public void viewAccount() {
		System.out.println("Child method");
	}
}


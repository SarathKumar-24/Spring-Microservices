package polymorphism;

public interface Atm {
	int num=10;
	void withdraw(int cardNo,int cardPin,double amount);
	void deposit(int accountNo,double amount);
	void changePin(int currentPin,int newPin);
	void checkBalance(int cardNo);
}

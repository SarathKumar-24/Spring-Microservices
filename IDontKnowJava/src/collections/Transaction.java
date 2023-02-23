package collections;

public class Transaction {
	
	private int transactionId;
	
	private TransactionType type;
	
	private double amount;

	public Transaction(int transactionId, TransactionType type, double amount) {
		super();
		this.transactionId = transactionId;
		this.type = type;
		this.amount = amount;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}

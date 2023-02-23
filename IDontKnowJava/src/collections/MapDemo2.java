package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		
		Map<Account, List<Transaction>> transactionHistory=
				new HashMap<>();
		
		Account account1=new Account(101, 2000);
		List<Transaction> transactions1=new ArrayList<>();
		transactions1.add(new Transaction(111, TransactionType.CREDIT, 1000));
		transactions1.add(new Transaction(112, TransactionType.DEBIT, 500));
		transactions1.add(new Transaction(113, TransactionType.CREDIT, 1200));
		
		Account account2=new Account(102, 5000);
		List<Transaction> transactions2=new ArrayList<>();
		transactions2.add(new Transaction(211, TransactionType.DEBIT, 4000));
		transactions2.add(new Transaction(212, TransactionType.DEBIT, 1500));
		transactions2.add(new Transaction(213, TransactionType.CREDIT, 1000));
		
		transactionHistory.put(account1, transactions1);
		transactionHistory.put(account2, transactions2);
		
		Set<Entry<Account, List<Transaction>>> entries=transactionHistory.entrySet();
		
		for(Entry<Account, List<Transaction>> entry:entries) {
			Account acc=entry.getKey();
			List<Transaction> transactions=entry.getValue();
			System.out.println(acc.getAccountNo());
			for(Transaction t:transactions) {
				System.out.println(t.getTransactionId()+" "+t.getType()+" "+t.getAmount());
			}
		}
		
		
		
		

	}

}

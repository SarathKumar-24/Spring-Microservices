package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		
		Map<Customer, Account> customerAccountDetails=
				new HashMap<>();
		
		customerAccountDetails.put(new Customer(101, "Mark"), new Account(111, 10000));
		customerAccountDetails.put(new Customer(103, "James"), new Account(114, 8000));
		customerAccountDetails.put(new Customer(102, "Eric"), new Account(112, 5000));
		customerAccountDetails.put(new Customer(104, "Michelle"), new Account(113, 9000));
		
		// display customer name and balance
		
		Set<Entry<Customer, Account>> custAccSet=customerAccountDetails.entrySet();
		
		for(Entry<Customer, Account> items:custAccSet) {
			Customer c=items.getKey();
			Account a=items.getValue();
			System.out.println(c.getCustomerName()+" "+a.getBalance());
		}
		
		
		

	}

}

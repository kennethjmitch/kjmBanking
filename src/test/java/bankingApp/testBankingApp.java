package bankingApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class testBankingApp {

	@Test
	public static void withdrawal(Customer cust) {
		double cc=cust.balance;
		System.out.println("withdrawal almount: ");
		double yy=scan.nextDouble();
		cust.setBalance(cc-yy);
		Customers.add(cust);
		System.out.println(cust.getBalance());
		}

}

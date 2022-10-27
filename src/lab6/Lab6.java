package lab6;

import lab7.OverBalanceException;

public class Lab6 {

	
	public static void main(String[] args) {
		PremiumCustomer premiumCustomer = new PremiumCustomer("Chet", 100.00, "", 0, 23, 2);

		premiumCustomer.addToCart("Sugar_Large", 10);
		
		try {
			premiumCustomer.buy();
		} catch (OverBalanceException e) {
			e.printStackTrace();
		}
		
		
		
		
		System.out.println(premiumCustomer.toString());
	}
}

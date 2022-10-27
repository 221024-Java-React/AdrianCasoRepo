package lab7;

import lab6.PremiumCustomer;

public class Lab7 {

	public static void main(String[] args) {
		PremiumCustomer premiumCustomer = new PremiumCustomer("Chester", 100.00, "", 0, 00000001, 10);
		
		premiumCustomer.addToCart("Gold_Toothbrush", 200);
		
		
		try {
			premiumCustomer.buy();
		} catch (OverBalanceException e) {
			e.printStackTrace();
		}
		
		System.out.println(premiumCustomer.toString());
		
		
	}
	
}

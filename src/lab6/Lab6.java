package lab6;



public class Lab6 {

	
	public static void main(String[] args) {
		PremiumCustomer premiumCustomer = new PremiumCustomer("Chet", 100.00, "", 0, 23, 2);

		premiumCustomer.addToCart("Sugar_Large", 10);
		
		premiumCustomer.buy();
		
		
		
		
		System.out.println(premiumCustomer.toString());
	}
}

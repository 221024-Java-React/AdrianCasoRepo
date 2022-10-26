package lab6;


// DISCOUNTED PRICE NOT ACCOUNTED FOR
public class Lab6 {

	
	public static void main(String[] args) {
		PremiumCustomer premiumCustomer = new PremiumCustomer("Chet", 100.00, "", 0, 23, 2);
		
		premiumCustomer.addToCart("Mug", 2);
		premiumCustomer.addToCart("Folgers_Coffee", 5);
		premiumCustomer.addToCart("Sugar_Large", 10);
		
		
		
		
		System.out.println(premiumCustomer.toString());
	}
}

package lab6;

public class PremiumCustomer extends Customer implements Premium {
	
	private int vipCard;
	private int years;
	
	
	public PremiumCustomer(String name, double balance, String items, double cartCost, int vipCard, int years) {
		super(name, balance, items, cartCost);
		this.vipCard = vipCard;
		this.years = years;
	}
	
	// provides a discounted price for premium customers
	public double discountPrice(double startingPrice) {
		
		double discountedPrice = startingPrice - (startingPrice * .15);	
		
		return discountedPrice;
	}
	
	// empties cart, subtracts the discounted price of all objects in cart from balance, resets cart cost to 0
	@Override
	public void buy() {
		this.items = "";
		this.balance -= discountPrice(this.cartCost);
		this.cartCost = 0;
		
	}
	
	@Override
	public String toString() {
		return "Customer Name: " + this.name + "\n" + "Customer Balance: " +this.balance + "\n" 
				+ "Items in Cart: " + this.items + "\n" + "Cost of all Items in Cart: " + this.cartCost + "\n" 
				+ "Customer Status: " +Premium.title + "\n" + "VIP Card Number: " + this.vipCard + "\n" + "Years Subscribed: " + this.years;
	}


	// Getter and Setters
	public int getVipCard() {
		return vipCard;
	}


	public void setVipCard(int vipCard) {
		this.vipCard = vipCard;
	}


	public int getYears() {
		return years;
	}


	public void setYears(int years) {
		this.years = years;
	}

	
	
	
}

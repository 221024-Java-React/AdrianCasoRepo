package lab6;

import lab7.OverBalanceException;

public abstract class Customer {
	
	public String name;
	public double balance;
	// items = essentially a list of items, each item name has a space after it for parsing
	public String items;
	public double cartCost;
	
	public Customer() {
		
	}
	
	public Customer(String name, double balance, String items, double cartCost) {
		this.name = name;
		this.balance = balance;
		this.items = items;
		this.cartCost = cartCost;
		
	}
	
	public void addToCart(String item, double cost) {
		cartCost += cost;
		items = items + " " + item;
	}
	
	public abstract void buy() throws OverBalanceException;
	

}

package lab7;

public class OverBalanceException extends Exception {
	
	private static final long serialVersionUID = 1L;

	// no-args constructor
	public OverBalanceException() {
		
	}
	
	// parameterized constructor
	public OverBalanceException(String message) {
		super(message);
		
	}
	
	

}

package lab13;

public class Lab13 {
	
	public static void main(String[] args) {
		Lab13 app = new Lab13();
		
		System.out.println(app.fizzBuzz(15));
	}
	
	public String fizzBuzz(int n) {
		if(n % 3 == 0 && n % 5 ==0) {
			return "Fizz Buzz";
		} else if(n % 3 == 0) {
			return "Fizz";
		} else if(n % 5 == 0) {
			return "Buzz";
		} else {
			return Integer.toString(n);
		}
	}

}

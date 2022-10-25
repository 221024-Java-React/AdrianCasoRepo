package labs;

public class Lab2 {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public double multiply(double a, double b) {
		return a * b;
	}
	
	public double divide(double a, double b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		Lab2 calc = new Lab2();
		
		System.out.println(calc.divide(1, 2));
	}

}

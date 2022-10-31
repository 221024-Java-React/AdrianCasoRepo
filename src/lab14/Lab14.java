package lab14;

public class Lab14 {
	
	public static void main(String[] args) {
		
		Lab14 app = new Lab14();
		
		System.out.println(app.twoKidsAndATruck(1, 3, 2));
		
	}

	
	public String twoKidsAndATruck(int k1, int k2, int t) {
		
		int kid1Result = t - k1;
		int kid2Result = t - k2;
		
		if(kid1Result < 0) {
			kid1Result *= -1;		
		}
		
		if(kid2Result < 0) {
			kid2Result *= -1;
		}
		
		if(kid1Result == kid2Result) {
			return "Truck";
		} else if (kid1Result < kid2Result) {
			return "Kid 1";
		} else {
			return "Kid 2";
		}
		
	}
}

package lab9;

import java.util.Arrays;

public class Lab9 {

	public static void main(String[] args) {
		
		char[] array = {'A', 'A', 'C', 'F'};
		
		System.out.println(Arrays.toString(calculateBonuses(array)));
		
	}
	
	private static int[] calculateBonuses(char[] grades ) {
		
		int[] bonuses = new int[grades.length];
		int whileCounter = 0;
		
		do {
			switch (grades[whileCounter]) {
			case 'A':
				bonuses[whileCounter] = 5000;
				whileCounter++;
				break;
			
			case 'B':
				bonuses[whileCounter] = 2500;
				whileCounter++;
				break;
			
			case 'C':
				bonuses[whileCounter] = 1000;
				whileCounter++;
				break;
				
			case 'D':
				bonuses[whileCounter] = 500;
				whileCounter++;
				break;
				
			case 'F':
				bonuses[whileCounter] = 0;
				whileCounter++;
				break;

			default:
				bonuses[whileCounter] = -1;
				whileCounter++;
				break;
			}
		} while (whileCounter < grades.length);
		
		return bonuses;
		
	}
	
}

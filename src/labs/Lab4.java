package labs;

public class Lab4 {

	
	public void labTask() {
		
		
		int[] numbers = new int[100];
		
		for(int i = 0; i < numbers.length; i++ ) {
			numbers[i] = i + 1;
		}
		
		int evenSum = 0;
		int oddSum = 0;
		
		int count = 0;
		
		while(count < 100) {
			if(numbers[count] % 2 == 0) {
				evenSum += numbers[count];
				count++;
			} else {
				oddSum += numbers[count];
				count++;
			}
		}
		
		System.out.println(evenSum);
		System.out.println(oddSum);
		
	}
	
	
	public static void main(String[] args) {
		
		Lab4 lab4 = new Lab4();
		lab4.labTask();

	}
	
}

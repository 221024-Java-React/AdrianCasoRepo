package lab8;

public class Lab8 {
	
	private static String reverse(String stringToBeReversed) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = stringToBeReversed.length() - 1; i >= 0; i--) {
			
			sb.append(stringToBeReversed.charAt(i));
			
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("The quick brown fox jumps over the lazy dog"));
	}

}

package labs;

import java.util.Arrays;

public class Lab3 {

	public String replaceAllSpaces(String input) {
		return input.replace(" ", "-");
	}
	
	// this will still return true if sequence of characters is in inputWord and not necessarily an entire word
	public boolean containsWord(String inputWord, String searchWord) {
		String inputWordLowerCase = inputWord.toLowerCase();
		return inputWordLowerCase.contains(searchWord);
	}
	
	public String[] splitPhoneNumber(String phoneNumber) {
		return phoneNumber.split("-");
		
	}
	
	public static void main(String[] args) {
		Lab3 lab3 = new Lab3();
		
		System.out.println(lab3.replaceAllSpaces("Hey world"));
		System.out.println(lab3.containsWord("HELLO WOrld", "world"));
		System.out.println(Arrays.toString(lab3.splitPhoneNumber("555-123-4567")));
	}
	
}

package week1.day1;

public class PrintVowels {

	public static void main(String[] args) {
		
		String name=" google";
		
		// i need to print only vowels a,e,i,o,u
		// convert string to charcter
		// check if any of the charcter in vowel
		// if it is print orelse continue
		
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i]=='a' || charArray[i]=='e' || charArray[i]=='i' || charArray[i]=='o'||charArray[i]=='u' )
			System.out.println(charArray[i]);
			
		}
		

	}

}

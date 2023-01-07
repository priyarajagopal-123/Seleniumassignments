package week3.day2;
import java.util.ArrayList;
import java.util.List;

public class ListLetterappearedTwice {

	public static void main(String[] args) {
		/*pseudo code:
		 * pass the string and split string to character
		 * create a list with a character to store charcters
		 * use for loop to add char into list
		 * use for loop to compare the letters 
		 */
		
		String str="abccddea";
		char[] charArray=str.toCharArray();
		List<Character> char2=new ArrayList<Character>();
		for (int i = 0; i < charArray.length; i++) {
			char2.add(charArray[i]);
			
		}
		for (int j = 0; j < char2.size(); j++) {
			if(char2.get(j)==char2.get(j+1)) {
				System.out.println("the letter appaered twice is " + char2.get(j));
				break;
			}
			
		}

	}

}

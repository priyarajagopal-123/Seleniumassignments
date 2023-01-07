package week1.day1;

public class Palindrome {

	public static void main(String[] args) {
		
		String name ="Madam";
		char[] charArray = name.toCharArray();
		//name=name.toLowerCase();
		String reversestring="";
		
		for (int i = charArray.length-1; i>=0 ; i--){
			
			//System.out.print(charArray[i]);
			reversestring=reversestring+charArray[i];
		}
		System.out.println(reversestring);
		
		//if(name==reversestring) incorrect it compares the memory space
		// to ignore lower case i)converst string lowercase or use ignorecase
		
		if(name.equals(reversestring))
		{
			System.out.println("they are palindrome");
		}
		else
			System.out.println("they are not palindrome");
			
			
		
			
		}
		
	}



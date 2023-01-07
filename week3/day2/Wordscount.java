package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class Wordscount {

	public static void main(String[] args) {
		
		String name="amazpn development centre chennai";
		char[] charArray = name.toCharArray();
		Map<Character,Integer> m1=new HashMap<Character,Integer>();
		//loop through every charcter
		
		for (int i = 0; i < charArray.length; i++) {
			if (m1.containsKey(charArray[i])) {
				
				Integer existingcount= m1.get(charArray[i]);
				m1.put(charArray[i], existingcount+1);
			}
			else
			{
				m1.put(charArray[i], 1);
			
			}
		
	}
	System.out.println(m1);
	}
}

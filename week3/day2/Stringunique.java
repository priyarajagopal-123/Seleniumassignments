package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Stringunique {

	public static void main(String[] args) {
		
		String company="google";
		char [] charArray=company.toCharArray();
		Set<Character> unique=new LinkedHashSet<Character>();
		String output="";
		
		
		for (int i = 0; i < charArray.length; i++) {
			if(unique.add(charArray[i])) {
				output=output+charArray[i];
				
			}
			
		}
		System.out.println(output);
		

	}

}

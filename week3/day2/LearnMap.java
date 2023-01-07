package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

	public static void main(String[] args) {
		/*List, set interface is single dimemsional data
		 * To use 2 dimensional data-key,value pair-Map
		 * 
		 */
		
		Map<Integer,String> mentors =new  HashMap<Integer,String>();
		mentors.put(2020101,"Ram");
		mentors.put(2020202, "priya");
		mentors.put(2020203, "raj");
		mentors.put(2020204, "dev");
		mentors.put(2020202, "madhu");
		
		System.out.println(mentors.size());
		
		Set<Entry<Integer,String>> entryset =  mentors.entrySet();
		for (Entry<Integer, String> entry : entryset) {
			System.out.print(entry.getKey() +"-");
			System.out.println(entry.getValue());
			
		}
		
		

	}

}

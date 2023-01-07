package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Learlist {
	
	public static void main(String[] args)
	{
		List<String> m1=new ArrayList<String>();
		m1.add("Ram");
		m1.add("arvind");
		m1.add("five");
		m1.add("four");
		m1.add("Raj");
		System.out.println(m1.size());
		m1.remove(2);
		System.out.println(m1.size());
		m1.add("Ram");// allows duplicate
		System.out.println(m1.size());
		
		for(int i=0;i<m1.size();i++)
		{
			System.out.println(m1.get(i));
		}
		
		System.out.println(m1.contains("four"));
		//m1.clear();
		//System.out.println(m1.size());
		
		
		// convert list to array
		
		Object[] array = m1.toArray();// use of this
		System.out.println(array.length);
		
		
		Arrays.sort(array);
		System.out.println(array.toString());// use of to string
		
		
		Collections.sort(m1);
		System.out.println(m1);
	}

}

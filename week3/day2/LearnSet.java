package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashSet is faster
		Set<String> s1=new HashSet<String>();
		Boolean add1=s1.add("CTS");
		System.out.println(add1);
		s1.add("zoho");
		s1.add("TCS");
		s1.add("Wipro");
		Boolean add2=s1.add("CTS");
		System.out.println(add2);
		//System.out.println(s1.size());
		System.out.println(s1);

	}

}

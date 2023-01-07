package week3.day2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Listmaximumnumberofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pseudocode:
		 * A sentence is a list of words seperated by single space with no leading or trailing spaces.You are given a array of sentences
		 * where each sentence[i] represnt single sentence.
		 * return maximum number of words in each sentence
		 * Example:1."Alice and bob love leetcode","I think so too","this is great thanks very much"
		 * 1st sentence- 
		 */
		String [] str={"Alice and bob love leetcode","I think so too","this is great thanks very much"};
		Map<String,Integer> map1=new  TreeMap<String,Integer>();
		for (int i = 0; i < str.length; i++) {
			String[] strsplit=str[i].split("\\s");
			int strlength=strsplit.length;
			map1.put(str[i], strlength);
			
		}
		Entry<String,Integer> lastEntry=((TreeMap<String, Integer>) map1).lastEntry();// what does it mean
		System.out.println(lastEntry.getValue());
		

	}

}

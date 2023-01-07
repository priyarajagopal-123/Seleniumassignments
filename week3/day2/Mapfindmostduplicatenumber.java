package week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Mapfindmostduplicatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * pSEUDOCODE Input:abbaba Map->HashMap->String->Ch[]->Get all
		 * characters-occurence keep comparing with other values-max value
		 */
		String str = "abbabbac";
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if (map1.containsKey(charArray[i])) {
				Integer existingcount = map1.get(charArray[i]);
				map1.put(charArray[i], existingcount + 1);

			} else {
				map1.put(charArray[i], 1);
			}

		}
		//System.out.println(map1.values());

		Set<Integer> set1 = new TreeSet<Integer>(map1.values());
		List<Integer> listdata = new ArrayList<Integer>(set1);
		int setsize = set1.size();
		int setmax = listdata.get(setsize - 1);
		System.out.println(setmax);

		for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
			if (entry.getValue() == setmax) {
				System.out.println("DuplicateKey " + entry.getKey() + " most of occurence  " + entry.getValue());

			}

		}

		

	}

}

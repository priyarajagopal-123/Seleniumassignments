package week3.day2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Listnumberofoccurenceunique {

	public static void main(String[] args) {
		/*
		 * Pseudocode Input the numbers-[1,1,2,5,6,2,3,3] output should be 1 has two
		 * occurences,2 has two occurence, 3 has two occurences
		 */

		int num[] = { 1, 1, 2, 5, 6, 2, 3, 3 };

		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			if (map1.containsKey(num[i])) {
				Integer existingcount = map1.get(num[i]);
				map1.put(num[i], existingcount + 1);
			} else {
				map1.put(num[i], 1);

			}

		}

		boolean result = true;
		Set<Integer> set1 = new HashSet<Integer>();
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
			if (!(set1.add(entry.getValue()))){

				result = false;
			}
		}
		System.out.println(result);
	}
}

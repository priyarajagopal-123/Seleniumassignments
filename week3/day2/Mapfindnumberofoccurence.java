package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class Mapfindnumberofoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudocode: Input array numbers,each occurences
		 * Input:(2,3,5,6,3,2,1,4,2,1,6,-1) output :2->3 , 3->2 ,4->2, ascneding order
		 * 
		 * create map->tree map->for loop->each number add to map->if exist update with
		 * 1 else new entry with 1
		 */
		int[] num = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };
		Map<Integer, Integer> map1 = new TreeMap<Integer, Integer>();
		System.out.println(map1);
		for (int i = 0; i < num.length; i++) {
			if (map1.containsKey(num[i])) {
				int existingcount = map1.get(num[i]);
				map1.put(num[i], existingcount + 1);

			} else {
				map1.put(num[i], 1);
			}
		}
			System.out.println(map1);

		

	}
}

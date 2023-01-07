package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Listmissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pseudocode:remove the duplicates using Set,and make sure the set is in ascending order
		 * Iterate from starting number and verify next number is +1
		 *if that is not the number, print that number
		 */
		
		int [] data= {10,11,12,13,14,15,16,18,19,20};
		Set<Integer> set1=new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			set1.add(data[i]);
			
		}
		System.out.println(set1);
		List<Integer> listdata=new ArrayList<Integer>(set1);
		for (int j = 0; j < listdata.size(); j++) {
			if ((listdata.get( j + 1)-listdata.get(j))==1)
			{
				j++;
			}
			else
			{
			
			System.out.println("the missing number is " +(listdata.get(j) + 1));
			}
		}
		
	}

}

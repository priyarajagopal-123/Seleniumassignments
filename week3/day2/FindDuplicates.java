package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {2,3,4,3,8,6,7,9,9,4,5,6};
		Set<Integer> unique=new HashSet<Integer>();
		Set<Integer> duplicates=new HashSet<Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			if(!unique.add(numbers[i]))
			{
				duplicates.add(numbers[i]);
			}
			
		}
		System.out.println(unique);
		System.out.println(duplicates);

	}

}

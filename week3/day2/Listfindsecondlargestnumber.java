package week3.day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Listfindsecondlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Pseudo code:create a empty tree set and create a for loop iterator 
		 *from 0 to data.length and add into set 
		 *convert set into list
		 *print the second largest number in the list
		 */
		int [] num= { 20,25,85,74,36,45,55};
		Set<Integer> set = new TreeSet<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
			
		}
		System.out.println(set);
	List<Integer> list1=new ArrayList<Integer>(set);
	int large=list1.size();
	System.out.println("second largest number" +list1.get(large-2));
		
		
	}

}

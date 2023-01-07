package week1.day1;

import java.util.Arrays;

public class Duplicatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int []params={2,5,7,7,5,9,2,3};
		
		
		 /* 
		  * sorting the array
		  * 
		  Arrays.sort(params);
	
		  * {2,2,3,5,5,7,7,9}
		  */
		
		 
		for (int i = 0; i < params.length; i++) {
			for (int j = i+1; j < params.length; j++) {
				if (params[i]== params[j])
				{
					System.out.println(params[i]);
					break;
				}
				
			}
			
		}

	}

}

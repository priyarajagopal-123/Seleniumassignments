package week1.day1;

public class TwoSum {

	
		// TODO Auto-generated method stub
		
		/* int []nums={2,5,7,11,13,15,3,8,4}
		 * int target= 22
		 * 
		 * 
		 * Psuedo code:
		 * loop thro outerloop
		 * loop through next number
		 * add both them and compare with trget
		 */
		
	public static void main(String[] args) {
		
		 int []nums={2,5,7,11,13,15,3,8,4};
		 int target= 22;
		 
		 for (int i = 0; i < nums.length; i++) {
			 for (int j = i+1; j < nums.length; j++) {
				 
				 if(nums[i] +nums[j] ==target)
				 {
				 System.out.println(nums[i]);
				 System.out.println(nums[j]);
				 break;
				 }
				 
				
			}
			
		}
		
		

	}

}

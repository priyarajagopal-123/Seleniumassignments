package week1.day1;

public class DuplicateChar {

	private static char[] charArray;

	public static void main(String[] args) {
		
		String name = "amazon";
       char[] charArray = name.toCharArray();
       
       for (int i = 0; i < charArray.length; i++) {
    	   for (int j = i+1; j < charArray.length; j++) {
    		   
    		   if (charArray[i]==charArray[j])
    		   {
    			   System.out.println("Duplicate:" +charArray[i]);
    		   }
			
		}
		
	}

	}

}

package week1.day1;

public class FindNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Amazon has 11400 employees";
		
		// print only numbers from here
		/*
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i]>=48 && charArray[i]<=57)
			{
				System.out.println(charArray[i]);
			}
			*/
			
		String number=name.replaceAll("[^0-9]", "");
		System.out.println(number);
			
		}

	}



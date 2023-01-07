package week1.day1;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String company="hexaware";
		char excepted='e';
		int count=0;
		char[] charArray = company.toCharArray();
		for (int i = 0; i < charArray.length; i++)
		{
			if (charArray[i]==101)
			{
				count++;
			}
			
		}
		System.out.println(count);

	}

}

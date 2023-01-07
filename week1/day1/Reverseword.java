package week1.day1;

public class Reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Amazon development centre chennai";
		String lowercase=name.toLowerCase();
		String[] words=lowercase.split(" ");
	
		
		for (int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+ " ");
		}

	}

}

package week3.day1;

public class Bicycle {
	
	public String getcyclecolor()
	{
		return "black";
	}
	
	public String getcyclecolor(String whose) {
		if(whose.equals("son"))
			return "blue";
		else
			return "pink";
		
	}
	
	public String getcyclecolor(int cyclenumber) {
		if (cyclenumber==17)
			return "BB";
		else 
			return "CC";

		
	}


		
		
		
		
	
	
}

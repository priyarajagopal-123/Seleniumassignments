package week1.day1;

public class Isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1;
		boolean bprime=true;
		
		for (int i=2;i<n;i++)
		{
			if (n % i !=0)
			{
				System.out.println("not a prime");
				bprime=false;
				break;
			}
			if (bprime==true)
			{
				System.out.println("it is prime");
			}
		}

	}

}

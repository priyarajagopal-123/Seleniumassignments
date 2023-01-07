package week3.day1;

public class iPad extends IOS {
	public void WatchMovie()
	{
		System.out.println("Movie is watched");
	}
	public void WatchMovie(String orientation)
	{
		System.out.println("Landscape");
	}
	public void WatchMovie(String orientation,int timeout)
	{
		System.out.println("Portrait" );
		System.out.println("25 seconds");
	}

}

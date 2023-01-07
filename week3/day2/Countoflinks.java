package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countoflinks {
	
	public static void main(String [] args)
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/dashboard.xhtml;jsessionid=node01i53ufvp8xtdgl0nl6tis6iaz32043.node0");
		driver.manage().window().maximize();
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		WebElement second=alllinks.get(2);
		System.out.println(second.getText());
		
		for (int i = 0; i < alllinks.size(); i++) {
			WebElement ele=alllinks.get(i);
			System.out.println(ele.getText());
			
		}
		
		
	}
	

}

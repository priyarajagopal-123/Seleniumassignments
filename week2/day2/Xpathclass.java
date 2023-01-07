package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathclass {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		
		//attribute based xpath
		WebElement eleuser=driver.findElement(By.xpath("//input[@id='username']"));
				eleuser.sendKeys("Demosalesmanager");
				
				// collection based xpath
				WebElement elepwd=	driver.findElement(By.xpath("(//input[@class='inputLogin'][2])"));
					elepwd.sendKeys("crmsfa");
				
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//patial text xpath
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.close();
		
	}

}

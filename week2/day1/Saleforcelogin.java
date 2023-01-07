package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saleforcelogin {
	public static void main(String[] args) {
		String pwd="password";
		ChromeDriver driver=new ChromeDriver();
		/* to maximise window size
		Options manage=driver.manage();
		Window window= manage.window();
		window.maximize();
		*/
		
		driver.manage().window().maximize();
		
		// to write above lines in single line
		
		driver.get("https://login.salesforce.com/");
		
		// to locate a element
		WebElement eleuser=driver.findElement(By.id("username"));
		// to cal the elememt
		eleuser.sendKeys("hari.radhakrishnan@qeagle.com");
		
		// to call password element
		driver.findElement(By.id(pwd)).sendKeys("Testleaf$321");
		
		// to call login element
		WebElement elelogin = driver.findElement(By.id("Login"));
		elelogin.click();
		
		
		driver.close();
		//driver.quit();// to close all windows and tabs opened by webdriver
		
		
		
				
	}

}

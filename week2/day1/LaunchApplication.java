package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		
		String name="username";
		String pwd="password";
		/* To open a browser
		 Features of Selenium 4..6.0
		* Selenium manager:Will download the correct version of driver into local system
		 * 2. Set up the path of the driver
		 */
		//WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		/* Webdriver manager:
		 * In selenium 4.5.0 , 
		 * 
		 */
		//to locate a web element
//		WebElement eleuser =driver.findElement(By.id(name));
		driver.findElement(By.id(name)).sendKeys("Demosalesmanager");
		driver.findElement(By.id(pwd)).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		// to interact with web element
		
		//eleuser.sendKeys("Demosalesmanager");
		
	}

}

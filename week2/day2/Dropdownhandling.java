package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandling {

	public static void main(String[] args) {
		
		String name="username";
		String pwd="password";
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id(name)).sendKeys("Demosalesmanager");
		driver.findElement(By.id(pwd)).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//source drop down
		
	// to handle drop down-3 step process
		// step 1:Locate the parent element which is having <select>
		WebElement eleselect=driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//steps 2: create a object for select class and pass parent element
		Select dropdown1=new Select(eleselect);
		
		// step 3:select the value using visible text
		dropdown1.selectByVisibleText("Conference");
		
		//Industry drop down
		// steps 1:locate parent element for Industry drop down
		WebElement eleindustry=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown2=new Select (eleindustry);
		//dropdown2.selectByVisibleText("Distribution");
		dropdown2.selectByValue("IND_FINANCE");
		
		// index always strts with 0
		//ownership drop down
		// steps 1:locate parent element for Industry drop down
		
		WebElement eleowner=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown3=new Select(eleowner);
		dropdown3.selectByIndex(5);
		
		
		
		
		
		
		
		
		
		
	}

}

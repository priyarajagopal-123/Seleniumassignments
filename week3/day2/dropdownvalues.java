package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		WebElement ele1 = driver.findElement(By.xpath("//h5[text()='Which is your favorite UI Automation tool?']/following::select[1]"));
       Select dropdown=new Select(ele1);
       List<WebElement>options=dropdown.getOptions();
       System.out.println(options.size());
       
	}

}

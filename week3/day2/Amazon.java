package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_nxqtetlae_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486387378181&hvpos=&hvnetw=g&hvrand=4405404482922785383&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061995&hvtargid=kwd-296458789801&hydadcr=14452_2154371&gclid=EAIaIQobChMI6uajvIKz_AIVH5NmAh0puwjrEAAYASAAEgJFPfD_BwE");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		List<WebElement> ele1 = driver.findElements(By.className("a-price-whole"));
		List<Integer> allprices = new ArrayList<Integer>();// list is created
		for (int i = 0; i < ele1.size(); i++) {

			System.out.println(ele1.get(i).getText());
			String price = ele1.get(i).getText().replace(",", "");
			if (!price.trim().equals("")) {
				int finalprice = Integer.parseInt(price);

				if (finalprice > 0) {
					allprices.add(finalprice);
					//System.out.println(finalprice);
				}

			}
			Collections.sort(allprices);
			System.out.println("min price" + allprices.get(0));

		}

	}
}
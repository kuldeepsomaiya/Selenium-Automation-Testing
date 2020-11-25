package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class updateDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kulde\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");


		driver.get("http://spicejet.com"); //URL in the browser
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());

		//driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected();
		System.out.println(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();

		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());

		//driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
	/*	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
				System.out.println("its enabled");
				Assert.assertTrue(true);
				
		}
		else
		{
			Assert.assertTrue(false);
		}*/
	}

}

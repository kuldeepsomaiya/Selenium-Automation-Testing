package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubxs 
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kulde\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement depatureCity = driver.findElement(By.xpath("//input[@id='fromCity']"));
		depatureCity.sendKeys("MUMBAI");
		Thread.sleep(2000);
		//driver.findElement(By.id("react-autowhatever-1")).click();
		Thread.sleep(2000);
		depatureCity.sendKeys(Keys.ENTER);
		depatureCity.sendKeys(Keys.DOWN);

		

		WebElement ArrivalCity = driver.findElement(By.xpath("//input[@id='toCity']"));
		ArrivalCity.sendKeys("ahm");
		Thread.sleep(4000);
		ArrivalCity.sendKeys(Keys.ENTER);
		Thread.sleep(4000);




	}

}

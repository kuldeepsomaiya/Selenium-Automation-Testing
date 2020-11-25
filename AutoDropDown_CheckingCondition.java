package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptException;

public class AutoDropDown_CheckingCondition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kulde\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("ban");
		Thread.sleep(5000L);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";

		//	String script="return document.findElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		
		int i = 0;
		while(!text.equalsIgnoreCase("KEMPEGOWDA INTERNATIONAL AIRPORT BANGALORE")) {
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			//script="return document.findElementById(\"fromPlaceName\").value;";
			text=(String) js.executeScript(script);
			
			if(i>10) {
				
				break;
			}

		}
		
		if(i>10) {
			System.out.println("record  is not found");
		}else {
			System.out.println("record is matched");
		}
		
		System.out.println(text);
		

	}

}

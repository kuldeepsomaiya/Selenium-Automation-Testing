package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kulde\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		
		driver.get("http://spicejet.com"); //URL in the browser
		Thread.sleep(2000);

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();

		//driver.findElement(By.xpath("//(a[@value='AMD'])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		Select s =new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));

		s.selectByValue("4");
		Thread.sleep(2000);

		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();


	}

}

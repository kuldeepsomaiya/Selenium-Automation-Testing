package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Custom_date_picker {

	public Custom_date_picker() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kulde\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/default.aspx");
		//Thread.sleep("2000L");
		Thread.sleep(2000); 
	//	driver.findElement(By.id("divpaxinfo")).click();
		//Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		//s.selectByValue("4");
		//Thread.sleep(2000);

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000); 

		driver.findElement(By.xpath("//a[@value='AMD']")).click();
		Thread.sleep(2000); 

		driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
		
		while(!driver.findElement(By.cssSelector("[class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left'] div[class='ui-datepicker-title'] span[class='ui-datepicker-month']")).getText().contains("April"))
		{
			Thread.sleep(2000); 
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			//driver.findElement(By.cssSelector("[class='ui-datepicker-next.ui-corner-all'] span[class='ui-icon.ui-icon-circle-triangle-e']")).click();
		}

	}

}

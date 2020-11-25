package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kulde\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		Set <String> ids=driver.getWindowHandles();
		Iterator <String> it=ids.iterator();
		String parent = it.next();
		String child  = it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		
	}

}

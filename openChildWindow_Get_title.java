package introduction;

import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;



public class openChildWindow_Get_title {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kulde\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement footerSection = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerSection.findElements(By.tagName("a")).size());
		WebElement footerLink =footerSection.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footerLink.findElements(By.tagName("a")).size());
		
		for(int i=1;i<footerLink.findElements(By.tagName("a")).size();i++) {
			String clickLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerLink.findElements(By.tagName("a")).get(i).sendKeys(clickLink);
			Thread.sleep(5000L);

		}
		
		Set<String> abc = driver.getWindowHandles();
		Iterator <String> it=abc.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		

	}

}

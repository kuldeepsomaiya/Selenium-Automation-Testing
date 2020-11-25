package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create driver object for crome browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kulde\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("hey");
		driver.findElement(By.name("pass")).sendKeys("hello");
		driver.findElement(By.linkText("//'[@id=\"u_0_b\']")).click();
		*/
		
		//Parent child Relationship XPATH
		/*
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//div[@id='gbw']/div/div/div/div[2]/a")).click();
		*/
		//div[@id='gbw']/div/div/div/div[2]/a;
		
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.findElement(By.xpath("//li[@class='current']//following-sibling::li[2]")).click();

		
	}

}

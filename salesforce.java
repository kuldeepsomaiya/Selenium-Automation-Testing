package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kulde\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());
	/*
		driver.findElement(By.id("username")).sendKeys("hey");
		driver.findElement(By.id("password")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		driver.close();
		
	*/
		
		//USING XPATH AND CSS
	/*	
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("hello");
		driver.findElement(By.cssSelector("#pass")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
	*/
	
	//CUSTOM XPATH AND CSS GENERATOR
	/*
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");;
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("kuldeep");
		driver.findElement(By.cssSelector("input#Login")).click();
		
	*/
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("hey");
		driver.findElement(By.cssSelector("input[name*='procee']")).click();
		
	}

}

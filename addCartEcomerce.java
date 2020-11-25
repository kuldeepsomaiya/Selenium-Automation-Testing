package introduction;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addCartEcomerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kulde\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		Thread.sleep(6000);
		String[] itemNeeded= {"Cucumber","Brocolli"};
		additems(driver,itemNeeded);
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT']")).click();
		//driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
}
	


	public static void additems(WebDriver driver,String[] itemNeeded) {
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;

		for(int i=0;i<=products.size();i++) {
			String[] name=products.get(i).getText().split("-");
			String formatedText=name[0].trim();
			
			
			
			List itemList=Arrays.asList(itemNeeded);
			
			if(itemList.contains(formatedText)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==3) {
					break;
				}
	}
}
		
}

}




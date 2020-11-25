package introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Table_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kulde\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		//driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
		List<WebElement> firstCollection=driver.findElements(By.cssSelector("tr td:nth-child(1)"));
		ArrayList<String> originalList=new ArrayList<String>();
		
		for(int i=0;i<firstCollection.size();i++) {
			
			//System.out.println(firstCollection.get(i).getText());
			originalList.add(firstCollection.get(i).getText());
			
			
		}
		
		ArrayList<String> copiedList=new ArrayList<String>();
		for(int i=0;i<copiedList.size();i++) {
			copiedList.add(originalList.get(i));
			
		}
		Collections.sort(copiedList);
		Collections.reverse(copiedList);
		System.out.println("************");

		for(String s1:originalList) {
			System.out.println(s1);
		}
		
		System.out.println("************");
		for(String s2:copiedList) {
			System.out.println(s2);
		}
		Assert.assertTrue(copiedList.equals(originalList));
		
	}

}

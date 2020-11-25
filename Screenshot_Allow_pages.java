package introduction;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot_Allow_pages {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kulde\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\kulde\\OneDrive\\Desktop\\screenshot.png"));
	}

}

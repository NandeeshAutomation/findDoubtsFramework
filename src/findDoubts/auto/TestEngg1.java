package findDoubts.auto;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestEngg1 
{
	@Test
	public void myTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fireflink.com/");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js =(JavascriptExecutor)(driver);
		js.executeScript("window.open()");
		Thread.sleep(1000);
		ArrayList list = new ArrayList<>(driver.getWindowHandles());
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().window((String) list.get(1));
		Thread.sleep(1000);
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		
		
		
	}
}

package findDoubts.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggessionNadShadowRoot
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();


		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		//driver.quit();

	}

}

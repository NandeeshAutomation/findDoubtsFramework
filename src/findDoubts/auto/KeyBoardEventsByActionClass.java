package findDoubts.auto;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventsByActionClass
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);

		WebElement ele =  driver.findElement(By.xpath("//input[@name='NewsletterEmail']"));

		Actions act = new Actions(driver);

		act.keyDown(Keys.SHIFT).perform();
		ele.sendKeys("hello");
		act.keyUp(Keys.SHIFT).perform();

		Thread.sleep(2000);

		act.moveToElement(driver.findElement(By.id("newsletter-subscribe-button"))).click().perform();

		Thread.sleep(2000);

		driver.quit();

	}

}

package findDoubts.auto;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class WorkingWithRobotClass
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");

		//WebElement ele =  driver.findElement(By.xpath("//input[@name='NewsletterEmail']"));

		WebElement txt = driver.findElement(RelativeLocator.with(By.name("NewsletterEmail")).above(By.xpath("//input[@value='Subscribe']")));

		//WebElement btn = driver.findElement(RelativeLocator.with(By.id("newsletter-email")).below(By.xpath("//input[@name='NewsletterEmail']")));

		System.out.println(txt.getAttribute("id"));
		//System.out.println(txt.getAttribute("type"));

		Actions act = new Actions(driver);
		act.moveToElement(txt).click().perform();

		Robot rb = new Robot();


		rb.keyPress(KeyEvent.VK_H);
		rb.keyRelease(KeyEvent.VK_H);

		rb.keyPress(KeyEvent.VK_E);
		rb.keyRelease(KeyEvent.VK_E);

		rb.keyPress(KeyEvent.VK_L);
		rb.keyRelease(KeyEvent.VK_L);



		Thread.sleep(2000);

		driver.quit();

	}

}

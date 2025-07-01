package findDoubts.auto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KalkiFashoin_OrderTC
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://in.kalkifashion.com/");


		driver.findElement(By.xpath("(//a[@id='HeaderMenu-men']/span[text()='Men'])[1]")).click();


		Thread.sleep(1000);



		driver.quit();



	}

}

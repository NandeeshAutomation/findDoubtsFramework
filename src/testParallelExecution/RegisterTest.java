package testParallelExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest
{
	@Test(groups = "smokeTest")
	public void TC1() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://about.google/?fg=1&utm_source=google-IN&utm_medium=referral&utm_campaign=hp-header");
		Thread.sleep(3000);
		driver.close();
	}


	@Test
	public void TC2() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://store.google.com/in/?utm_source=hp_header&utm_medium=google_ooo&utm_campaign=GS100042&hl=en-IN&pli=1");
		Thread.sleep(3000);
		driver.close();
	}

	@Test
	public void TC3() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=40006");
		Thread.sleep(3000);
		driver.close();
	}

}

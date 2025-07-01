package findDoubts.auto;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadResumeInNaukari {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://resume.naukri.com/cv-submission");

		Thread.sleep(3000);

		/*WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));

		//upload.click();


		  Actions act = new Actions(driver);
		  act.moveToElement(upload).click().perform();
		  Thread.sleep(1000);


		//upload.sendKeys("‪‪C:\\Users\\Administrator\\abcd.docx");  */


		WebElement upload = driver.findElement(By.xpath("//div[@id='upload_btn_parent']/span"));
		upload.sendKeys("./Folder/uploadtest.docx");




		/*
		 * Robot rb = new Robot(); rb.keyPress(KeyEvent.VK_A);
		 * rb.keyRelease(KeyEvent.VK_A);
		 *
		 * Thread.sleep(2000);
		 *
		 * rb.keyPress(KeyEvent.VK_B); rb.keyRelease(KeyEvent.VK_B);
		 *
		 * rb.keyPress(KeyEvent.VK_C); rb.keyRelease(KeyEvent.VK_C); Thread.sleep(2000);
		 *
		 * rb.keyPress(KeyEvent.VK_DOWN); rb.keyRelease(KeyEvent.VK_DOWN);
		 *
		 * rb.keyPress(KeyEvent.VK_ENTER); rb.keyRelease(KeyEvent.VK_ENTER);
		 * Thread.sleep(2000);
		 *
		 * rb.keyPress(KeyEvent.VK_TAB); rb.keyRelease(KeyEvent.VK_TAB);
		 *
		 * rb.keyPress(KeyEvent.VK_TAB); rb.keyRelease(KeyEvent.VK_TAB);
		 * Thread.sleep(2000);
		 *
		 * rb.keyPress(KeyEvent.VK_ENTER); rb.keyRelease(KeyEvent.VK_ENTER);
		 *
		 *
		 * Thread.sleep(2000);
		 *
		 * System.out.println("done");
		 */

		Thread.sleep(5000);

		driver.quit();



	}

}

package NaveenLab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("http://demo.guru99.com/test/guru99home/");
		/*driver.switchTo().frame("a077aa5e"); 
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//body/a[1]/img[1]")).click();
		Thread.sleep(5000);
		// code for back to frame
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("No of frames in page" + size);
		Thread.sleep(5000);
		*/
		WebElement we = driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(we);
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//body/a[1]/img[1]")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}

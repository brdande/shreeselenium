package seleniumclass.scrollbar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByPixel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html/");
		 Thread.sleep(2000);
		 //WebElement Element = driver.findElement(By.xpath("//a[contains (text(),'Contact us')]"));
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1000)","");  // scroll by 1000 pixel
		 //js.executeScript("arguments[0].scrollIntoView();", Element); // scroll up to element is not found
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");   // scroll till bottom of page
		 

	}

}

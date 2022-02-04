package NaveenLab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterHandlingExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String msg = alert.getText();
		System.out.println(msg);
		if(msg.equals("Please enter a valid user name")) {
			System.out.println("Valid alert");
		}else {
			System.out.println("InValid alert");
			
		}
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#login1")).sendKeys("brd123@rediff.com");
		Thread.sleep(2000);
		driver.quit();
	}

}

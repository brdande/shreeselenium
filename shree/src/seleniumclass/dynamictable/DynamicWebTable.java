package seleniumclass.dynamictable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://stock.scriptinglogic.net/");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin"); 
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='submit' and @type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
		driver.findElement(By.xpath("//a[text()='View Customers']")).click();
		driver.findElement(By.xpath("//td[normalize-space()='Balaji Dande']/following-sibling::td/input[@id='check_box']")).click();
	}

}

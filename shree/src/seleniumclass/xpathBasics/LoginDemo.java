package seleniumclass.xpathBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

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
		/*driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Balaji Dande");
		driver.findElement(By.xpath("//input[@id='buyingrate']")).sendKeys("9922954840");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Kirkitawdi pune-24");
		driver.findElement(By.xpath("//input[@id='sellingrate']")).sendKeys("9922954840");
		driver.findElement(By.xpath("//input[@value='Add']")).click(); */
		driver.findElement(By.xpath("//a[text()='View Customers']")).click();
		//driver.findElement(By.xpath("//tr[td[text()='Balaji Dande']]/td[a[@class='table-actions-button ic-table-edit']]")).click();
		
		
}
}

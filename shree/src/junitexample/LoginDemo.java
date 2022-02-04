package junitexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginDemo {
	
	@Before
	void setUp() {
		
		 System.out.println("Before Method");
	}

	@Test
	void test() throws InterruptedException {
		System.out.println("Test");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("http://stock.scriptinglogic.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin"); 
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='submit' and @type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
		driver.findElement(By.xpath("//a[text()='View Customers']")).click();
		
	}

	
	@After
	void close() {
		
		System.out.println("After Method");
	}
}

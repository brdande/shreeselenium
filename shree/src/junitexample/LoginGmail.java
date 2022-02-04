package junitexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginGmail {
	WebDriver driver;
	
	
	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
	}
	
	
	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}
	@Test
	void myLogin() {
		driver.get("https://www.gmail.com/");
				
	}

}

package seleniumclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://stock.scriptinglogic.net/");
		driver.get("https://www.google.co.in/");
	
		
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.google.co.in/");
		/*System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());*/

	}

}

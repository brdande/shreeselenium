package NaveenLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFileObjectRepository {
	static WebDriver driver;
	public static void main(String[] args) throws IOException,InterruptedException {
		
		Properties prop = new Properties();
		FileInputStream fis = new  FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\shree\\src\\NaveenLab\\config.properties");
	    prop.load(fis);
	    
	    String browser = prop.getProperty("browser");
	    
	    if(browser.equals("Firefox")) {
	    	System.setProperty("webdriver.gecko.driver","D:\\SELENIUM\\geckodriver.exe");
			 driver = new FirefoxDriver();
	    }else if(browser.equals("chrome")) {
	    	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
	    }
	    driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String url = prop.getProperty("URL");
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("confirmpassword_xpath"))).sendKeys(prop.getProperty("confirmpassword"));
	    
		Thread.sleep(5000);
		driver.quit();

	}

}

package NaveenLab;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadXMLFileObjectRepository {
	static WebDriver driver;
	public static void main(String[] args) throws DocumentException, InterruptedException {
		
		File inputFile = new File("C:\\Users\\Admin\\eclipse-workspace\\shree\\src\\NaveenLab\\ObjectProperties.xml");
		 SAXReader saxReader = new SAXReader();					
		 Document document = saxReader.read(inputFile);
		 String url = document.selectSingleNode("//menu/url").getText();
		 String browser = document.selectSingleNode("//menu/browser").getText();
		 System.out.println(url);
		 System.out.println(browser);
		 
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
			driver.get(url);
			
			Thread.sleep(3000);
			String userNamexpath = document.selectSingleNode("//menu/username_xpath").getText(); 
			String userName = document.selectSingleNode("//menu/username").getText(); 
			driver.findElement(By.xpath(userNamexpath)).sendKeys(userName);
			String passwordCSSelector = document.selectSingleNode("//menu/passwordCSSelector").getText(); 
			String password = document.selectSingleNode("//menu/password").getText(); 
			driver.findElement(By.cssSelector(passwordCSSelector)).sendKeys(password);
			Thread.sleep(6000);
			driver.quit();
			

	}

}

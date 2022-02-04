package NaveenLab;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("http://demo.guru99.com/test/upload/");
		String filePath = "C:\\Users\\Admin\\Desktop\\Penguins.jpg";
		driver.findElement(By.cssSelector("#uploadfile_0")).sendKeys(filePath);
		Thread.sleep(2000);
		File f  = new File(filePath);
		
		System.out.println(f.length()/1024+"kb");
		String extension = "";

		int i = filePath.lastIndexOf('.');
		if (i > 0) {
		    extension = filePath.substring(i+1);
		}
		System.out.println("Extension of file  "+extension);
		Thread.sleep(2000);
		driver.quit();

	}

}

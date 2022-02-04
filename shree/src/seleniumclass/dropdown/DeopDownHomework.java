package seleniumclass.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeopDownHomework {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.click.in/pune/classifieds/60/post.html");
		driver.manage().window().maximize();
		WebElement qulification = driver.findElement(By.id("source_508"));
		
		Select selectQuali = new Select(qulification);
		Thread.sleep(4000);
		selectQuali.selectByVisibleText("B.A");
		Thread.sleep(4000);
		selectQuali.selectByVisibleText("BVSC");
		
		WebElement btnAdd = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[4]/div/div[2]/div[2]/form/div[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/img[1]"));
		btnAdd.click(); 
		WebElement addqulification = driver.findElement(By.id("fld_508"));
		Select selctquali1 = new Select(addqulification);
		Thread.sleep(4000);
		selctquali1.selectByVisibleText("B.A");
		Thread.sleep(4000);
		
		WebElement remBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[4]/div/div[2]/div[2]/form/div[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/img[2]"));
		remBtn.click();
		
}
}

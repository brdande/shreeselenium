package seleniumclass.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoMultiSetAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.click.in/pune/classifieds/60/post.html");
		driver.manage().window().maximize();
		WebElement multiSelect = driver.findElement(By.id("source_118"));
		Select sl = new Select(multiSelect);
		Thread.sleep(4000);
		sl.selectByVisibleText("Bangalore");
		Thread.sleep(4000);
		sl.selectByVisibleText("Chennai");
		Thread.sleep(4000);
		sl.selectByVisibleText("Mumbai");
		WebElement btnAdd = driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]"));
		btnAdd.click();
		WebElement cities = driver.findElement(By.id("fld_118"));
		Select selectCity = new Select(cities);
		Thread.sleep(4000);
		selectCity.selectByVisibleText("Bangalore");
		Thread.sleep(4000);
		selectCity.selectByVisibleText("Mumbai");
		Thread.sleep(4000);
		WebElement btnRemove = driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]"));
		btnRemove.click();

	}

}

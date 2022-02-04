package junitexample;


import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginJunit1 {


    static  WebDriver driver;

    @BeforeClass // method below this annotation will run before first test method of the class
    public static  void openBrowser()
    {
    	System.out.println("Before class");
    	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before
    public void beforeMethod() {
    	System.out.println("Before Method");
    }
    @After
    public void afterMethod() {
    	System.out.println("After Method");
    }

    @AfterClass // method below this annotation will run after last test method of the class
    public static  void closeBrowser() throws InterruptedException {
    	System.out.println("After class");
        Thread.sleep(4000);
        driver.close();
    }

    @Test
    public void myTest1() {
    	System.out.println("Test");
        driver.get("http://stock.scriptinglogic.net");
        driver.findElement(By.cssSelector("#login-username")).sendKeys("admin"); // #login-username
        driver.findElement(By.cssSelector("#login-password")).sendKeys("admin"); // #login-password
       driver.findElement(By.cssSelector(".blue")).click(); // .blue

    }

  /*  @Test
    public void myTest2() {

        driver.get("http://stock.scriptinglogic.net");
        driver.findElement(By.cssSelector("#login-username")).sendKeys("545"); // #login-username
        driver.findElement(By.cssSelector("#login-password")).sendKeys("dsds"); // #login-password
        driver.findElement(By.cssSelector(".blue")).click(); // .blue

    }

    @Test
    public void myTest3() {

        driver.get("http://stock.scriptinglogic.net");
        driver.findElement(By.cssSelector("#login-username")).sendKeys(""); // #login-username
        driver.findElement(By.cssSelector("#login-password")).sendKeys(""); // #login-password
        driver.findElement(By.cssSelector(".blue")).click(); // .blue

    }*/
}
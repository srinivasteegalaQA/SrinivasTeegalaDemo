package GeniricUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import responsiveEDObjectRepo.loginPage;

public class BaseClass {
	
	public WebDriver driver= null;
	propertiesGeniricUtility p = new propertiesGeniricUtility();
	
	@BeforeSuite
	public void connectionwithdatabase()
	{
		System.out.println("connetion establish successfully");
	}
	@BeforeClass
	public void lanchbrowser() throws Exception
	{
		String URL = p.getDataFromFile("url");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(URL);
		System.out.println("browser launching successfully");
	}
	@BeforeMethod
	public void loginoperation() throws Exception
	{
		String USERNAME = p.getDataFromFile("userlogin");
		String PASSWORD = p.getDataFromFile("password");
//		WebElement login = driver.findElement(By.xpath("//input[@formcontrolname='uname']"));
//		login.sendKeys(USERNAME , Keys.TAB , PASSWORD,Keys.ENTER);
		loginPage page = new loginPage(driver);
		page.LoginApp(USERNAME, PASSWORD);
		System.out.println("login done successfully");
		Thread.sleep(2000);;
	}
	@AfterMethod
	public void logoutoperation() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=\"mat-mdc-button-touch-target\"])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
		System.out.println("logout done successfully");
	}
	@AfterClass
	public void closewindow()
	{
		driver.quit();
		System.out.println("window close successfully");
	}
	@AfterSuite
	public void closeconnectionwithdatabase()
	{
		System.out.println("connection close successfully");
	}	

}

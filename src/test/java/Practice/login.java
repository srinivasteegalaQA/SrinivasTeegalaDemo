package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GeniricUtility.propertiesGeniricUtility;

@Listeners(GeniricUtility.ImplementaionClass.class)
public class login {

	@Test
	public void m() throws Exception
	{
				propertiesGeniricUtility p = new propertiesGeniricUtility();
				String USERNAME = p.getDataFromFile("userlogin");
				String PASSWORD = p.getDataFromFile("password");
				String URL = p.getDataFromFile("url");
				System.out.println(USERNAME);
				System.out.println(URL);
				System.out.println(PASSWORD);
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(URL);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement login = driver.findElement(By.id("mat-input-0"));
				login.sendKeys(USERNAME , Keys.TAB , PASSWORD);
				driver.findElement(By.xpath("//span[text()=' Sign In ']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class=\"mat-mdc-button-touch-target\"])[5]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//span[text()='Logout']")).click();
				
	}
}

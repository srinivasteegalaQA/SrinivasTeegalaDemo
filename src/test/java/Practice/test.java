package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class test {

	@Test
	public void SS() throws Exception 
	{
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demosales.learningchain.in/");
		WebElement e= driver.findElement(By.name("username"));
		e.sendKeys("DemoUser" , Keys.TAB , "Admin@123",Keys.ENTER);
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("//a[text()='Certificates ']"));
		Actions act = new Actions(driver);
		act.moveToElement(e1).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Certificates ']/following-sibling::ul/li[2]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Dashboard ']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}

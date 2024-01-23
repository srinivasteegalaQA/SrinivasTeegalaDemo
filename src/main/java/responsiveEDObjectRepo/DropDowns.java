package responsiveEDObjectRepo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDowns {
	@FindBy(xpath = "//span[text()='Users']")
	private WebElement UserLnk;

	public DropDowns(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
 
 
	public WebElement getUserLnk() {
		return UserLnk;
	}

	public void UsersDropDwnHandle(WebDriver driver) throws Exception
	{
		UserLnk.click();
//		driver.findElement(By.xpath("//*[text()='"+Instituiton+"']")).click();
//		driver.findElement(By.xpath("//*[text()='Demo sis school']")).click();
		
//		driver.findElement(By.xpath("//span[text()='Users']")).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-label[text()='Institutions:']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sapphirus School']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//mat-label[text()=\"Role's:\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Administrator']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-label[text()='Enrollment Status:']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='All']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-label[text()='Search By:']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//span[text()='All'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='GO']")).click();
		Thread.sleep(2000);

	}
	public void pagedown() throws Exception
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
	}

 
}

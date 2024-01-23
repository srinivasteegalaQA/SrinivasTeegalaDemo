package test55;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GeniricUtility.BaseClass;
import responsiveEDObjectRepo.DropDowns;

public class viewuser extends BaseClass {

	@Test(alwaysRun = true,priority = 5)
	public void viewUserDetails() throws Exception
	{
		DropDowns dp = new DropDowns(driver);
		dp.UsersDropDwnHandle(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search User']")).sendKeys("srinivas07");
		Thread.sleep(1000);
		dp.pagedown();
		driver.findElement(By.xpath("//i-tabler[@name='eye']/..")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-icon[text()='close']/..")).click();
		Thread.sleep(2000);
	}
}

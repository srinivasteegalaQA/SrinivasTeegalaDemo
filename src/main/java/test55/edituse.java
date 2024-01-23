package test55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GeniricUtility.BaseClass;
import responsiveEDObjectRepo.DropDowns;

public class edituse extends BaseClass{

	@Test(alwaysRun = true,priority = 4)
	public void editUserDetails() throws Exception {
		DropDowns dp = new DropDowns(driver);
		dp.UsersDropDwnHandle(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search User']")).sendKeys("srinivas07");
		Thread.sleep(1000);
		dp.pagedown();
		driver.findElement(By.xpath("//i-tabler[@name='edit']/..")).click();
		Thread.sleep(2000);
		WebElement middleN= driver.findElement(By.xpath("//input[@formcontrolname='middle_name']"));
		middleN.click();
		middleN.sendKeys("ss");
		Thread.sleep(4000);
		//		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//span[text()='Close']")).click();
	}
}

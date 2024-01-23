package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GeniricUtility.BaseClass;
import responsiveEDObjectRepo.DropDowns;
import responsiveEDObjectRepo.user;

public class userManagement extends BaseClass{
	
	//Verify the functionality of all drop downs.
	@Test(alwaysRun = true,priority = 1)
	public void allDropDownsHandlingGoButton() throws Exception
	{
		DropDowns dp = new DropDowns(driver);
		dp.UsersDropDwnHandle(driver);
	}
	
	//Search for a particular user in the user management page.
		@Test(alwaysRun = true,priority = 2)
		public void SearchForAParticularUser() throws Exception {
			DropDowns dp = new DropDowns(driver);
			dp.UsersDropDwnHandle(driver);
			Thread.sleep(2000);
			user u = new user(driver);
			u.getSearchUserText().sendKeys("srinivas07");
//			driver.findElement(By.xpath("//input[@placeholder='Search User']")).sendKeys("srinivas07");
			Thread.sleep(1000);
			dp.pagedown();
			dp.pagedown();
		}

		//Create a new user on the user management page.
		@Test(alwaysRun = true,priority = 3)
		public void createUser() throws Throwable
		{
			user ss = new user(driver);
			ss.createUserAll(driver);
		}
		
		//Edit user details on the user management page.
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
			driver.findElement(By.xpath("//span[text()='Save']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='OK']")).click();
			
			//		driver.findElement(By.xpath("//span[text()='Close']")).click();
		}
		
		//View specific user details on the user management page.
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

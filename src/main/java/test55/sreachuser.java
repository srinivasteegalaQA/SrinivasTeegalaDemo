package test55;

import org.testng.annotations.Test;

import GeniricUtility.BaseClass;
import responsiveEDObjectRepo.DropDowns;
import responsiveEDObjectRepo.user;

public class sreachuser extends BaseClass {

	@Test(alwaysRun = true,priority = 2)
	public void SearchForAParticularUser() throws Exception {
		DropDowns dp = new DropDowns(driver);
		dp.UsersDropDwnHandle(driver);
		Thread.sleep(2000);
		user u = new user(driver);
		u.getSearchUserText().sendKeys("srinivas07");
		//		driver.findElement(By.xpath("//input[@placeholder='Search User']")).sendKeys("srinivas07");
		Thread.sleep(1000);
		dp.pagedown();
		dp.pagedown();
		Thread.sleep(2000);
	}

}

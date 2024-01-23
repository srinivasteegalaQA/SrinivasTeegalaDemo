package test55;

import org.testng.annotations.Test;

import GeniricUtility.BaseClass;
import responsiveEDObjectRepo.DropDowns;

public class allDropDown extends BaseClass{

	@Test(alwaysRun = true,priority = 1)
	public void allDropDownsHandlingGoButton() throws Exception
	{
		DropDowns dp = new DropDowns(driver);
		dp.UsersDropDwnHandle(driver);
	}
}

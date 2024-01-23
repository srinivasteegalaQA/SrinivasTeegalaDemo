package test55;

import org.testng.annotations.Test;

import GeniricUtility.BaseClass;
import responsiveEDObjectRepo.user;

public class createUser extends BaseClass{

	@Test
	
	public void createUsert() throws Throwable
	{
		user ss = new user(driver);
		ss.createUserAll(driver);
		Thread.sleep(2000);
		
	}
}

package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import GeniricUtility.BaseClass;
import GeniricUtility.RandomStringGenerator;
import GeniricUtility.excelGeniricUtillity;
import GeniricUtility.randomnum;
import responsiveEDObjectRepo.user;

public class createUser extends BaseClass {
	
	@Test
	public void rr() throws Throwable
	{
		user ss = new user(driver);
		ss.createUserAll(driver);
	}
//	public randomnum r = new randomnum();
//	int num=r.getRandomNumber();
//	int length =5;
//	String ran=RandomStringGenerator.generateRandomString(length);
//
//	@Test
//	public void createUserAll() throws Throwable {
//		excelGeniricUtillity ex = new excelGeniricUtillity();
//		String Institution = ex.getDataFromExcel("User", 2, 0);
//		String Role = ex.getDataFromExcel("User", 2, 1);
//		String lastName = ex.getDataFromExcel("User", 2, 2);
//		String MiddleName = ex.getDataFromExcel("User", 2, 3);
//		String FirstName = ex.getDataFromExcel("User", 2, 4);
//		String Email = ex.getDataFromExcel("User", 2, 5);
//		String UserName = ex.getDataFromExcel("User", 2, 6);
//		String Suffix = ex.getDataFromExcel("User", 2, 7);
//		String TimeZoneID = ex.getDataFromExcel("User", 2, 8);
//		String Gender = ex.getDataFromExcel("User", 2, 9);
//		String NickName = ex.getDataFromExcel("User", 2, 10);
//		String Password = ex.getDataFromExcel("User", 2, 11);
//		Thread.sleep(2000);
//		user u = new user(driver);
////		u.getSearchUserText().click();
//		u.getUserLink().click();
//		u.getCreateBtn().click();
//		u.getInstitutinDropDown().click();
//		driver.findElement(By.xpath("//span[text()='"+Institution+"']")).click();
//		u.getRoleDropDown().click();
//		driver.findElement(By.xpath("//span[text()='"+Role+"']")).click();
//		u.getLastName().click();
//		u.getLastName().sendKeys(lastName+ran);
//		u.getMiddleName().click();
//		u.getMiddleName().sendKeys(MiddleName+ran);
//		u.getFirstName().click();
//		u.getFirstName().sendKeys(FirstName+ran);
//		u.getEmail().click();
//		u.getEmail().sendKeys(Email+num+"@gmail.com");
//		u.getUserName().click();
//		u.getUserName().sendKeys(UserName+num);
//		WebElement date = driver.findElement(By.xpath("//*[name()='svg' and @fill=\"currentColor\"]"));
//		Actions act = new Actions(driver);
//		act.moveToElement(date).click().build().perform();
//		WebElement date2 = driver.findElement(By.xpath("//span[text()=' 4 ']/.."));
//		act.moveToElement(date2).click().build().perform();
//		u.getSufixDropDown().click();
//		driver.findElement(By.xpath("//span[text()='"+Suffix+"']")).click();
//		u.getTimeIDDropDown().click();
//		driver.findElement(By.xpath("//span[text()='"+TimeZoneID+"']")).click();
//		u.getGenderDropDown().click();
//		driver.findElement(By.xpath("//span[text()='"+Gender+"']")).click();
//		u.getNickName().click();
//		u.getNickName().sendKeys(NickName+num);
//		u.getPassWord().click();
//		u.getPassWord().sendKeys(Password);
//		u.getReEnterPassWord().click();
//		u.getReEnterPassWord().sendKeys(Password);
//		u.getCreateUserBtn().click();
////		u.getCreateUserOKBtn().click();
//		u.getCreateUserOKBtn().click();
//		
//		
//		
//		
//	}
}

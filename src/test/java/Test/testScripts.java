package Test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GeniricUtility.BaseClass;
import GeniricUtility.RandomStringGenerator;
import GeniricUtility.excelGeniricUtillity;
import GeniricUtility.randomnum;
import responsiveEDObjectRepo.DropDowns;

@Listeners(GeniricUtility.ImplementaionClass.class)
public class testScripts extends BaseClass{

	public randomnum r = new randomnum();
	int num=r.getRandomNumber();
	int length =5;
	String ran=RandomStringGenerator.generateRandomString(length);

	@Test(alwaysRun = true,priority = 1)
	public void allDropDownsHandlingGoButton() throws Exception
	{
		Thread.sleep(2000);;
		driver.findElement(By.xpath("//span[text()='Users']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-label[text()='Institutions:']")).click();
		driver.findElement(By.xpath("//span[text()='ResponsiveEd Institution']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-label[text()=\"Role's:\"]")).click();
		driver.findElement(By.xpath("//span[text()='Administrator']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-label[text()='Enrollment Status:']")).click();
		driver.findElement(By.xpath("//span[text()='All']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-label[text()='Search By:']")).click();
		driver.findElement(By.xpath("(//span[text()='All'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='GO']")).click();
		Thread.sleep(4000);
	}

	@Test(alwaysRun = true,priority = 2)
	public void SearchForAParticularUser() throws Exception {
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='Users']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-label[text()='Institutions:']")).click();
		driver.findElement(By.xpath("//span[text()='All']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-label[text()=\"Role's:\"]")).click();
		driver.findElement(By.xpath("(//span[text()='All'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-label[text()='Enrollment Status:']")).click();
		driver.findElement(By.xpath("(//span[text()='All'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-label[text()='Search By:']")).click();
		driver.findElement(By.xpath("(//span[text()='All'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='GO']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search User']")).sendKeys("srinivas33");
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
	}

	@Test(alwaysRun = true,priority = 3)
	public void createNewUser() throws Exception 
	{
		Thread.sleep(6000);
		excelGeniricUtillity ex = new excelGeniricUtillity();
		String Institution = ex.getDataFromExcel("User", 2, 0);
		String Role = ex.getDataFromExcel("User", 2, 1);
		String lastName = ex.getDataFromExcel("User", 2, 2);
		String MiddleName = ex.getDataFromExcel("User", 2, 3);
		String FirstName = ex.getDataFromExcel("User", 2, 4);
		String Email = ex.getDataFromExcel("User", 2, 5);
		String UserName = ex.getDataFromExcel("User", 2, 6);
		String Suffix = ex.getDataFromExcel("User", 2, 7);
		String TimeZoneID = ex.getDataFromExcel("User", 2, 8);
		String Gender = ex.getDataFromExcel("User", 2, 9);
		String NickName = ex.getDataFromExcel("User", 2, 10);
		String Password = ex.getDataFromExcel("User", 2, 11);
		Thread.sleep(2000);;
		driver.findElement(By.xpath("//span[text()='Users']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-label[text()=\"Institution's:\"]")).click();
		driver.findElement(By.xpath("//span[text()='"+Institution+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//mat-label[text()=\"Role's:\"])[2]")).click();
		driver.findElement(By.xpath("//span[text()='"+Role+"']")).click();
		Thread.sleep(1000);
		WebElement lastname = driver.findElement(
				By.xpath("//mat-label[text()='Last Name']/../../../../div[2]/input"));
		lastname.click();
		Thread.sleep(1000);
		lastname.sendKeys(lastName+ran);
		Thread.sleep(1000);
		WebElement middlename = driver.findElement(
				By.xpath("//mat-label[text()='Middle Name']/../../../../div[2]/input"));
		middlename.click();
		Thread.sleep(1000);
		middlename.sendKeys(MiddleName+ran);
		Thread.sleep(1000);
		WebElement firstname = driver.findElement(
				By.xpath("//mat-label[text()='First Name']/../../../../div[2]/input"));
		firstname.click();
		Thread.sleep(1000);
		firstname.sendKeys(FirstName+ran);
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath
				("//mat-label[text()='Email']/../../../../div[2]/input"));
		email.click();
		Thread.sleep(1000);
		email.sendKeys(Email+num+"@gmail.com");
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.xpath
				("//mat-label[text()='UserName']/../../../../div[2]/input"));
		username.click();
		Thread.sleep(1000);
		username.sendKeys(UserName+num);
		Thread.sleep(1000);
		WebElement date = driver.findElement(By.xpath("//*[name()='svg' and @fill=\"currentColor\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(date).click().build().perform();
		WebElement date2 = driver.findElement(By.xpath("//span[text()=' 4 ']/.."));
		act.moveToElement(date2).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-label[text()='Suffix']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='"+Suffix+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-label[text()='Timezone ID']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='"+TimeZoneID+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-label[text()='Gender']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='"+Gender+"']")).click();
		Thread.sleep(1000);
		WebElement nickname = driver.findElement(By.xpath
				("//mat-label[text()='Nick Name']/../../../../div[2]/input"));
		nickname.click();
		Thread.sleep(1000);
		nickname.sendKeys(NickName+num);
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.xpath
				("//mat-label[text()='Password']/../../../../div[2]/input"));
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		WebElement reenterpassword = driver.findElement(By.xpath
				("//mat-label[text()='Re-enter Password']/../../../../div[2]/input"));
		reenterpassword.click();
		Thread.sleep(1000);
		reenterpassword.sendKeys(Password);
		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//mat-icon[text()='close']/..")).click();
		driver.findElement(By.xpath("//span[text()='Close']")).click();
	}

	@Test(alwaysRun = true,priority = 4)
	public void editUserDetails() throws Exception {
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='Users']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-label[text()='Institutions:']")).click();
		driver.findElement(By.xpath("//span[text()='Sapphirus School']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-label[text()=\"Role's:\"]")).click();
		driver.findElement(By.xpath("//span[text()='Administrator']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-label[text()='Enrollment Status:']")).click();
		driver.findElement(By.xpath("//span[text()='All']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-label[text()='Search By:']")).click();
		driver.findElement(By.xpath("(//span[text()='All'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='GO']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search User']")).sendKeys("srinivas07");
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//i-tabler[@name='edit']/..")).click();
		Thread.sleep(2000);
		WebElement middleN= driver.findElement(By.xpath("//input[@formcontrolname='middle_name']"));
		middleN.click();
		middleN.sendKeys("ss");
		Thread.sleep(4000);
		//	    driver.findElement(By.xpath("//span[text()='Save']")).click();
		//	    Thread.sleep(2000);
		//	    driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//span[text()='Close']")).click();
	}

	@Test(alwaysRun = true,priority = 5)
	public void viewUserDetails() throws Exception
	{
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("//span[text()='Users']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//mat-label[text()='Institutions:']")).click();
//		driver.findElement(By.xpath("//span[text()='All']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//mat-label[text()=\"Role's:\"]")).click();
//		driver.findElement(By.xpath("(//span[text()='All'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//mat-label[text()='Enrollment Status:']")).click();
//		driver.findElement(By.xpath("(//span[text()='All'])[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//mat-label[text()='Search By:']")).click();
//		driver.findElement(By.xpath("(//span[text()='All'])[4]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[text()='GO']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@placeholder='Search User']")).sendKeys("srinivas44");
//		Thread.sleep(1000);
		
		/*
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='Users']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-label[text()='Institutions:']")).click();
		driver.findElement(By.xpath("//span[text()='Sapphirus School']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-label[text()=\"Role's:\"]")).click();
		driver.findElement(By.xpath("//span[text()='Administrator']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-label[text()='Enrollment Status:']")).click();
		driver.findElement(By.xpath("//span[text()='All']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-label[text()='Search By:']")).click();
		driver.findElement(By.xpath("(//span[text()='All'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='GO']")).click();
		Thread.sleep(2000);
		*/
		//drop down
		
		DropDowns dp = new DropDowns(driver);
		dp.UsersDropDwnHandle(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search User']")).sendKeys("srinivas07");
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//i-tabler[@name='eye']/..")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' Add ']/..")).click();
//		driver.findElement(By.xpath("//mat-label[text()='Select Institution:']/../../../../div[2]/mat-select")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' sapphiruss ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-label[text()='Select Roles:']/../../../../div[2]/mat-select")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Editor']/..")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-label[text()='Select Roles:']/../../../../div[2]/mat-select")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@mattooltip=\"save\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//mat-icon[text()='close']/..")).click();
		Thread.sleep(2000);
	}
}

package responsiveEDObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeniricUtility.RandomStringGenerator;
import GeniricUtility.excelGeniricUtillity;
import GeniricUtility.randomnum;

public class user {
	
	@FindBy(xpath = "//input[@placeholder='Search User']")
	private WebElement searchUserText;
	
	@FindBy(xpath = "//span[text()='Users']")
	private WebElement userLink;
	
	@FindBy(xpath = "//span[text()='Create']")
	private WebElement createBtn;
	
	@FindBy(xpath = "//mat-label[text()=\"Institution's:\"]")
	private WebElement institutinDropDown;
	
//	@FindBy(xpath = "//span[text()='\"+Institution+\"']")
//	private WebElement institutinName;
	
	@FindBy(xpath = "(//mat-label[text()=\"Role's:\"])[2]")
	private WebElement roleDropDown;
	
//	@FindBy(xpath = "//span[text()='"+Role+"']")
//	private WebElement roleName;
	
	@FindBy(xpath = "//mat-label[text()='Last Name']/../../../../div[2]/input")
	private WebElement lastName;
	
	@FindBy(xpath = "//mat-label[text()='Middle Name']/../../../../div[2]/input")
	private WebElement middleName;
	
	@FindBy(xpath = "//mat-label[text()='First Name']/../../../../div[2]/input")
	private WebElement firstName;
	
	@FindBy(xpath = "//mat-label[text()='Email']/../../../../div[2]/input")
	private WebElement Email;
	
	@FindBy(xpath = "//mat-label[text()='UserName']/../../../../div[2]/input")
	private WebElement userName;
	
	@FindBy(xpath = "//*[name()='svg' and @fill=\"currentColor\"]")
	private WebElement date;
	
	@FindBy(xpath = "//span[text()=' 4 ']/..")
	private WebElement SelectDate;
	
	
	@FindBy(xpath = "//mat-label[text()='Suffix']")
	private WebElement sufixDropDown;
	
//	@FindBy(xpath = "//span[text()='"+Suffix+"']")
//	private WebElement sufixValue;
	
	@FindBy(xpath = "//mat-label[text()='Timezone ID']")
	private WebElement timeIDDropDown;
	
//	@FindBy(xpath = "//span[text()='\"+TimeZoneID+\"']")
//	private WebElement stimeIDVAlue;
	
	@FindBy(xpath = "//mat-label[text()='Gender']")
	private WebElement genderDropDown;
	
//	@FindBy(xpath = "//span[text()='\"+Gender+\"']")
//	private WebElement genderValue;
	
	@FindBy(xpath = "//mat-label[text()='Nick Name']/../../../../div[2]/input")
	private WebElement nickName;
	@FindBy(xpath = "//mat-label[text()='Password']/../../../../div[2]/input")
	private WebElement passWord;
	@FindBy(xpath = "//mat-label[text()='Re-enter Password']/../../../../div[2]/input")
	private WebElement reEnterPassWord;
	
	@FindBy(xpath = "(//span[text()='Create'])[2]")
	private WebElement createUserBtn;
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement createUserOKBtn;
	
	
	
	public user(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public WebElement getSearchUserText() {
		return searchUserText;
	}



	public WebElement getUserLink() {
		return userLink;
	}



	public WebElement getCreateBtn() {
		return createBtn;
	}



	public WebElement getInstitutinDropDown() {
		return institutinDropDown;
	}



	public WebElement getRoleDropDown() {
		return roleDropDown;
	}



	public WebElement getLastName() {
		return lastName;
	}



	public WebElement getMiddleName() {
		return middleName;
	}



	public WebElement getFirstName() {
		return firstName;
	}



	public WebElement getEmail() {
		return Email;
	}



	public WebElement getUserName() {
		return userName;
	}



	public WebElement getDate() {
		return date;
	}



	public WebElement getSelectDate() {
		return SelectDate;
	}



	public WebElement getSufixDropDown() {
		return sufixDropDown;
	}



	public WebElement getTimeIDDropDown() {
		return timeIDDropDown;
	}



	public WebElement getGenderDropDown() {
		return genderDropDown;
	}



	public WebElement getNickName() {
		return nickName;
	}



	public WebElement getPassWord() {
		return passWord;
	}



	public WebElement getReEnterPassWord() {
		return reEnterPassWord;
	}



	public WebElement getCreateUserBtn() {
		return createUserBtn;
	}



	public WebElement getCreateUserOKBtn() {
		return createUserOKBtn;
	}


	public void createUserAll(WebDriver driver) throws Throwable {
		randomnum rw = new randomnum();
		int num=rw.getRandomNumber();
		int length =5;
		String ran=RandomStringGenerator.generateRandomString(length);
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
		Thread.sleep(2000);
		user u = new user(driver);
//		u.getSearchUserText().click();
		u.getUserLink().click();
		u.getCreateBtn().click();
		Thread.sleep(2000);
		u.getInstitutinDropDown().click();
		driver.findElement(By.xpath("//span[text()='"+Institution+"']")).click();
		Thread.sleep(2000);
		u.getRoleDropDown().click();
		driver.findElement(By.xpath("//span[text()='"+Role+"']")).click();
		Thread.sleep(2000);
		u.getLastName().click();
		u.getLastName().sendKeys(lastName+ran);
		Thread.sleep(2000);
		u.getMiddleName().click();
		u.getMiddleName().sendKeys(MiddleName+ran);
		Thread.sleep(2000);
		u.getFirstName().click();
		u.getFirstName().sendKeys(FirstName+ran);
		Thread.sleep(2000);
		u.getEmail().click();
		u.getEmail().sendKeys(Email+num+"@gmail.com");
		Thread.sleep(2000);
		u.getUserName().click();
		u.getUserName().sendKeys(UserName+num);
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//*[name()='svg' and @fill=\"currentColor\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(date).click().build().perform();
		Thread.sleep(1000);
		WebElement date2 = driver.findElement(By.xpath("//span[text()=' 4 ']/.."));
		act.moveToElement(date2).click().build().perform();
		Thread.sleep(2000);
		u.getSufixDropDown().click();
		driver.findElement(By.xpath("//span[text()='"+Suffix+"']")).click();
		Thread.sleep(2000);
		u.getTimeIDDropDown().click();
		driver.findElement(By.xpath("//span[text()='"+TimeZoneID+"']")).click();
		Thread.sleep(2000);
		u.getGenderDropDown().click();
		driver.findElement(By.xpath("//span[text()='"+Gender+"']")).click();
		Thread.sleep(2000);
		u.getNickName().click();
		u.getNickName().sendKeys(NickName+num);
		Thread.sleep(2000);
		u.getPassWord().click();
		u.getPassWord().sendKeys(Password);
		Thread.sleep(2000);
		u.getReEnterPassWord().click();
		u.getReEnterPassWord().sendKeys(Password);
		Thread.sleep(2000);
//		u.getCreateUserBtn().click();
//		Thread.sleep(2000);
//		u.getCreateUserOKBtn().click();
//		Thread.sleep(2000);
//		u.getCreateUserOKBtn().click();
		Thread.sleep(2000);
		
		
		
		
	}
	
	
	
}

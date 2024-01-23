package responsiveEDObjectRepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	
	@FindBy(xpath = "//input[@formcontrolname='uname']")
	private WebElement userNameText;
	
	@FindBy(xpath = "//input[@formcontrolname='password']")
	private WebElement passwordText;
	
	@FindBy(xpath = "//span[text()=' Sign In ']")
	private WebElement loginBtn;
	
	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getUserName() {
		return userNameText;
	}

	public WebElement getPasswordEdt() {
		return passwordText;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	public void LoginApp(String UserName,String password)
	{
		userNameText.sendKeys(UserName);
		passwordText.sendKeys(password);
		loginBtn.click();
	}
	
	

}
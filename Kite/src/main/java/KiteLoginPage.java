import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
@FindBy (xpath ="//img[@alt='Kite']")
private WebElement logo;
@FindBy (xpath ="//input[@label='User ID']")
private WebElement userID;
@FindBy (xpath ="//input[@type='password']")
private WebElement passWord;
@FindBy (xpath ="//button[@type='submit']")
private WebElement loginButton;
@FindBy (xpath ="//a[@href='/forgot']")
private WebElement forgotPassword;
@FindBy (xpath ="//a[@class='text-light']")
private WebElement signUp;
@FindBy (xpath="//input[@type='password']")
private WebElement pin;
public void checkLogo() 
{
	logo.isDisplayed();
}
public void enterID() 
{
	userID.sendKeys("DV1510");
}
public void enterPassword() 
{
	passWord.sendKeys("Vijay@123");
}
public void clickLoginButton() 
{
	loginButton.click();
}
public void enterPin()
{
	pin.sendKeys("959594");
}



public KiteLoginPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

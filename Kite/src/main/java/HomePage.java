import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy (xpath ="//div[@class='avatar']")
	private WebElement userprofile;
	
	@FindBy (xpath ="//a[@href='/logout']")
	private WebElement logOutButton;
	
	
	
	public void userProfile()
	{
		userprofile.click();	
	}
	public void clickLogout()
	{
		logOutButton.click();
	}


	public HomePage(WebDriver driver1) 
	{
		PageFactory.initElements(driver1, this);
	}
	
	
}

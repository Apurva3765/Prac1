package TestPack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class KiteLoginTest 
{   private WebDriver driver;
	
private KiteLoginPage kiteLoginPage ;



/*private KiteLoginPage kiteLoginPage;
	private HomePage homePage;
	*/
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\apurv\\selenium db\\chromedriver.exe");
		driver = new ChromeDriver();	 
	}
	
	@BeforeMethod
	public void launchURl() throws InterruptedException
	{ 	
		Thread.sleep(3000);
	driver.get("https://kite.zerodha.com");
	@SuppressWarnings("unused")
	
	KiteLoginPage kiteLoginPage = new KiteLoginPage(driver);
	@SuppressWarnings("unused")
	HomePage homePage= new HomePage(driver);
	}
	@Test
	public void login() throws InterruptedException
	{Thread.sleep(3000);
		kiteLoginPage.checkLogo();
		kiteLoginPage.enterID();
		kiteLoginPage.enterPassword();
		Thread.sleep(3000);
		kiteLoginPage.clickLoginButton();
		Thread.sleep(3000);
		kiteLoginPage.enterPin();
	}
	@AfterMethod
	public void logOut()
	{
	homePage.userProfile();
	homePage.clickLogout();
	System.out.println("Logged Out Succesfully");
	}
	@AfterClass
	public void exitBrowser() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
		
	}

}

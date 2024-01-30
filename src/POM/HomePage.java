package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generics.BasePage;

public class HomePage extends BasePage
	{
	public WebDriver driver;
	 
	@FindBy(id = "logoutLink")
	private WebElement logountLink;
	@FindBy (xpath="(//div[@class='svgNavigationContainer'])[2]")
	private	WebElement taskBarLink;
	

	public  HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void taskBarMethod() throws Exception
	
	{
		waitVisibilityofElement(driver, taskBarLink);
		javascriptHighlightElement(driver, taskBarLink);
		javascriptClick(driver, taskBarLink);
	}
	public void logoutMethod() throws InterruptedException
	{
		waitVisibilityofElement(driver, logountLink);
		javascriptHighlightElement(driver, logountLink);
		javascriptClick(driver, logountLink);
	}
	}

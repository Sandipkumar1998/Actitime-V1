package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;


public class ActitimeLoginPage extends BasePage implements AutoConstant
{
	public WebDriver driver;

	@FindBy(id = "username")
	private WebElement usernameTextfield;

	@FindBy(name = "pwd")
	private WebElement passwordTextfield;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	public ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void loginMethod() throws InterruptedException, IOException
	{

		waitVisibilityofElement(driver, usernameTextfield);
		javascriptHighlightElement(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getStringTypeCellData(sheet_login, 1, 0));

		waitVisibilityofElement(driver, passwordTextfield); 
		javascriptHighlightElement(driver, passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getStringTypeCellData(sheet_login, 1, 1));

		waitVisibilityofElement(driver, keepmeloggedinCheckbox);
		javascriptHighlightElement(driver, keepmeloggedinCheckbox);
		javascriptClick(driver, keepmeloggedinCheckbox);

		waitVisibilityofElement(driver, loginButton);
		javascriptHighlightElement(driver, loginButton);
		javascriptClick(driver, loginButton);
	}
}
package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class ToAddNewCustomerAndProject extends BasePage
	{
	public WebDriver driver;
	public ToAddNewCustomerAndProject (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//div[.='Add New']")
	private WebElement addNewButton;
	
	@FindBy (xpath="//div[.='+ New Customer']")
	private WebElement newCustomerBox;
	
	
	public void addNewButtonMethod() throws InterruptedException
	{
		waitVisibilityofElement(driver, addNewButton);
		javascriptHighlightElement(driver, addNewButton);
		javascriptClick(driver, addNewButton);
				
	}
	
	public void newCustomerBoxMethod() throws InterruptedException
	{
		waitVisibilityofElement(driver, newCustomerBox);
		javascriptHighlightElement(driver, newCustomerBox);
		javascriptClick(driver, newCustomerBox);
	}
	
	
	}

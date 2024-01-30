package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class ActiTimeCreateNewCustomerPage extends BasePage implements AutoConstant

{
	WebDriver driver;
	
	public ActiTimeCreateNewCustomerPage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	
	  @FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	  private WebElement EnterCustomerNameTextfield;
	  
	  @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	  private WebElement EnterCustomerDescriptionTextfield;
	  
	  @FindBy(xpath="//div[.='Create Customer']")
	  private WebElement CreateCustomerButton;

	  
	  public void customerNameTextfieldMethod () throws Exception
	  {
		  waitVisibilityofElement(driver,EnterCustomerNameTextfield);
		  javascriptHighlightElement(driver, EnterCustomerNameTextfield);
		  EnterCustomerNameTextfield.sendKeys(ExcelLibrary.getStringTypeCellData1(sheet_customerdetails, 1, 0));
		  
	  }
	  
	  public void customerDescriptionMethod() throws InterruptedException, Exception
	  {
		  waitVisibilityofElement(driver, EnterCustomerDescriptionTextfield);
		  javascriptHighlightElement(driver, EnterCustomerDescriptionTextfield);
		  EnterCustomerDescriptionTextfield.sendKeys(ExcelLibrary.getStringTypeCellData1(sheet_customerdetails, 1, 1));		  
	  }
	  
	  public void createCustomerFinalSubmitButtonMethod() throws Exception 
	  {
		  waitVisibilityofElement(driver, CreateCustomerButton);
		  javascriptHighlightElement(driver, CreateCustomerButton);
		  javascriptClick(driver, CreateCustomerButton);
	  }
}

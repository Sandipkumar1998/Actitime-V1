package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import POM.ActiTimeCreateNewCustomerPage;
import POM.ActitimeLoginPage;
import POM.HomePage;
import POM.ToAddNewCustomerAndProject;
import generics.BaseTest;

public class TestCase_02LoginCreateNewCustomerLogout extends BaseTest 
{
	@Test
	public void logIn() throws Throwable, Exception
	{
		ActitimeLoginPage alp = new ActitimeLoginPage (driver);
		alp.loginMethod();
	}
	@Test(dependsOnMethods = "logIn")
	public void createCustomer() throws Exception
	{
		//To select the Task Bar
		HomePage hp = new HomePage(driver);
		hp.taskBarMethod();
		
		//To Click the addNewButton and click the addNewCustomer Box	
		ToAddNewCustomerAndProject customerandproject = new ToAddNewCustomerAndProject (driver);
		customerandproject.addNewButtonMethod();
		customerandproject.newCustomerBoxMethod();
		
		//To create new Customer by providing customer name and description
		ActiTimeCreateNewCustomerPage newCustomer = new ActiTimeCreateNewCustomerPage (driver);
			newCustomer.customerNameTextfieldMethod();
			newCustomer.customerDescriptionMethod();
			newCustomer.createCustomerFinalSubmitButtonMethod();
		
	}
	@Test(dependsOnMethods = "createCustomer" )
	public void logout() throws Exception
	{
		HomePage hp= new HomePage (driver);
		hp.logoutMethod();
	}
	
	
}

package TestCases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generics.BaseTest;
import POM.ActitimeLoginPage;
import POM.HomePage;


@Listeners(generics.ScreenShot.class)
public class TestCase_01LoginLogout extends BaseTest
{
	@Test
	public void login() throws InterruptedException, IOException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
	}

	@Test(dependsOnMethods = "login")
	public void logout() throws InterruptedException
	{
		HomePage homePage= new HomePage(driver);
		homePage.logoutMethod();
	}
}
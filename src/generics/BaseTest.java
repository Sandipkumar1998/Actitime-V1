package generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseTest implements AutoConstant
{
public static WebDriver driver;
//WebdriverWait Class
	public void waitVisibilityofElement(WebDriver driver, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	@BeforeSuite
	public void suiteExecutionStart()
	{
		Reporter.log("execution started at suite tag level", true);
	}
	
	@BeforeTest
	public void testExecutionStart()
	{
		Reporter.log("execution started at test tag level", true);
	}
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) throws IOException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
			FileInputStream fis=new FileInputStream(properties_path);
			Properties properties=new Properties();
			properties.load(fis);
			driver.get(properties.getProperty("Url"));
		}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
			FileInputStream fis=new FileInputStream(properties_path);
			Properties properties=new Properties();
			properties.load(fis);
			driver.get(properties.getProperty("Url"));
		}
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	@AfterTest
	public void testExecutionComplete()
	{
		Reporter.log("execution completed at test tag level", true);
	}
	
	@AfterSuite
	public void suiteExecutionComplete()
	{
		Reporter.log("execution completed at suite tag level", true);
	}
}
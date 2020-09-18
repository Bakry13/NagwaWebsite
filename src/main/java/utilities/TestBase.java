package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class TestBase extends AbstractTestNGCucumberTests
{
	public static WebDriver driver;
	static String driverPath = System.getProperty("user.dir")+"/resources/drivers/";
	@BeforeTest
	@Parameters("Browser")
	public static void WebInit(@Optional("Chrome") String Browser)
	{
		try {
			if(Browser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", driverPath+"ChromeDriver.exe");
				driver = new ChromeDriver();
			}
			else if(Browser.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS); //wait until loading the initial webpage
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@AfterTest
	void closedriver()
	{
		driver.quit();
	}
	//@Test
	public static void openWebsite()
	{
		driver.get("https://www.nagwa.com");
	}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.TestBase;

public class Worksheet extends TestBase
{
    //----------------------------------Worksheet Page Elements---------------------------------------
	@FindBy(xpath = "//div[@class='instances']")
	public static WebElement questionContainer; //question instances container
	//=====================================Actions==========================================
	public static int questionContainerSize()
    {
		return driver.findElements(By.xpath("//div[@class='instances']/div")).size();
    }
	//======================================================================================
	public Worksheet(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
    }
}
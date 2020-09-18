package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.TestBase;

public class Search extends TestBase
{
    //----------------------------------Search Page Elements---------------------------------------
	@FindBy(xpath = "//li[2]//div[1]//a[1]")
	public static WebElement secondResult; //second result in search page
	//=====================================Actions==========================================
	public static void clickSecondResult()
    {
		secondResult.click();
    }
	//======================================================================================
	public Search(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
    }
}
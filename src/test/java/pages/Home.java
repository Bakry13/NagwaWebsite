package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.TestBase;

public class Home extends TestBase
{
    //----------------------------------Home Page Elements---------------------------------------
	@FindBy(xpath = "//a[contains(text(),'English')]")
	public static WebElement english; //English language from drop down list
	
	@FindBy(xpath = "//body/header[@class='main-header']/div[@class='top-header']/div[@class='container']/div[@class='search']/button[1]")
	public static WebElement search; //search button

	@FindBy(id = "txt_search_query")
	public static WebElement searchTxtBox; //search button
	
	@FindBy(id = "btn_global_search")
	public static WebElement searchBtnWithTxt; //search button
	//=====================================Actions==========================================
	public static void clickEnglish()
    {
		english.click();
    }
	public static void clickSearch()
    {
		search.click();
    }
	public static void writeSearchTxt(String word)
    {
		searchTxtBox.sendKeys(word);
    }
	public static void clickGlobalSearch()
    {
		searchBtnWithTxt.click();
    }
	//======================================================================================
	public Home(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
    }
}
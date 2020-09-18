package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.TestBase;

public class Lesson extends TestBase
{
    //----------------------------------Lesson Page Elements---------------------------------------
	@FindBy(id = "preview")
	public static WebElement previewBtn;
	//=====================================Actions==========================================
	public static void clickPreview()
    {
		previewBtn.click();
    }
	//======================================================================================
	public Lesson(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
    }
}
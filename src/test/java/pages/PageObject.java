package pages;

import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import utilities.TestBase;

public class PageObject extends TestBase
{
	//--------------------------------Objects of Page Factory--------------------------------------------------
	@BeforeTest
	public static void PageFactoryObject()
	{
		Home homePageObject = new Home(driver);
		Search searchPageObject = new Search(driver);
		Lesson lessonPageObject = new Lesson(driver);
		Worksheet worksheetPageObject = new Worksheet(driver);
	}
}
